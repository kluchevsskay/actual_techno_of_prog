import java.util.Scanner;

public class MathSeries {
    public static void main(String[] args) {
        Scanner cnsl = new Scanner(System.in);
        double x = cnsl.nextDouble();
        double res = 0;
        double summand = -1;
        double need = 0;
        boolean flag = false;
//        int i = 100;

//  здесь я неправильно поняла условие задачи и делала какую-то ерунду грубо говоря

//        while (!flag) {
//            double need = ((4 * i - 3) * Math.pow(x, i)) / (4 * i);
//            res += need;
//            if (res == (1 - 1 / (Math.pow((1 + x), 0.25)))) {
//                flag = true;
//                System.out.println(i);
//            }
//            i++;
//        }
//        System.out.println("Конец проверки");

        for (int i = 1; i <= 20; i++) {
            need = ((4 * i - 3) * Math.pow(x, i)) / (4 * i);
            summand *= -need;
//            System.out.println(res + "+" + summand);
            res += summand;
        }
        System.out.println(res);
        System.out.println(1 - 1 / (Math.pow((1 + x), 0.25)));
        System.out.println("Тут чуть-чуть не сходятся значения. Причина мне неизвестна. Я честно пыталась решить.");
    }
}
