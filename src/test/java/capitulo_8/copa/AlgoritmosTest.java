package capitulo_8.copa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgoritmosTest {
    
    public AlgoritmosTest() {
    }

    @Test
    public void testOrdenaJogador() {
        IPontuacao vetor[] = new Jogador[4];
        vetor[0] = new Jogador(1, "Alisson", 3);
        vetor[1] = new Jogador(2, "Bremer", 5);
        vetor[2] = new Jogador(3, "Danilo", 0);
        vetor[3] = new Jogador(4, "Marquinhos", 9);
        
        IPontuacao maior = Algoritmos.getMaior(vetor);
        
               
        Jogador vencedor = (Jogador) maior;
        System.out.println(vencedor.getNome());
        
        
        
//        IPontuacao vetorTime[] = new Time[4];
//        vetorTime[0] = new Time("Flamengo", new Pais("Brasil", "América"), 10);
//        vetorTime[1] = new Time("Kabuscorp", new Pais("Angola", "Africa"), 8);
//        vetorTime[2] = new Time("Kashima Antlers", new Pais("Japão", "Ásia"), 15);
//        vetorTime[3] = new Time("Celtic", new Pais("Escócia", "Europa"), 21);
//        IPontuacao maiorTime = Algoritmos.getMaior(vetorTime);
//        Time timeVencedor = (Time) maiorTime;
//        
//        System.out.println("Time vencedor: " 
//                + timeVencedor.getNome() 
//                + " do País: " + timeVencedor.getPais().getNome());
//        
//        
    }
    
}
