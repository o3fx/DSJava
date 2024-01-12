package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011;
import java.util.Scanner;
public class Conversation

{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String nameInt = in.next();
      System.out.println("Hello, " + nameInt);
      System.out.print("How old are you? ");
      int oldInt = in.nextInt();
      oldInt++;
      System.out.println("Next year, you will be " + oldInt);
   }
}

