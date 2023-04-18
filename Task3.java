import java.util.*;

import javax.swing.SpinnerDateModel;
class Task3{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> list = new ArrayList<>();
    static int tAmount = 10000;
    static String friend = "Sam";

    public static void activity(){

        System.out.println("You have "+tAmount+"$ ");
        System.out.println();
        System.out.println("1. Transection History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer to your Friend");
        System.out.println("5. Quit");
        int input = sc.nextInt();

        switch(input){
            case 1 : tsHist();
            break;
            case 2 : withdraw();
            break;
            case 3 : deposit();
            break;
            case 4: transfer();
            break;
            case 5 : System.out.println("Bye Bye !!"); return;

            default : System.out.println("Enter Valid Choice");
            break;
        }
    }

    //Shows Transection History
    public static void tsHist(){
        System.out.println();

        if(list.size() == 0 ) {
            System.out.println("No Transection Occured yet");
            System.out.println();
            activity();
            return;
        }else{
            System.out.println("****Transection History****");
            for(int i = 0 ; i < list.size() ; i++){
                System.out.println(list.get(i));
            }
            System.out.println();
            activity();
            return;
        }
    }

    //For withdraw money
    public static void withdraw(){
        System.out.println();

        System.out.print("Enter the amount You Want to Withdraw : ");
        int wid = sc.nextInt();
        tAmount-= wid;
        System.out.println(wid+ "$ Withdrawed " + tAmount + "$ left in account");
        list.add(">> "+wid+ "$ Withdrawed " + tAmount + "$ left in account");
        activity();
        return;
    }
    
    // For deposit money
    public static void deposit(){
        System.out.println();

        System.out.print("Enter the amount You Want to Deposit : ");
        int dep = sc.nextInt();
        tAmount += dep;
        System.out.println(dep+ "$ Deposit " + tAmount + "$ left in account");
        list.add(">> "+dep+ "$ Deposit " + tAmount + "$ left in account");
        activity();
        return;
    }

    //For transfer Money
    public static void transfer(){
        System.out.println();

        
        System.out.println("Enter amount : ");
        int amt = sc.nextInt();
        tAmount -= amt;
        System.out.println(amt+"$ Has been Transfered To "+ friend + " account, Total amount Left : "+tAmount);
        list.add(">> "+amt+"$ Has been Transfered To "+ friend + " account, Total amount Left : "+tAmount);
        activity();
        return;
    }

    public static void main(String[] args) {
        
        int cnt = 0;
        String uId = "abc";
        int pin = 1234;
        System.out.print("Enter User ID : ");
        String id = sc.nextLine();
        while(true){
            if(cnt == 3){
                System.out.println("To many failed attempts! Bye..");
                break;
            }
            if(id.equals(uId)){
                System.out.print("Enter Your Pin : ");
                int  pn = sc.nextInt();
                if(pn == pin){
                    System.out.println(); // blanck spaces for clean look
                    System.out.println("Wlecome To account");
                    System.out.println();
                    activity();
                    break;
                }else{
                    cnt++;
                    System.out.println("Wrong pin! Try again : ");
                }
            }else{
                cnt++;
                System.out.print("Wrong User Id ! Try again : ");
                System.out.print("Enter User ID : ");
                id = sc.nextLine();
            }
        }
    }
}
 