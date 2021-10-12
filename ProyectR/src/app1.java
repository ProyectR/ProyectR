import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class app1 extends JPanel {
    public app1(){
    }
    
    @Override
    public void paint(Graphics g){
        ImageIcon imagen= new ImageIcon(getClass().getResource("Icono/1.png"));
        g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
        
        setOpaque(false);
        super.paint(g);
    }
    public static void main (String[]args){
       JFrame ventana = new JFrame("Imagen de Fondo");
       app1 fondo= new app1();
       ventana.setContentPane(fondo);
       ventana.setSize(600,600);
       ventana.setVisible(true);
       ventana.setLocationRelativeTo(null);
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}