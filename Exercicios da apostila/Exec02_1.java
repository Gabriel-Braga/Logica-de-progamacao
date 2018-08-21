import java.util.Scanner;
public class Exec02_1 {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um valor :");
        int a = tcl.nextInt();
        System.out.println("Digite outro valor :");
        int b = tcl.nextInt();
        System.out.println("Soma :" + (a + b));
        System.out.println("Subtracao :" + (a - b));
        System.out.println("Divisao :" + (a / b));
        System.out.println("Multiplicacao :" + (a * b));
    }
}
