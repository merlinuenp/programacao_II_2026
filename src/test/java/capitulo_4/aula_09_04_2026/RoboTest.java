package capitulo_4.aula_09_04_2026;

import capitulo_6.Robo;
import capitulo_6.Ponto;
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
    public void testConstrutor() {
        Ponto ponto = new Ponto(20, 20);
        Robo robo = new Robo("Bob", ponto);
        robo.teletransportar(new Ponto(12, 12));
        System.out.println(robo.mostrarPosicao());
    }
    
}
