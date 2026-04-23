package capitulo_4;

public class Aluno {
    private int matricula;
    private String nome;
    
    // construtor vazio
    public Aluno(){
        matricula = 0;
        nome = ""; 
    }
    
    // construtor que recebe argumentos 
    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome; 
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
