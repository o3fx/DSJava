package Unit05;
import javax.swing.JOptionPane;
public class Dialogue {
    public static void main(String[] args){
    String firstName = JOptionPane.showInputDialog("Enter your first name:");

    String reply = JOptionPane.showInputDialog("Enter a number (integer): ");
    int num1 = Integer.parseInt(reply);
    String reply1 = JOptionPane.showInputDialog("Enter a second number (integer): ");
    int num2 = Integer.parseInt(reply1);

    int sum = num1 * num2;
    JOptionPane.showMessageDialog(null,"Your first name is: " + firstName + "If you multiply these numbers you will get: " + sum);
    }
}
