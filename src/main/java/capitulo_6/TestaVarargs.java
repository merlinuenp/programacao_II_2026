
package capitulo_6;


public class TestaVarargs {
    
    public static int somaInteiros( int ... v){
        int soma = 0;
        for(int i=0; i<v.length; i++){
            soma += v[i]; 
        }   
        return soma; 
    }
    
}
