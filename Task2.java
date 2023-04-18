import java.util.*;

class Task2{

    static Random rand = new Random();
    static int randNo = rand.nextInt(0,100);
    static int guess = 9;


    public static void guessNo(int n){
        Scanner sc = new Scanner(System.in);
        int no;
        if(guess == 0){
            System.out.println("Sorry OUT of guesses");
            return;
        }
        if(n==randNo){
            System.out.println("Congratulations YOU Won");
            System.out.println("YOU scored "+((guess*100)/6)+" /100");
            return;
        }if(n<randNo){
            System.out.print("Try Greater Number : ");
            guess--;
            no = sc.nextInt();
            guessNo(no);
        }else{
            System.out.print("Try Smaller Number : ");
            guess--;
            no = sc.nextInt();
            guessNo(no);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************");
        System.out.println("You Have 10 Guesses ;)");
        System.out.print("Enter a Number : ");  
        int n = sc.nextInt();
        guessNo(n);
    }
}