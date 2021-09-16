package lab_3;

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
}
