package capitulo_13;


public class Trio <T, U, V> {
    private T primeiro;
    private U segundo;
    private V terceiro; 

    public Trio(T primeiro, U segundo, V terceiro) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.terceiro = terceiro;
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }

    public V getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(V terceiro) {
        this.terceiro = terceiro;
    }
    
    
    
}
