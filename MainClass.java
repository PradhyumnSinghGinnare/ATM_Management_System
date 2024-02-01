import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin=123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!!!");
        System.out.println("Enter ATM number:");
        int atmNumber = in.nextInt();
        System.out.println("Enter Pin:");
        int pin = in.nextInt();

        if((atmnumber == atmNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("1. View Available Balance\n 2. Withdraw Amount\n 3. Deposit Amount\n 4. View Ministatement\n 5. Exit");
                System.out.println("Enter Your Choice : ");
                int ch = in.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter Amount to withdraw : ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit : ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch==4){
                    op.viewMiniStatement();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card!!\nThank you for using ATM Machine!!");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter correct choice!!!");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM Number or Pin!!!");
            System.exit(0);
        }
    }
}
