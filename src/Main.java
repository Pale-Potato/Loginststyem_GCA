import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

void main() {
    Scanner input = new Scanner(System.in);
    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm"); //kun vis timer og minutter

    int usernamePlacement;
    int passwordPlacement;
    String newUsername;
    String newPassword;
    int menuChoice;

    String[] usernames = {"Alice", "Bob", "Charlie"};
    String[] passwords = {"pass1", "pass2", "pass3"};

    do {
        Methods.menuPrint();
        menuChoice = input.nextInt();
        input.nextLine(); //fikser input int-String fejl


        if (menuChoice == 2) {
            Methods.changeArray(usernames, passwords);

            System.out.println("Indtast nyt brugernavn: ");
            newUsername = input.nextLine();
            System.out.println("Indtast nyt kodeord:");
            newPassword = input.nextLine();

            Methods.addNewUser(usernames, passwords, newUsername, newPassword);

        } else if (menuChoice == 1) {

            do {
                System.out.println("Indtast brugernavn:");
                String inputUsername = input.nextLine();

                usernamePlacement = Methods.linearSearch(usernames, inputUsername);

                if (usernamePlacement == -1) {
                    System.out.println("Ugyldigt brugernavn");
                    System.out.println("Prøv igen");
                }
            } while (usernamePlacement == -1);

            int loginAttempts = 3;


            do {
                System.out.println("Indtast kodeord:");
                String inputPassword = input.nextLine();

                passwordPlacement = Methods.linearSearch(passwords, inputPassword);


            if (usernamePlacement == passwordPlacement) {
                Methods.loginSuccesPrint();
                break;
            } else {
                loginAttempts--;
                Methods.loginFailedPrint(loginAttempts);
            }

            } while (loginAttempts > 0);

            if (loginAttempts == 0 && usernamePlacement != passwordPlacement) {
                System.out.println("Konto låst.");
            }
        } else {
            System.out.println("Program afsluttet.");
        }
    } while (menuChoice != 1 && menuChoice !=3);

    }



