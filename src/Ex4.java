import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter the first word:");
            System.out.println("Enter the second word:");
            String string = scanner1.nextLine();
            String string1 = scanner2.nextLine();
            System.out.println("the first word" +  string);
            System.out.println("the second word" +  string1);
            System.out.println(string.equals(string1));


    }
}


