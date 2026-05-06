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
        Ponto p = new Ponto(3, 7);
        System.out.println(p.printar());
        Pixel x = new Pixel(4, 6, "azul"); 
        System.out.println(x.printar());
        
    }
    
}
