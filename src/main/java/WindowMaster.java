import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        // Declare variables for height and width
        float height;
        float width;
        int numWindows;

        // Declare String variables to hold user's height and width input
        String stringHeight;
        String stringWidth;
        String stringWindowCost;
        String stringTrimCost;

        // Declare other vars
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        float windowCost;
        float trimCost;

        // Declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        // Get input from user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        System.out.println("What is the cost for windows?");
        stringWindowCost = myScanner.nextLine();
        System.out.println("What is the cost for trim?");
        stringTrimCost = myScanner.nextLine();
        System.out.println("How many windows are getting done?");
        numWindows = Integer.parseInt(myScanner.nextLine());

        // Convert string values of height and width and costs to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        windowCost = Float.parseFloat(stringWindowCost);
        trimCost = Float.parseFloat(stringTrimCost);

        // Calculate area of window
        areaOfWindow = height * width;
        // Calculate perimeter of window
        perimeterOfWindow = 2 * (height + width);

        // Calculate total cost;
        cost = ((windowCost * areaOfWindow) + (trimCost * perimeterOfWindow)) * numWindows;

        // Display results to user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println(" Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
}
