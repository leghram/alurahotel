package Events.GlobalEvents;

import Views.Ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IrPanelDashboard implements ActionListener {

    private JTextField user, password;

    public IrPanelDashboard(JTextField user, JTextField password){
        this.user   = user  ;
        this.password = password;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (  "admin".equals(user.getText())  &&  "admin".equals(password.getText())  ) {
            Ventana.panelDashboard.setVisible(true);
            Ventana.panelInicio.setVisible(false);
            Ventana.panelViewLogin.setVisible(false);
            Ventana.panelReservas.setVisible(false);
            Ventana.panelBusqueda.setVisible(false);
        }
    }
}