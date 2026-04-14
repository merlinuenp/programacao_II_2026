package capitulo_6;

import capitulo_6.Ponto;

public class Robo {
    private String nome;
    private Ponto ponto; 
    
    public Robo(){
        nome = new String("");
        ponto = new Ponto(); 
    }

    public Robo(String nome, Ponto ponto) {
        this.nome = nome;
        this.ponto = ponto;
    }
    
    public void andarParaBaixo(){
        ponto.setY(ponto.getY() - 1); 
    }
    
    public void andarParaCima(){
        ponto.setY(ponto.getY() + 1); 
    }
    
    public void andarParaDireita(){
        ponto.setX(ponto.getX() + 1); 
    }
    
    public void andarParaEsquerda(){
        ponto.setX(ponto.getX() - 1); 
    }
    
    public String mostrarPosicao(){
        String posicao = "Estou na posição x: " + ponto.getX() 
                + " y: "+ ponto.getY();
        return posicao; 
    }
    
    public void teletransportar(Ponto ponto){
        this.ponto = ponto; 
    }

    public void setPonto(Ponto ponto){
        this.ponto = ponto; 
    }
    
    public Ponto getPonto(){
        return ponto; 
    }
                     
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome; 
    }
}
