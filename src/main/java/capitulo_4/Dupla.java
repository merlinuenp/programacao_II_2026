package capitulo_4;

import java.util.concurrent.ThreadLocalRandom;


class Dupla {
    Aluno aluno1;
    Aluno aluno2; 
    
    Dupla(){
        aluno1 = new Aluno();
        aluno2 = new Aluno(); 
    }
    
    Aluno sortear(){
        int numero = ThreadLocalRandom.
                current().nextInt(1, 3);
        if ( numero == 1){
            return aluno1;
        }
        return aluno2; 
    }
    
    
    
}
