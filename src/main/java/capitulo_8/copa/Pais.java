package capitulo_8.copa;

public class Pais {
    private String nome;
    private String continente; 

    public Pais() {
    }

    public Pais(String nome, String continente) {
        this.nome = nome;
        this.continente = continente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
      
}
