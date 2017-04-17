package java2pdf_prueba;

import java.util.Date;

/**
 *
 * @author Francisco Sánchez
 */
public class Reserva {

    int idReserva, idHabitacion, idTemporada;
    boolean telefono, internet, canalSatelite, fax;
    String idCliente;
    Date fechaEntrada, fechaSalida;

    public Reserva(int idReserva, int idHabitacion, int idTemporada, boolean telefono, boolean internet, boolean canalSatelite, boolean fax, String idCliente, Date fechaEntrada, Date fechaSalida) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.idTemporada = idTemporada;
        this.telefono = telefono;
        this.internet = internet;
        this.canalSatelite = canalSatelite;
        this.fax = fax;
        this.idCliente = idCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idHabitacion=" + idHabitacion + ", idTemporada=" + idTemporada + ", telefono=" + telefono + ", internet=" + internet + ", canalSatelite=" + canalSatelite + ", fax=" + fax + ", idCliente=" + idCliente + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + '}';
    }

    public int getIdReserva() {
        return idReserva;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public int getIdTemporada() {
        return idTemporada;
    }

    public boolean isTelefono() {
        return telefono;
    }

    public boolean isInternet() {
        return internet;
    }

    public boolean isCanalSatelite() {
        return canalSatelite;
    }

    public boolean isFax() {
        return fax;
    }
    
    public String getIdCliente() {
        return idCliente;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

}
