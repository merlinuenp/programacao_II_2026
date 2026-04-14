package capitulo_6;

public class Ponto {
    private int x;
    private int y; 
  
    public Ponto(){
       x = 0;
       y = 0; 
    }
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;               
    }
    
    public void setX(int novoX){
        this.x = novoX; 
    }
  
    public int getX(){
        return x;
    }
    
    public void setY(int novoY){
        this.y = novoY; 
    }
    
    public int getY(){
        return y;
    }
}
