
package capitulo_7.formas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Artista {
    
    public static void desenhar(Circulo circulo){
        JPanel painelDesenho = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Suavizar as bordas (Antialiasing)
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Desenhar um círculo preenchido
                g2d.setColor(Color.BLUE);
                g2d.fillOval(circulo.getX(), circulo.getY(), circulo.getRaio(), circulo.getRaio());

            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 150);
            }
        };

        JOptionPane.showMessageDialog(null, painelDesenho, "Minha Figura: "+circulo.getClass().getName(),
                JOptionPane.PLAIN_MESSAGE);

    }
   
    public static void desenhar(Oval oval){
        JPanel painelDesenho = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Suavizar as bordas (Antialiasing)
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Desenhar um círculo preenchido
                g2d.setColor(Color.BLUE);
                g2d.fillOval(oval.getX(), oval.getY(), 
                        oval.getRaio(), oval.getRaioMaior());

            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 150);
            }
        };
        
        JOptionPane.showMessageDialog(null, painelDesenho, "Minha Figura: "+oval.getClass().getName(),
                JOptionPane.PLAIN_MESSAGE);

    }
    
}
