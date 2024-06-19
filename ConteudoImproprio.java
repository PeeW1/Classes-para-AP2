import java.util.Scanner;

public class ConteudoImproprio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine(); 
        
        
        if (frase.toLowerCase().contains("sexo") || frase.toLowerCase().contains("sexual")) {
            System.out.println("Conteúdo impróprio");
        } else {
            System.out.println("Conteúdo liberado");
        }
        
        scanner.close(); 
    }
}

