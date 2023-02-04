package Views.General;

import javax.swing.*;
import java.awt.*;

public class PanelBackground extends JPanel {

    private  String pathImage;
    private ImageIcon imagenFondo;

    public PanelBackground(int x0, int y0, int ancho, int alto, String pathImage){
        this.pathImage = pathImage;
        setBounds(x0,y0 ,ancho,alto );
        setBackground(Color.green);
        setVisible(true);

    }

    public void paint(Graphics g){
        imagenFondo= new ImageIcon(getClass().getResource(this.pathImage));
        g.drawImage(imagenFondo.getImage(),0,0,getWidth(), getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
