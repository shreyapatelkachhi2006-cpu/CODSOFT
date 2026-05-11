import java.util.Scanner;

public class RuleBasedChatBot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String message;

        System.out.println("================================");
        System.out.println("      RULE BASED CHATBOT");
        System.out.println("================================");
        System.out.println("Bot : Hello! I am your chatbot.");
        System.out.println("Bot : Type 'exit' to stop.\n");

        while (true) {

            System.out.print("You : ");
            message = input.nextLine().toLowerCase();

            // Greeting
            if (message.contains("hi") || message.contains("hello")) {
                System.out.println("Bot : Hello! How can I help you?");
            }

            // Asking name
            else if (message.contains("your name")) {
                System.out.println("Bot : My name is RuleBot.");
            }

            // Asking about AI
            else if (message.contains("ai")) {
                System.out.println("Bot : AI means Artificial Intelligence.");
            }

            // Asking about java
            else if (message.contains("java")) {
                System.out.println("Bot : Java is an object-oriented programming language.");
            }

            // Asking time
            else if (message.contains("time")) {
                System.out.println("Bot : Sorry, I cannot tell real time now.");
            }

            // Thank you
            else if (message.contains("thank")) {
                System.out.println("Bot : You're welcome!");
            }

            // Exit condition
            else if (message.contains("exit")) {
                System.out.println("Bot : Goodbye! Have a nice day.");
                break;
            }

            // Default reply
            else {
                System.out.println("Bot : Sorry, I don't understand.");
            }
        }
        if (message.contains("hi") || message.contains("hello")) {
    System.out.println("Bot : Hello! How can I help you?");
} 

else if (message.contains("how are you")) {
    System.out.println("Bot : I am fine. How are you?");
}

        input.close();
    }
}