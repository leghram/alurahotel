package Events.GlobalEvents;

import Views.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PonerViewLoginVisible implements ActionListener {

    public void actionPerformed(ActionEvent actionEvent) {
        Ventana.panelInicio.setVisible(false);
        Ventana.panelDashboard.setVisible(false);
        Ventana.panelViewLogin.setVisible(true);
        Ventana.panelReservas.setVisible(false);
        Ventana.panelBusqueda.setVisible(false);
    }
}
