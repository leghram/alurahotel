package Domain;

public class Reservas {

    String fechaIn, fechaOut, precio, formaPago;

    public  Reservas(String fechaIn, String fechaOut, String precio, String formaPago){
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.precio = precio;
        this.formaPago = formaPago;
    }

}
