
public class Substring {
    public static void main(String[] args) {

        String texto = "Uma frase qualquer";


        
        
        if (texto.length() > 0) {
            String substring = texto.substring(0, texto.length() - 1);
            System.out.println("Substring sem o último caractere: " + substring);
        } else {
            System.out.println("A frase está vazia");
        }
    }
}
