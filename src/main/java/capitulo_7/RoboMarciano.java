
package capitulo_7;


public class RoboMarciano extends Robo {
    
    public RoboMarciano(Integer codigo, String nome, Integer x, Integer y){
        super(codigo, nome, x, y);       
    }
    
    public void teletransportar(){
    
}

   @Override
    public String mostrarPosicao() {
        return "Sou um robô marciano na posição: " + getX() +","+getY();
    } 
    
}
