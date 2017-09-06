import java.util.Scanner;

public class userNamePrompt
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.println("Enter your username");
        username = sc.next();

        System.out.println("Enter your password");
        password = sc.next();

        System.out.println("Hello " + username + ", Welcome to CSC200 class! and your password is " + password + ".");

    }

}