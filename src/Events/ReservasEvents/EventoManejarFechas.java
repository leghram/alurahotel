package Events.ReservasEvents;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EventoManejarFechas implements DocumentListener {

    JTextField fechaInicio ;
    JTextField fechaFin;
    JLabel resultado;

    String textoInicio ="";
    String textoFin ="";
    Double precioEstandar = 40.0;
    Double precioTotal = 0.0;

    int valor=0;
    public  EventoManejarFechas(JTextField fechaInicio, JTextField fechaFin, JLabel resultado){
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.resultado = resultado;
    }

    public void insertUpdate(DocumentEvent documentEvent) {
         textoInicio =  fechaInicio.getText();
         textoFin = fechaFin.getText();
         if (textoInicio.length() == 10 && textoFin.length() == 10){
             textoInicio = textoInicio.substring(0,2);
             textoFin = textoFin.substring(0,2);
             try{
                 valor =  Integer.parseInt(textoFin)- Integer.parseInt(textoInicio);
                 precioTotal = precioEstandar * valor;

                 this.resultado.setText("" + precioTotal);
             }catch (Exception e){

             }

         }


    }

    public void removeUpdate(DocumentEvent documentEvent) {

    }

    public void changedUpdate(DocumentEvent documentEvent) {

    }
}
