package capitulo_4.aula_07_04_2026;

public class Programador {
   int horasTrabalhadas;
   int valorHora;
   
   Programador(){
       horasTrabalhadas = 0;
       valorHora = 0;
   }
   
   Programador(int horasTrabalhadas, int valorHora){
       this.horasTrabalhadas = horasTrabalhadas;
       this.valorHora = valorHora;
   }
   
   int calcularSalario(){ 
       int calculo = horasTrabalhadas * valorHora;   
       return calculo;
   }
}
