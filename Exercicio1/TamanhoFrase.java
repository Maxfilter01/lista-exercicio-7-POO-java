import java.util.Scanner;
public class TamanhoFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Frase frase = new Frase();

    System.out.println("Comparação entre duas Strings");

    System.out.println("Digite a primeira frase");
    frase.setFraseUm(scanner.nextLine());

    System.out.println("Digite a segunda frase");
    frase.setFraseDois(scanner.nextLine());
    scanner.close();
    System.out.println("\nFrase 1: " + frase.getFraseUm());

    System.out.println("Frase 2: " + frase.getFraseDois());

    System.out.println("\nTamanho da frase 1: " + frase.getFraseUm() + ":" + frase.getFraseUm().length());

    System.out.println("Tamanho da frase 2: " + frase.getFraseDois() + ":" + frase.getFraseDois().length());
    
    if(frase.getFraseUm().length() == frase.getFraseDois().length()){

        System.out.println("As frases tem o mesmo comprimento.");
    }
    else{
        System.out.println("As frases tem comprimentos diferentes.");
    }
    if(frase.getFraseUm().equals(frase.getFraseDois())){
        System.out.println("O conteúdo das frase são iguais.");
    
    }
    else{
        System.out.println("O conteúdo das frase são diferentes.");
    }

    }
    
}
