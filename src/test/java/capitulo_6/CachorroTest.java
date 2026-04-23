package capitulo_6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CachorroTest {
    
    public CachorroTest() {
    }

    @Test
    public void testStatic() {
        Cachorro c1 = new Cachorro("Rex", "Poodle");
        c1.latir("kkkkkkk");
        
    
    }
    
}
