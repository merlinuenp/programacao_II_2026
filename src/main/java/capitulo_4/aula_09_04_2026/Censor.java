/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_4.aula_09_04_2026;

/**
 *
 * @author Usuário
 */
public class Censor {
    String censuradas[] = {
            "guerra", 
            "aniquilar",
            "aniquilação",
            "bomba",
            "ataque",
            "aniquilado"            
        };
    
    public boolean censurar(String texto){
        for (String s : censuradas){
            if (texto.contains(s)) return true;
        } 
        
        return false;
    }
    
}
