package capitulo_7;

public class Util {
    
    public static void ordenaRoboMarciano(RoboMarciano robos[]) {
        
    }
    
    public static void ordenaRoboSolar(RoboSolar robos[]) {
        
    }
    
    public static void ordenaRoboPlutoniano(RoboPlutoniano robos[]) {
        
    }
    
    
    
    
    
    
    
    
    public static void ordenaRobo(Robo robos[]) {
        for (int i = 0; i < robos.length; i++) {
            for (int j = robos.length - 1; j > i; j--) {
                if (robos[i].getNome().compareToIgnoreCase(robos[j].getNome()) > 0) {
                    Robo temp = robos[i];
                    robos[i] = robos[j];
                    robos[j] = temp;
                }
            }
        }

    }

}
