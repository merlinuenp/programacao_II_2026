
package capitulo_4.aula_07_04_2026;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        
        int resultadoEsperado = 4;
        int resultadoEncontrado = calculadora.somar(2, 2);
        
        assertEquals(resultadoEsperado, resultadoEncontrado);
    }
    
}
