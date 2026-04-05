
package capitulo_4;

public class Lampada {
    boolean acesa;
    
    void acender(){
        acesa = true;
    }
        
    void apagar(){
        acesa = false;
    }
    
    String mostrarEstado(){
        if (acesa){
            return "acesa";
        }
        return "apagada"; 
    }
  
}
