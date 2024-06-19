import java.util.Scanner;

public class CalculadoraPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
    
        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();
        
    
        double resultado = Math.pow(base, expoente);
        
      
        System.out.print("Resultado: " + resultado);
        
        scanner.close(); 
    }
}