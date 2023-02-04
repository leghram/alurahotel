package Views.Panels.ViewLogin;

import Events.GlobalEvents.IrPanelDashboard;
import Events.GlobalEvents.IrPanelInicioEvent;
import Views.General.PanelBackground;

import javax.swing.*;

public class PanelViewLogin extends JPanel {
    String pathImage = "../../assets/loginview.jpg";
    PanelBackground backgroundImage = new PanelBackground(0,0,800,800,pathImage);

    String pathImageLogo = "../../assets/logo.png";
    Views.General.PanelBackground logoBackImange = new Views.General.PanelBackground(1020,0,160,150,pathImageLogo);

    JLabel user = new JLabel("User");
    JLabel password = new JLabel("Password");

    JTextField userInput = new JTextField();
    JPasswordField passInput = new JPasswordField();

    JButton loguear = new JButton("Ingresar");
    JButton cancelar = new JButton("Cancelar");

    IrPanelInicioEvent mainPanel = new IrPanelInicioEvent();
    IrPanelDashboard eventoLoguearDash = new IrPanelDashboard(userInput, passInput);

    public  PanelViewLogin(){
        setBounds(0,0,1400,800);
        setVisible(false);
        setLayout(null);
        add(backgroundImage);
        add(logoBackImange);


        add(cancelar);
        cancelar.addActionListener(mainPanel);

        add(loguear);
        loguear.addActionListener(eventoLoguearDash);

        addComponents(this);
    }

    public  void addComponents(JPanel panel){
        panel.add(user);
        user.setBounds(1000,150,200,50);
        panel.add(userInput);
        userInput.setBounds(1000,200,200,50);
        userInput.setText("admin");


        panel.add(password);
        password.setBounds(1000,300,200,50);
        panel.add(passInput);
        passInput.setBounds(1000,350,200,50);
        passInput.setText("admin");

        panel.add(loguear);
        loguear.setBounds(1000,450,200,50);

        panel.add(cancelar);
        cancelar.setBounds(1000,530,200,50);
    }

}

