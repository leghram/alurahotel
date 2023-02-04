package Events.GlobalEvents;

import Views.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IrPanelBusqueda implements ActionListener {

    public void actionPerformed(ActionEvent actionEvent) {
        Ventana.panelInicio.setVisible(false);
        Ventana.panelViewLogin.setVisible(false);
        Ventana.panelDashboard.setVisible(false);
        Ventana.panelReservas.setVisible(false);
        Ventana.panelBusqueda.setVisible(true);
    }
}