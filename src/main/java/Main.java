import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringManipulator manipulator = new StringManipulator(input);

        manipulator.pigLatin();

        System.out.println(manipulator);
    }
}