import java.util.Scanner;
public class CaixaDeBanco {
    protected float saldo;
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        CaixaDeBanco cliente = new CaixaDeBanco();
        int varc = 0; 
        while(varc != 4) {
            gerarCaixa();
            varc = tcl.nextInt();
            switch(varc) {
                case 1:
                    System.out.println("Quanto quer sacar ?");
                    cliente.sacar(tcl.nextFloat());
                    break;
                case 2:
                    System.out.println("Quando quer depositar ?");
                    cliente.depositar(tcl.nextFloat());
                    break;
                case 3:
                    cliente.verSaldo();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("ERRO: DIGITE UM VALOR VÁLIDO!");
            }
        }
    }
    public static void gerarCaixa() {
        System.out.println("--------------Caixa de Banco--------------");
        System.out.println("1- Sacar");
        System.out.println("2- Depositar");
        System.out.println("3- Ver Saldo");
        System.out.println("4- Sair");
        System.out.println("------------------------------------------");
    }
    public void sacar(float s) {
        saldo-=s;
    }
    public void depositar(float d) {
        saldo+=d;
    }
    public void verSaldo() {
        System.out.println("Seu saldo é de R$ "+ saldo);
    }
}
