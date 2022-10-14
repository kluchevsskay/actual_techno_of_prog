import java.util.Scanner;

public class First {
    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in);
        double firstNum = console.nextDouble();
        double secondNum = console.nextDouble();
        double res = firstNum + secondNum;
        if (res >= 20) {
            System.out.println(3 * (firstNum * firstNum));
        } else{
            System.out.println(secondNum * secondNum * secondNum);
        }

    }
}
