package capitulo_6.aula_28_04_2026;

public class Trigonometria {
    
    public static int calcularArea(Triangulo t){
        return (t.getBase() * t.getAltura() / 2); 
    }
    
    public static double calcularArea(Circulo c){
        return Math.PI * c.getRaio() * c.getRaio();
    }
    
}
