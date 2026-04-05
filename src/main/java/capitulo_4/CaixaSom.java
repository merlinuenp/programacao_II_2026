
package capitulo_4;

class CaixaSom {
    boolean ligada;   
    int volume; 
    
    // construtor 
    CaixaSom(){
        ligada = false;   
        volume = 0;
    }
    
    void ligar(){
        ligada = true; 
    }
    
    void desligar(){
        ligada = false; 
        volume = 0; 
    }
    
    void aumentarVolume(){
        if (ligada){
           volume++;  
        }     
    }
    
    void diminuirVolume(){
        if (ligada){
            if (volume > 0){
                volume--; 
            }
        }      
    }
    
}
