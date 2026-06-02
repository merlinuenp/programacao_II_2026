package capitulo_8.interfaces;
 
import org.junit.jupiter.api.Test;


public class OrdenadoraTest {
    
    public OrdenadoraTest() {
    }

       
    @Test
    public void testOrdenarPorCodigo() {      
        Ordenavel produtos[] = new Produto[5];
        produtos[0] = new Produto(25, "Fosforo", 2.5);
        produtos[1] = new Produto(12, "Isqueiro", 9.5);
        produtos[2] = new Produto(17, "Espingarda", 1200.00);
        produtos[3] = new Produto(14, "Polvora", 25.00);
        produtos[4] = new Produto(18, "Vara de pesca", 37.80);
        
        Ordenadora.ordenarPorNome(produtos);
        
        for(Ordenavel p : produtos){
            System.out.println(p.getCodigo() + " " + p.getNome());
        }
    }
    
    
    
    @Test
    public void testDefault(){
        Fornecedor f = new Fornecedor();
        System.out.println();
    }
    
}
