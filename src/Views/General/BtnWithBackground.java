package Views.General;

import javax.swing.*;

public class BtnWithBackground extends JButton {

    private  String pathImage;
    Views.General.PanelBackground logoBackImange;

    public  BtnWithBackground(String pathImage){
        super();
        setBackground(null);
        setBorder(null);
        this.pathImage  = pathImage;
        logoBackImange = new Views.General.PanelBackground(0,0,getWidth(),getHeight(),this.pathImage);
        add(logoBackImange);
    }


}
