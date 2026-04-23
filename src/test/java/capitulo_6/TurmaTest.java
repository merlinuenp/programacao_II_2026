package capitulo_6;

import capitulo_4.Aluno;
import org.junit.jupiter.api.Test;

/*
 * Crie uma classe chamada Turma com um vetor de 2 alunos 
 * (objetos da classe criada no exercício anterior). 
 *  Mostre como inserir objetos no vetor e como percorrer o vetor
 *  mostrando os nomes dos alunos. 
 */
public class TurmaTest {
    
    public TurmaTest() {
    }

    @Test
    public void testTurma() {
        Turma turma = new Turma(); // criou a turma, todas as posições estão null
        turma.getAlunos()[0] = new Aluno(1, "Max");
        turma.getAlunos()[1] = new Aluno(2, "Ted");
        // percorrendo e mostrando 
        for (Aluno aux : turma.getAlunos()){
            System.out.println(aux.getNome());
        }
        
        
        
        /*
        // Outra forma 
        Aluno aluno1 = new Aluno(1, "Max"); 
        Aluno aluno2 = new Aluno(2, "Ted");
        Aluno vetor[] = {aluno1, aluno2};
        
        Turma t = new Turma(vetor);
       
        for (int i=0; i<2; i++){
            System.out.println(t.getAlunos()[i].getNome());
        }
        **/
    }
    
}
