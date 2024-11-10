package main;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Chat Application!");
        System.out.println("1. Start Chat Server");
        System.out.println("2. Start Chat Client");
        System.out.print("Please enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character

        switch (choice) {
            case 1:
                startServer();
                break;
            case 2:
                startClient();
                break;
            default:
                System.out.println("Invalid choice. Please restart the application.");
        }
    }

    private static void startServer() {
        System.out.println("Starting Chat Server...");
        ChatServer.main(new String[0]); // ChatServer 실행
    }

    private static void startClient() {
        System.out.println("Starting Chat Client...");
        ChatClient.main(new String[0]); // ChatClient 실행
    }
}
