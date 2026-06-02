package capitulo_8.copa;

public class Goleiro extends Pessoa implements IPontuacao {
    private Integer golsRecebidos; 

    public Goleiro() {
    }
    
    public Goleiro(Integer codigo, String nome, Integer golsRecebidos) {
        super(codigo, nome);
        this.golsRecebidos = golsRecebidos;
    }
    
    @Override
    public Integer getPontuacao(){
        return golsRecebidos; 
    }

    public Integer getGolsRecebidos() {
        return golsRecebidos;
    }

    public void setGolsRecebidos(Integer golsRecebidos) {
        this.golsRecebidos = golsRecebidos;
    }
    
}
