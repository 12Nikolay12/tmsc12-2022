import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String name = in.nextLine();
        System.out.println("Welcome to java, " + name);
        in.close();

    }
}
