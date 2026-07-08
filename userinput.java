import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name = input.nextLine();
        System.out.println("Welcome " + name );
        System.out.print(name + " Also Enter Your Age:");
        int Age = input.nextInt();
        System.out.println("You are "+ Age + "Years Old, Great!");
    }
}
