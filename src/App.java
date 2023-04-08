import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double r = sc.nextDouble();
        double a = 3.14 * Math.pow(r, 2);

        System.out.print("A área é " + a + "cm");

        sc.close();

    }

}
