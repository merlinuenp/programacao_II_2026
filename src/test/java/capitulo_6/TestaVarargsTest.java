/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package capitulo_6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuário
 */
public class TestaVarargsTest {

    public TestaVarargsTest() {
    }

    @Test
    public void testSomaInteiros() {
        System.out.println(TestaVarargs.somaInteiros(1, 2, 3));

        System.out.println(TestaVarargs.somaInteiros(1, 2, 3, 9, 8, 7));

    }

}
