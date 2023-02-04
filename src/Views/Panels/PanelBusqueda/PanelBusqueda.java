package Views.Panels.PanelBusqueda;

import Events.GlobalEvents.IrPanelDashboardSinValidacion;
import Views.General.PanelBackground;
import sun.awt.image.PNGImageDecoder;

import javax.swing.*;
import java.awt.*;

public class PanelBusqueda extends JPanel {

    String pathImageLogo = "../../assets/logo.png";
    PanelBackground logoBackImange = new PanelBackground(0,0,160,160,pathImageLogo);

    String pathImageEditar = "../../assets/editar.png";
    PanelBackground editarBackImange = new PanelBackground(1050,700,40,40,pathImageEditar);

    String pathImageTacho = "../../assets/eliminar.png";
    PanelBackground tachoBackImange = new PanelBackground(1100,700,40,40,pathImageTacho);

    String pathImageX = "../../assets/x.jpg";
    PanelBackground XBackImange = new PanelBackground(1150,700,40,40,pathImageX);

    JTextField inputBusqueda = new JTextField();
    String pathImageBusqueda = "../../assets/busqueda.jpg";
    PanelBackground busquedaImagen = new PanelBackground(1330,200,40,40,pathImageBusqueda);

    JLabel TitlePanel = new JLabel("Sistema de Busqueda");

    JButton SalirDash = new JButton("salir");
    IrPanelDashboardSinValidacion eventoIrDash = new IrPanelDashboardSinValidacion();

    JButton huespedesData = new JButton("Huespedes");
    JButton reservasData = new JButton("Reservas");
    PanelDataBusqueda dataBusqueda = new PanelDataBusqueda();

    public  PanelBusqueda(){
        setLayout(null);
        setVisible(false);
        setBounds(0,0,1400,800);
        setBackground(Color.white);

        add(logoBackImange);
        add(dataBusqueda);
        add(editarBackImange);
        add(tachoBackImange);
        add(XBackImange);
        add(busquedaImagen);

        AddComponents(this);

    }

    public  void AddComponents( JPanel panel){
        panel.add(TitlePanel);
        TitlePanel.setBounds(170,50,300,50);
        TitlePanel.setHorizontalAlignment(SwingConstants.CENTER);
        TitlePanel.setFont(new Font("Calibri", Font.BOLD, 25));

        panel.add(reservasData);
        reservasData.setBounds(0,200,200,50);

        panel.add(huespedesData);
        huespedesData.setBounds(200,200,200,50);

        panel.add(inputBusqueda);
        inputBusqueda.setBounds(1120, 200,200,40);

        panel.add(SalirDash);
        SalirDash.setBounds(1200,700,200,40);
        SalirDash.addActionListener(eventoIrDash);
    }
}
