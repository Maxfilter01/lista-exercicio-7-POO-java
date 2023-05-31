import java.util.Scanner;
public class ValidarCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VerificarCpf verificarCpf = new VerificarCpf();

        System.out.println("Verificação de CPF");
        System.out.println("Informe seu CPF no formato (xxx.xxx.xxx-xx): ");
        verificarCpf.setCpf(scanner.nextLine());

        
        if(verificarCpf.getCpf().charAt(3)== '.' && verificarCpf.getCpf().charAt(7)== '.' && verificarCpf.getCpf().charAt(11)== '-' && verificarCpf.getCpf().length()==14){
            System.out.println("Cpf cadastrado com sucesso.");
        }else
        System.out.println("O Cpf informado está inválido");
        scanner.close();


    }
    
}
