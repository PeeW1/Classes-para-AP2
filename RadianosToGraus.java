import java.util.Scanner;

public class RadianosToGraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor em radianos: ");
        double radianos = scanner.nextDouble();
        
        double graus = Math.toDegrees(radianos);
        
        System.out.printf("O valor em graus é: %.2f%n", graus);
        
        scanner.close(); 
    }
}