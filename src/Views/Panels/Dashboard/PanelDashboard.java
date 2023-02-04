package Views.Panels.Dashboard;

import Events.DashboardEvents.ClickBusqueda;
import Events.DashboardEvents.ClickReservas;
import Events.GlobalEvents.IrPanelBusqueda;
import Events.GlobalEvents.IrPanelInicioEvent;
import Events.GlobalEvents.IrPanelReservas;
import Views.General.BtnWithBackground;
import Views.General.PanelBackground;

import javax.swing.*;

public class PanelDashboard extends JPanel {
    String pathImage = "../../assets/dashboard.jpeg";
    PanelBackground backgroundImage = new PanelBackground(0,0,1000,800,pathImage);
    String pathImageLogo = "../../assets/logo.png";
    Views.General.PanelBackground logoBackImange = new Views.General.PanelBackground(1100,50,200,200,pathImageLogo);

    JButton btnSalir = new JButton("Salir");
    IrPanelInicioEvent irPanelInicioEvent = new IrPanelInicioEvent();


    JLabel tagReservas = new JLabel("Reservas");
    JLabel tagBusqueda = new JLabel("Busqueda");
    String pathImageReservas = "../../assets/reservas.png";
    String pathImageBusqueda = "../../assets/busqueda.jpg";
    BtnWithBackground btnReservas = new BtnWithBackground(pathImageReservas);
    BtnWithBackground btnBusqueda = new BtnWithBackground(pathImageBusqueda);

    IrPanelReservas irPanelReservasEvent = new IrPanelReservas();
    IrPanelBusqueda irPanelBusquedaEvent = new IrPanelBusqueda();

    public  PanelDashboard(){
        setBounds(0,0,1400,800);
        setVisible(true);
        setLayout(null);
        add(backgroundImage);
        add(logoBackImange);

        AddComponents(this);

    }

    public  void AddComponents(JPanel panel){
        btnSalir.setBounds(1150, 700, 100, 50);
        btnSalir.addActionListener(irPanelInicioEvent);
        panel.add(btnSalir);

        panel.add(tagReservas);
        tagReservas.setHorizontalAlignment(SwingConstants.CENTER);
        tagReservas.setBounds(1150,250,100,50);
        panel.add(btnReservas);
        btnReservas.setBounds(1150,290,100,80);
        btnReservas.addActionListener(irPanelReservasEvent);

        panel.add(tagBusqueda);
        tagBusqueda.setBounds(1150,400,100,50);
        tagBusqueda.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(btnBusqueda);
        btnBusqueda.setBounds(1150,440,100,80);
        btnBusqueda.addActionListener(irPanelBusquedaEvent);
    }
}
