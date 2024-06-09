import java.util.Random;
import java.util.Scanner;

public class numbergame {

    public static void main(String[] args){

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("I have selected a no between 1-100 . Can you guess it ? ");
        System.out.println("You will have to guess within 6 tries only . ");
       //System.out.println("Random number is " + randomNumber);
        int maxAttempts = 6 ; 
        int attempts = 0;

       while(attempts < maxAttempts)
       {
        System.out.println("Enter your guess (1-100):");

        int playerGuess = scanner.nextInt();
        ++attempts;

        if (playerGuess == randomNumber){
            System.out.println("correct! You Win!");
            System.out.println("It took you " + attempts + " tries");
            if (attempts == 1){
                System.out.println("Your score is 100");
              }
              else if (attempts >= 3){
                System.out.println("Your score is 40");
              }
              else{
                System.out.println("Your score is 80");
              }
            break;
        }
        else if(randomNumber>playerGuess){
            System.out.println("Nope! Too Low . Try again.");
        }
        else{
            System.out.println("Nope! Too High . Try again.");
        }
      }
   }
}