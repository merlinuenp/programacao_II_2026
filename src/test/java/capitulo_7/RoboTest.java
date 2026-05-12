package capitulo_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuário
 */
public class RoboTest {
    
    public RoboTest() {
    }

    @Test
    public void testOrdenar() {
        Robo lista[] = new Robo[3];
        lista[0]= new RoboMarciano(1, "Zoroastro", 7, 9);
        lista[1]= new RoboMarciano(2, "Parafuso", 7, 9);
        lista[2]= new RoboMarciano(3, "Vaza Óleo", 7, 9);
        
        int i = 10;
        double d = (double) i; 
        
    }
    
}
