  
   import javax.swing.JOptionPane;

/**
 *
 * @author anualli
 */
    public class Lab2Java {

    public static void main(String[] args) {

        //: Ask the user for Change.
        String input = JOptionPane.showInputDialog("Enter the amount of change");
        int d = Integer.parseInt(input);
        System.out.println("The user entered: " + d);

        int money = d;
        int numQuarters = 0;
        int numDimes = 0;
        int numNickels = 0;
        int numPennies = 0;

        // Compute the amount of change.
        // Calculate the number of quarters.
        numQuarters = money / 25;
        money %= 25;

        numDimes = money / 10;
        money %= 10;

        numNickels = money / 5;
        money %= 5;

        numPennies = money / 1;
        money %= 1;

        System.out.println("Quarters:" + numQuarters);
        System.out.println("numDimes:" + numDimes);
        System.out.println("numNickels:" + numNickels);
        System.out.println("numPennies:" + numPennies);

        System.out.println("Totalcoins: " + (numQuarters + numDimes + numNickels + numPennies));
    }
}
