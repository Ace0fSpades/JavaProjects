package lab_3;

import java.util.Scanner;

public class FurnitureShop {
    private Sofa[] arr_s = new Sofa[3];
    private Table[] arr_t = new Table[3];
    private Chair[] arr_c = new Chair[3];

    FurnitureShop(){
        int tmp = 5000;
        for(int i =0;i<3;i++){
            arr_s[i] = new Sofa("Wood",tmp);
            arr_t[i] = new Table("Rock",tmp);
            arr_c[i] = new Chair("Plastic",tmp);
            tmp += 2500;
        }
    }
    public void get_list(){
        System.out.println("List of items:\n");
        for(int j = 0;j<3;j++){
            switch(j){
                case 0:
                    System.out.println("Sofas:\n");
                    break;
                case 1:
                    System.out.println("Tables:\n");
                    break;
                case 2:
                    System.out.println("Chairs:\n");
                    break;
            }

        for(int i =0;i<3;i++){
            switch (j) {
                case 0:
                System.out.println((i+1)+": "+arr_s[i]+"\n");
                break;
                case 1:
                    System.out.println((i+1)+": "+arr_t[i]+"\n");
                    break;
                case 2:
                    System.out.println((i+1)+": "+arr_c[i]+"\n");
                    break;
            }
        }
        }
    }
    public void sell_item(String type){

        Scanner sc = new Scanner(System.in);
        switch(type){
            case "Sofa":
                System.out.println("Select number[1-3]");
                int tmp = sc.nextInt();
                switch(tmp){
                    case 1: tmp--;
                    arr_s[tmp].sold();
                    break;
                    case 2: tmp--;
                    arr_s[tmp].sold();
                    break;
                    case 3: tmp--;
                    arr_s[tmp].sold();
                    break;
                }
                break;
            case "Table":
                System.out.println("Select number[1-3]");
                int tmp_2 = sc.nextInt();
                switch(tmp_2){
                    case 1: tmp_2--;
                        arr_t[tmp_2].sold();
                        break;
                    case 2: tmp_2--;
                        arr_t[tmp_2].sold();
                        break;
                    case 3: tmp_2--;
                        arr_t[tmp_2].sold();
                        break;
                }
                break;
            case "Chair":
                System.out.println("Select number[1-3]");
                int tmp_3 = sc.nextInt();
                switch(tmp_3){
                    case 1: tmp_3--;
                        arr_c[tmp_3].sold();
                        break;
                    case 2: tmp_3--;
                        arr_c[tmp_3].sold();
                        break;
                    case 3: tmp_3--;
                        arr_c[tmp_3].sold();
                        break;
                }
                break;

        }
    }
}
