package capitulo_7;

public class Pixel extends Ponto {
    private String cor; 
    
    public Pixel(){
        super(0,0);
        cor = "preta";
    }
    
    public Pixel(int x, int y){
        super(x, y);
        cor = "preta"; 
    }
    
    public Pixel(int x, int y, String cor){
        super(x, y);
        this.cor = cor; 
    }
    
    @Override
    public String printar(){
        return "Sou um pixel na posição [" + getX() + "," + getY()+ "] e tenho a cor "+ cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
