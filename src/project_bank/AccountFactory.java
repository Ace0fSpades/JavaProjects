package project_bank;


enum AccountType{
    CLASSIC,
    PREMIUM,
    BUSINESS
}

public class AccountFactory {
    public Account createAccount(AccountType type, String name){
        Account acc = null;
        switch(type){
            case CLASSIC:
                acc = new Classic(name);
                break;
            case PREMIUM:
                acc = new Premium(name);
                break;
            case BUSINESS:
                acc = new Business(name);
                break;
        }
        return acc;
    }
}
