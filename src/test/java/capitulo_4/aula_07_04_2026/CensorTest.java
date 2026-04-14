package capitulo_4.aula_07_04_2026;

import capitulo_4.aula_09_04_2026.Censor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CensorTest {
    
    public CensorTest() {
    }

    @Test
    public void testCensurar() {
        Censor c = new Censor();
        
        
         
        assertFalse(c.censurar("UENP - Universidade Estadual do Norte do Paraná"));
    }
    
}
