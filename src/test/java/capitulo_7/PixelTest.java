package capitulo_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuário
 */
public class PixelTest {
    
    public PixelTest() {
    }

    @Test
    public void testPrintar() {

        Ponto x = new Pixel(4, 6, "azul"); 
        System.out.println(x);
     
        
    }
    
}
