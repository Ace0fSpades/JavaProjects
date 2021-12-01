package project_bank;

public class Account {
    protected int card_number[];
    protected int pin_code;
    protected String card_holder;
    protected String validation = "";
    protected String payment_system;
    protected String type_client;

    Account(String ch){
        card_holder = ch;
        for(int i = 0; i<4;i++){
            card_number[i] = (int)(Math.random()*9000+1000);
        }
        pin_code = (int)(Math.random()*900+100);
        validation += Character.forDigit((int) (Math.random() * 12 + 1), 10);
        validation += "/25";
        int r = (int)(Math.random()*101+1);
        if(r > 50) payment_system = "MasterCard";
        else payment_system = "Visa";
    }

}

class Classic extends Account{
    Classic(String ch){
        super(ch);
        type_client = "CLASSIC";
    }
}
class Premium extends Account{
    Premium(String ch){
        super(ch);
        type_client = "PREMIUM";
    }
}
class Business extends Account{
    Business(String ch){
        super(ch);
        type_client = "BUSINESS";
    }
}


