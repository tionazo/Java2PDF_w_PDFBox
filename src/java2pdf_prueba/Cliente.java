package java2pdf_prueba;

/**
 *
 * @author Francisco Sánchez
 */
public class Cliente {

    String nombre, apellidos, domicilio, cuentaCorriente, telefono, email;
    int edad;

    public Cliente(String nombre, String apellidos, String domicilio, String cuentaCorriente, String telefono, String email, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.cuentaCorriente = cuentaCorriente;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + "\t" + apellidos + "\t" + domicilio + "\t" + cuentaCorriente + "\t" + telefono + "\t" + email + "\t" + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCuentaCorriente() {
        return cuentaCorriente;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

}
