package capitulo_8.copa;


public class Time implements IPontuacao {
    private String nome;
    private Pais pais; 
    private Integer pontos;

    public Time(String nome, Pais pais, Integer pontos) {
        this.nome = nome;
        this.pais = pais; 
        this.pontos = pontos; 
    }
        
    @Override
    public Integer getPontuacao() {
        return pontos; 
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

}
