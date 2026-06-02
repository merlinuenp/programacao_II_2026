package capitulo_7.projeto;

import org.junit.jupiter.api.Test;


public class ProjetoPesquisaTest {
    
    public ProjetoPesquisaTest() {
    }

    @Test
    public void testConstructor() {
        Pesquisa p = new Pesquisa();
        p.setAreaCnpq("Ciências Exatas");
        
        System.out.println(p.getAreaCnpq());
    }
    
}
