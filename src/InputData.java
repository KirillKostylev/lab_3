import java.util.Scanner;

public class InputData {
    public static int inputIntegerData(String txt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(txt);
        int number = scanner.nextInt();
        return number;
    }
}
