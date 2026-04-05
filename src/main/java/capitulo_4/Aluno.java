package capitulo_4;

public class Aluno {
    int matricula;
    String nome;
    
    // construtor vazio
    Aluno(){
        matricula = 0;
        nome = ""; 
    }
    
    // construtor que recebe argumentos 
    Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome; 
    }
    
    
    
}
