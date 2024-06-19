import java.util.Random;

public class GeradorSenha {
    public static void main (String[] args){

        Random random = new Random();
        
        
        int comprimentoSenha = 5 + random.nextInt(6); 
     
        StringBuilder senha = new StringBuilder();
        
       
        for (int i = 0; i < comprimentoSenha; i++) {
            int digito = random.nextInt(10); 
            senha.append(digito);
        }
        

        System.out.println("Senha gerada: " + senha.toString());
    }
}

