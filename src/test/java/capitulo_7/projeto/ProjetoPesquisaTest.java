package capitulo_7.projeto;

import org.junit.jupiter.api.Test;


public class ProjetoPesquisaTest {
    
    public ProjetoPesquisaTest() {
    }

    @Test
    public void testConstructor() {
        ProjetoPesquisa p = new ProjetoPesquisa(GrandeArea.CIENCIAS_EXATAS); 
        System.out.println(p.getAreaCnpq());
    }
    
}
