package basics;
import java.util.Random;
import java.util.Scanner;

class Guess{
  public int number;
  public int inputUser;
  public int noOfGuess;
   public Guess(){
     Random ran=new Random();
     this.number=ran.nextInt(100);
   }
   public void UserInput(){
    System.out.println("Guess the number: ");
    Scanner scan=new Scanner(System.in);
    inputUser=scan.nextInt();
   } 
   public boolean isCorrect(){
    noOfGuess++;
    if(inputUser==number)
    {System.out.println("Your guess is correct ");
    System.out.println("Your Score is "+noOfGuess);
    System.out.println("Do you want to play another Round (y or n): ");
    return true;
    }
     
    else if(inputUser<number)
    {
        System.out.println("Too Low , Try again");
    }
    else if(inputUser>number)
    {
        System.out.println("Too High , Try again");
    }
    return false; 
   
   }
}
public class GuessNumber {
    public static void main(String[] args) {
        Guess g= new Guess();
        boolean bg=false;

        while(!bg)
        {
            g.UserInput();
            bg=g.isCorrect();
        }
        
    }
}
