/**
 * loop
 */
/**
 * loop
 */
import java.util.Random;
import java.util.Scanner;



public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = input.nextLine();
        if (userName.isEmpty()) {
            System.out.println("You didn't enter your name");

        } else {
            System.out.println("Welcome \t" + userName);
        }

        /*
         * now i am going to create button logic that will ask the user weather he or
         * she went to start the game
         */

        /// now i am going to take a key variable that will take an input
        /// from the user
        int key;
        System.out.println("Enter your chose option :");
        key = input.nextInt();

        switch (key) {
            case 0:
                System.out.println("You pressed No !!");
                break;
            case 1:
                System.out.println("You pressed Yes !!");
                break;
            default:
                break;
        }
        if (key == 0) {

        } else if (key == 1){
            System.out.println("Now the game is Started !!!");
            int i = 0;
            while(i<5){
                /// now i am going to genarate the rendom number.....///
                int renNumber = new Random().nextInt(10);
                System.out.println("Enter your guessing number for the game:");
                int userNumber = input.nextInt();
                if (userNumber > renNumber) {
                    System.out.println("guess smaller number!!!");
                    i++;
                    continue;
                } else if (userNumber < renNumber) {
                    System.out.println("guess larger number");
                    i++;
                    continue;
                } else if(userNumber == renNumber){
                    System.out.println("Congrats your win");
                    i++;
                    break;
                }
            }
            /* if the index nmber is less then the 5 number or not if its bigher 
            then the 5 numbe then it will throw an mssage by saying youer game is over */
            if (i >=5) {
                System.out.println("Your game is Over");
            }else{
                System.out.print("The time you played :"+i);
            }
            

        }

    }
    
}
