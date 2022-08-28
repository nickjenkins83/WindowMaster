import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        // Declare variables for height and width
        float height;
        float width;

        // Declare String variables to hold user's height and width input
        String stringHeight;
        String stringWidth;

        // Declare other vars
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // Declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        // Get input from user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();

        // Convert string values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        // Calculate area of window
        areaOfWindow = height * width;
        // Calculate perimeter of window
        perimeterOfWindow = 2 * (height + width);

        // Calculate total cost; use HARDCODED value for material cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        // Display results to user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println(" Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
}
