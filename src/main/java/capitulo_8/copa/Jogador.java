package capitulo_8.copa;

public class Jogador extends Pessoa implements IPontuacao {
    private Integer golsMarcados; 

    public Jogador() {
    }

    public Jogador(Integer codigo, String nome, Integer golsMarcados) {
        super(codigo, nome);
        this.golsMarcados = golsMarcados;
    }
    
    @Override
    public Integer getPontuacao(){
        return golsMarcados; 
    }

    public Integer getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(Integer golsMarcados) {
        this.golsMarcados = golsMarcados;
    }
    
    
    
}
