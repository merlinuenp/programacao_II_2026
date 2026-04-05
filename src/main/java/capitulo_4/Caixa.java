package capitulo_4;
     
class Caixa {
    int largura;
    int altura;
    int profundidade; 
    
    Caixa(){
        this.largura = 0;
        this.altura = 0;
        this.profundidade = 0; 
    }
    
    Caixa(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
        this.profundidade = 2;
    }
    
    Caixa(int largura, int altura, int profundidade){
        this.largura = largura; 
        this.altura = altura;
        this.profundidade = profundidade;
    }
    
    
    int calcularVolume(){
        int volume= altura * largura * profundidade;
        return volume;
    }
    
    
    
}


