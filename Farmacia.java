import java.util.Scanner;

public class Farmacia {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double preco;

        while (true) {
            System.out.println("Digite o preco do produto (ou digite 0 para encerrar o programa): ");
            preco = scanner.nextDouble();

            if(preco == 0){
                System.out.print("Muito obrigado por usar o programa!");
                break;
            } else {
                double calcPorcentagem = preco * 0.12;
                double novoPreco = preco + calcPorcentagem;
                double precoRound = Math.round(novoPreco);
                System.out.println("O preço com o aumento é R$" + precoRound);
            }
        }
        scanner.close();
    }
}
