package Views.Panels.Reservas;

import Events.GlobalEvents.IrPanelDashboardSinValidacion;
import Events.ReservasEvents.EventoManejarFechas;

import javax.swing.*;
import java.awt.*;

public class PanelReservas extends JPanel {

    String pathImage = "../../assets/inicio.png";
    Views.General.PanelBackground backgroundImage = new Views.General.PanelBackground(600,0,800,800,pathImage);

    String pathImageLogo = "../../assets/logo.png";
    Views.General.PanelBackground logoBackImange = new Views.General.PanelBackground(220,0,160,160,pathImageLogo);

    JLabel TitlePanel = new JLabel("Sistema de Reservas");

    JLabel tagCheckIn = new JLabel("Fecha de Check in");
    JTextField fechaInicio = new JTextField();

    JLabel tagCheckOut = new JLabel("Fecha de Check out");
    JTextField fechaFin = new JTextField();

    String listaFormasDePago[] = {"Credito","Debito","Efectivo"};
    JComboBox<String> listOptions = new JComboBox<String>(listaFormasDePago);

    JLabel valorReserva = new JLabel("Valor de la Reserva");
    JLabel resultadoReserva = new JLabel("asdfasdf");

    EventoManejarFechas manejarFechas1 = new EventoManejarFechas(fechaInicio,fechaFin, resultadoReserva);

    JButton btnContinuar = new JButton("Continuar");

    JButton btnCancelar = new JButton("Cancelar");
    IrPanelDashboardSinValidacion eventoIrDash = new IrPanelDashboardSinValidacion();

    public  PanelReservas(){
        setVisible(false);
        setLayout(null);
        setBounds(0,0,1400,800);
        add(backgroundImage);
    add(logoBackImange);

    AddComponents(this);
    }

    public  void AddComponents( JPanel panel){
        panel.add(TitlePanel);
        TitlePanel.setBounds(150,170,300,50);
        TitlePanel.setHorizontalAlignment(SwingConstants.CENTER);
        TitlePanel.setFont(new Font("Calibri", Font.BOLD, 25));

        panel.add(tagCheckIn);
        tagCheckIn.setBounds(200,230,200,30);
        tagCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(fechaInicio);
        fechaInicio.setBounds(200,260,200,40);
        fechaInicio.getDocument().addDocumentListener(manejarFechas1);

        panel.add(tagCheckOut);
        tagCheckOut.setBounds(200,310,200,30);
        tagCheckOut.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(fechaFin);
        fechaFin.setBounds(200,340,200,40);
        fechaFin.getDocument().addDocumentListener(manejarFechas1);

        panel.add(valorReserva);
        valorReserva.setBounds(200,400,200,40);
        valorReserva.setFont(new Font("Calibri", Font.BOLD, 23));

        panel.add(resultadoReserva);
        resultadoReserva.setBounds(200,450,200,40);
        resultadoReserva.setFont(new Font("Calibri", Font.BOLD, 23));
        resultadoReserva.setBackground(Color.gray);

        listOptions.setSelectedIndex(1);
        listOptions.setFont(new Font("Calibri", Font.BOLD, 25));
        listOptions.setBounds(200,500,200,40);
        panel.add(listOptions);

        panel.add(btnContinuar);
        btnContinuar.setBounds(200,600,200,35);

        panel.add(btnCancelar);
        btnCancelar.setBounds(200,650,200,30);
        btnCancelar.addActionListener(eventoIrDash);
    }
}
