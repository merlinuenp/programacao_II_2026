package capitulo_13;


public class Caixa <T> {
    private T conteudo; 

    public Caixa(T conteudo) {
        this.conteudo = conteudo;
    }

    public Caixa() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    
    
    public static void main(String[] args) {
        Caixa<String> c = new Caixa();
        c.setConteudo("caixa");
        
        Caixa<Integer> c2 = new Caixa();
        c2.setConteudo(12);
    }
    
    
}
