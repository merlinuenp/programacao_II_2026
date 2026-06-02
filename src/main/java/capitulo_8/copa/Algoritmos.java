package capitulo_8.copa;

public class Algoritmos {
    
    public static IPontuacao getMaior(IPontuacao vetor[]){
        IPontuacao maior = vetor[0];
        for (int i=1; i < vetor.length; i++){
            if(vetor[i].getPontuacao() > maior.getPontuacao()){
                maior = vetor[i];
            }
        }
        return maior; 
    }
    
    
    public static IPontuacao getMenor(IPontuacao vetor[]){
        IPontuacao menor = vetor[0];
        for (int i=1; i < vetor.length; i++){
            if(vetor[i].getPontuacao() < menor.getPontuacao()){
                menor = vetor[i];
            }
        }
        return menor; 
    }
    
    
}
