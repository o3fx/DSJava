import java.util.Scanner;    
public class test {    
     public static void main(String args[]){   
            // Initialize Scanner object  
            Scanner scan = new Scanner("missing");  
            //Initialize the string delimiter  
            scan.useDelimiter("/");  
            //Printing the tokenized Strings  
            while(scan.hasNext()){  
                System.out.println(scan.next());  
            }  
            scan.close();   
          }    
}     