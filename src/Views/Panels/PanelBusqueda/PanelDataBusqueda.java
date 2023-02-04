package Views.Panels.PanelBusqueda;

import javax.swing.*;
import java.awt.*;

public class PanelDataBusqueda extends JPanel {
    Color grayColor = new Color(220, 240, 152);

    String headers[] = {"Fecha Check in", "Fecha Check out", "Precio Total", "Forma de Pago"};

    String reserva1[] = {"12/02/2023","15/02/2023","120","Credito"};
    String reserva2[] = {"22/02/2023","27/02/2023","200","Debito"};
    String reserva3[] = {"11/03/2023","30/03/2023","760","Debito"};
    String reserva4[] = {"01/04/2023","07/04/2023","240","Efectivo"};

    String reservas[][] = {reserva1,reserva2,reserva3, reserva4};

    public  PanelDataBusqueda(){
        setVisible(true);
        setLayout(null);
        setBounds(0,250,1400,450);

        addHeaders(this);
        addData(this);
    }

    public  void addHeaders(JPanel panel){
        int cantidad = headers.length;
        int inicio = 0;
        int ancho = 1400/cantidad;
        for(int i =0; i< cantidad; i++){
            JLabel label = new JLabel(headers[i]);
            label.setBackground(grayColor);
            panel.add(label);
            label.setBounds(inicio,0,ancho,40);
            inicio = inicio + ancho;
        }
    }

    public  void addData(JPanel panel){
        int cantidadReservas = reservas.length;
        int cantidadCampos = reservas[0].length;
        int inicioY = 40;
        int inicioX = 0;
        int ancho = 1400/cantidadCampos;

        for(int i =0; i< cantidadReservas; i++){
            inicioX = 0;
            for (int m =0; m< cantidadCampos; m++){
                JLabel label = new JLabel(reservas[i][m]);
                panel.add(label);
                label.setBounds(inicioX,inicioY,ancho,40);
                inicioX = inicioX + ancho;
            }
            inicioY = inicioY + 40;
        }
    }

}
