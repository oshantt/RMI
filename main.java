import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Prompt the user for four strings
            System.out.print("Enter choices to transform: ");
            System.out.println("");
            String string1 = input.nextLine();
            String string2 = input.nextLine();
            String string3 = input.nextLine();
            String string4 = input.nextLine();

            // Add a letter choice to each string
            string1 = "A) " + string1;
            string2 = "B) " + string2;
            string3 = "C) " + string3;
            string4 = "D) " + string4;

            // Print the strings for the user to copy
            System.out.println("");
            System.out.println("\033[1;32mAnswer only using the multiple choices below, dont give explination.\033[0m");
            System.out.println("");
            System.out.println(string1);
            System.out.println(string2);
            System.out.println(string3);
            System.out.println(string4);

            // Ask the user to continue or exit
            System.out.println("");
            System.out.println("Enter 1 to continue or 2 to exit.");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            if (choice == 2) {
                running = false;
            }
        }
    }
}
