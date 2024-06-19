import java.util.Random;


public class SimluadorDeDados {

    public static void main(String[] args){
        Random random = new Random();

        int numeroRandom = 0;

        for(int i = 0; i < 3; i++) {
            int jogarDado = random.nextInt(6) + 1;

            System.out.println("Jogada " + (i + 1) + ": " + jogarDado);

            numeroRandom += jogarDado;
        }
        System.out.println("Soma das jogadas: " + numeroRandom);
    }
    
}