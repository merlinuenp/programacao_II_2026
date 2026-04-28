package capitulo_6.aula_28_04_2026;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TrigonometriaTest {
    
    public TrigonometriaTest() {
    }

    @Test
    public void testCalcularArea() {
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(10); 
        triangulo.setAltura(5);
        
        
        int area = Trigonometria.calcularArea(triangulo);
        
        Circulo circulo = new Circulo(2.3);
        double areaC = Trigonometria.calcularArea(circulo); 
        
        
        
    }
    
}
