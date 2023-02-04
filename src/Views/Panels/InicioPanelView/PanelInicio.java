package Views.Panels.InicioPanelView;

import Events.GlobalEvents.PonerViewLoginVisible;


import javax.swing.*;
import java.awt.*;

public class PanelInicio extends JPanel {

JButton btnLogin = new JButton("Login");

PonerViewLoginVisible eventoLogin = new PonerViewLoginVisible();

    String pathImage = "../../assets/inicio.png";
    Views.General.PanelBackground backgroundImage = new Views.General.PanelBackground(0,0,1000,800,pathImage);

    String pathImageLogo = "../../assets/logo.png";
    Views.General.PanelBackground logoBackImange = new Views.General.PanelBackground(1100,50,200,200,pathImageLogo);
    String pathImageUser = "../../assets/user.png";
    Views.General.PanelBackground userBackImange = new Views.General.PanelBackground(1100,300,200,200,pathImageUser);




    public PanelInicio(){
        setBounds(0,0,1400,800);
        setVisible(true);
        setLayout(null);

        btnLogin.setBounds(1100,550,200,50);
        btnLogin.addActionListener(eventoLogin);
        add(btnLogin);

        add(backgroundImage);
        add(userBackImange);
        add(logoBackImange);
    }


}
