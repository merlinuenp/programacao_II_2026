
package capitulo_7;

public class Robo {
    private Integer codigo;
    private String nome;
    private Ponto localizacao;

    public Robo() {
        this.codigo = 0;
        this.nome = "";
        this.localizacao = new Ponto();
    }

    public Robo(Integer codigo, String nome, Ponto localizacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.localizacao = localizacao;
    }
    
    public void andarParaFrente(){
        localizacao.setX(localizacao.getX() + 1);
    }
    
    public void andarParaTras(){
        localizacao.setX(localizacao.getX() - 1);
    }
    
    public void andarParaCima(){
        localizacao.setX(localizacao.getY() + 1);
    }
    
    public void andarParaBaixo(){
        localizacao.setX(localizacao.getY() - 1);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ponto getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Ponto localizacao) {
        this.localizacao = localizacao;
    }
    
    
    
}
