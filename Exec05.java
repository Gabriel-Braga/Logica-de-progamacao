import java.util.Scanner;
public class Exec05 {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um valor em celsius :");
        float celsius = tcl.nextFloat();
        float farehn = 1.8f * celsius + 32;
        System.out.println("Esse valor convertido em fahrenheit é : " + farehn);
    }
}
