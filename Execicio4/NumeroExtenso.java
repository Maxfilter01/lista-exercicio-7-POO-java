import java.util.Scanner;
public class NumeroExtenso{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FuncaoNumero funcaonumero = new FuncaoNumero();

        System.out.println("Digite um número: ");
        funcaonumero.setNumero(scanner.nextInt());
        funcaonumero.numeroExtenso();
        scanner.close();
        
    }
}