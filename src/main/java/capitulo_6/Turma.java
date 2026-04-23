
package capitulo_6;

import capitulo_4.Aluno;


public class Turma {
    private Aluno[] alunos; 
    
    public Turma(){
        alunos = new Aluno[2];
    }
    
    public Turma(Aluno[] alunos){
        this.alunos = alunos; 
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    
    
    
}
