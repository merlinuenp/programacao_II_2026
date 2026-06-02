package capitulo_8.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Ordenadora {
    
  
    public static void ordenarPorNome(Ordenavel objetos[]){
        Arrays.sort(objetos, Comparator.comparing(Ordenavel::getNome));
    }
    
    public static void ordenarPorCodigo(Ordenavel objetos[]){
         Arrays.sort(objetos, Comparator.comparing(Ordenavel::getCodigo));
    }
    
}
