package capitulo_4;

public class DuplaTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Gargamel");
        Aluno aluno2 = new Aluno(2, "Papai Smurf");
        Dupla dupla = new Dupla();
        dupla.aluno1 = aluno1;
        dupla.aluno2 = aluno2;
        Aluno sorteado = dupla.sortear();
        System.out.println(sorteado.nome);
        
        sorteado = dupla.sortear();
        System.out.println(sorteado.nome);
        
        sorteado = dupla.sortear();
        System.out.println(sorteado.nome);
    }

}
