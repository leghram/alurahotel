package Views;

import javax.swing.*;

import Views.Panels.Dashboard.PanelDashboard;
import Views.Panels.InicioPanelView.PanelInicio;
import Views.Panels.PanelBusqueda.PanelBusqueda;
import Views.Panels.Reservas.PanelReservas;
import Views.Panels.ViewLogin.PanelViewLogin;

public class Ventana extends JFrame {
    public static PanelViewLogin panelViewLogin =  new PanelViewLogin();
    public static PanelInicio panelInicio = new PanelInicio();
    public  static PanelDashboard panelDashboard = new PanelDashboard();
    public  static PanelReservas panelReservas = new PanelReservas();
    public  static PanelBusqueda panelBusqueda = new PanelBusqueda();

    public Ventana(){
        setBounds(100,100,1400,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        add(panelInicio);
        add(panelViewLogin);
        add(panelDashboard);
        add(panelReservas);
        add(panelBusqueda);
    }
}
