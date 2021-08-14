import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        String accountName;
        double startBalance;

        System.out.printf("%24s\n","BankApp v1.0");
        System.out.println("=====================================");
        System.out.println("Please enter your details below.");
        System.out.print("Account Name: ");
        accountName = scanner.nextLine();
        System.out.print("Starting Balance: ");
        startBalance = scanner.nextDouble();
        Account account = new Account(accountName,startBalance);
        while(!quit){
            printMainMenu();
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("Account Name: %s\nAccount Balance: $%.2f\n",account.getAccountName(),
                            account.getAccountBal());
                    break;
                case 2:
                    System.out.println("Enter amount to be added: ");
                    account.addFunds(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter amount to be transferred: ");
                    account.transferFunds(scanner.nextDouble());
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        scanner.close();
    }

    public static void printMainMenu(){
        System.out.printf("%24s\n" +
                "=====================================\n" +
                "Please select an option:\n" +
                "1 - Check Balance\n" +
                "2 - Add Funds\n" +
                "3 - Transfer Funds\n" +
                "4 - Exit\n" +
                "=====================================\n" +
                "Choice: ","BankApp v1.0");
    }
}