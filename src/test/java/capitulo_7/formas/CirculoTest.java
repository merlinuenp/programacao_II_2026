
package capitulo_7.formas;

import org.junit.jupiter.api.Test;

/**
 *
 * @author Usuário
 */
public class CirculoTest {
    
    public CirculoTest() {
    }

    @Test
    public void testDesenhar() {
        new Circulo(5, 5, 40).desenhar();
        new Oval(10, 10, 30, 50).desenhar();
    }
    
}
