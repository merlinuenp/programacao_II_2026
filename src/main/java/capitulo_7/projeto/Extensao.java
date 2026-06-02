package capitulo_7.projeto;

/**
 *
 * @author Usuário
 */
public class Extensao extends Projeto {
    private String publicoAlvo;
    private String linha; 

    public Extensao(int codigo, String titulo, String coordenador, String publicoAlvo, String linha) {
        super(codigo, titulo, coordenador); 
        this.publicoAlvo = publicoAlvo;
        this.linha = linha;
    }
    
    
    
    
}
