
package intro;

class CaixaSom {
    boolean ligada;   // atributos
    int volume; 
    String marca; 
    
    // construtor 
    CaixaSom(){
        ligada = true;  // tipo primitivo 
        volume = 0; 
        marca = "";
    }
    
    void ligar(){
        ligada = true; 
    }
    
    void desligar(){
        ligada = false; 
    }
    
    void aumentarVolume(){
        volume++; 
    }
    
    void diminuirVolume(){
        volume--; 
    }
}
