
import java.util.Scanner;

public class GameNumber {

    public static void main(String [] args){
        int randomNumber = (int) (Math.random( ) * 100 ) + 1;
        System.out.println(" I have randomly number from 1 to 100");
        System.out.println("Choos one :");
        Scanner scane = new Scanner(System.in);
        for( int i = 10; i >0 ; i--){
            System.out.println(" You still have " +  i +  " choices left,choose again: ");
            int guess = scane.nextInt();
            System.out.println(guess);
        }
    }
}
