package capitulo_8.interfaces;

import java.time.LocalDate;


public interface Ordenavel {
    
    
    public Integer getCodigo();
    
    public String getNome(); 
    
    
    
    
    
    
    
    
    
    
    
    
    default LocalDate obterData(){
        return LocalDate.now(); 
    }
      
}
