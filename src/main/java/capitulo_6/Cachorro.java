package capitulo_6;


public class Cachorro {
    private String nome;
    private String raca; 
    
    public Cachorro(){
        this.nome = "";
        this.raca = ""; 
    }
    
    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca; 
    }
    
    public void latir(){
        System.out.println("auau"); 
    }
    
    public void latir(int vezes){
      for(int i=0; i<vezes; i++){
          System.out.println("auau");
      }  
    }
    
    public void latir(String latido){
        System.out.println(latido);
    } 
    

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    
}
