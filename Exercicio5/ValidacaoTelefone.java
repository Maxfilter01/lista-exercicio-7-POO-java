import java.util.Scanner;
public class ValidacaoTelefone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Telefone Telefone = new Telefone();

        System.out.println("Digite seu telefone:");
        Telefone.setNumero(scanner.nextLine());

        Telefone.validarCorrigirNumero();

        scanner.close();
    
    }
}