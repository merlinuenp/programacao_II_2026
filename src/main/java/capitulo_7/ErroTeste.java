package capitulo_7;

public class ErroTeste {

    public static void main(String[] args) {
        int erro = 1;

        // código que pode gerar um erro 
        //.. 
        if (erro == 1) {
            System.out.println("Erro de compilação");
        }
        if (erro == 2) {
            System.out.println("Erro de divisão");
        }
        if (erro == 3) {
            System.out.println("Erro de entrada/saída");
        }
        if (erro == 4) {
            System.out.println("Erro de casting");
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        

        if (erro == Erro.ERRO_COMPILACAO) {
            System.out.println("Erro de compilação");
        }
        if (erro == Erro.ERRO_DIVISAO) {
            System.out.println("Erro de divisão");
        }
        if (erro == Erro.ERRO_ENTRADA_SAIDA) {
            System.out.println("Erro de entrada/saída");
        }
        if (erro == Erro.ERRO_CASTING) {
            System.out.println("Erro de casting");
        }

    }

}
