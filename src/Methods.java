import java.util.Arrays;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Methods {

    public static int linearSearch(String[] usernames, String key) {
        for (int i = 0; i < usernames.length; i++) {
            if (key.equals(usernames[i]))
                return i;
        }
        return -1;
    }

    public static void changeArray(String[] usernames, String[] passwords){
        usernames = Arrays.copyOf(usernames, usernames.length + 1);
        passwords = Arrays.copyOf(passwords, passwords.length + 1);
    }

    public static void addNewUser(String[] usernames, String[]passwords, String newUsername, String newPassword) {
        usernames[usernames.length - 1] = newUsername;
        passwords[passwords.length - 1] = newPassword;
    }

    public static void menuPrint(){
        System.out.println("==============================");
        System.out.println("      1. Login");
        System.out.println("      2. Opret ny bruger");
        System.out.println("      3. Afslut program");
        System.out.println("==============================");

    }

    public static void loginSuccesPrint(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm"); //kun vis timer og minutter
        System.out.println("==============================");
        System.out.println("        Login succes!");
        System.out.println("       Logget ind kl. " + LocalTime.now().format(format));
        System.out.println("==============================");

    }

    public static void loginFailedPrint(int attempts){
        System.out.println("==============================");
        System.out.println("      Forkert kodeord");
        System.out.println("      Forsøg tilbage: " + attempts);
        System.out.println("==============================");
    }




}
