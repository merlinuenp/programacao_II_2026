
package capitulo_4.aula_31_03;


class Vetores {
    public static void main(String[] args) {
        String v[] = {"Tico", "Teco", "Mickey"};
        String w[] = v.clone();
        w[2]= "Huguinho";
        System.out.println(w[2]);
    }
    
    
}
