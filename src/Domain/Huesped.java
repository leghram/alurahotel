package Domain;

import java.util.Date;

public class Huesped {

    String nombre, apellido, telefono;
    Date fechaNacimiento;

    public  Huesped(String nombre, String apellido, Date fechaNacimiento, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }
}
