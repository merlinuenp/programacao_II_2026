package capitulo_4.aula_07_04_2026;

public class Maiuscula {
    public static void main(String[] args) {
        String qualquer="eita povo timido";
        qualquer = qualquer.toUpperCase();
        System.out.println(qualquer);
        
        String vetor[]=qualquer.split(" ");
        
        for(String s:vetor){
            System.out.println(s);
        }
        
    }
}

