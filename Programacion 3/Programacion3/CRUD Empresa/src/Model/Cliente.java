package Model;

public class Cliente {

    public String nombre;
    public String apellido;
    public int identidad;
    public String direccion;
    public String tipoCliente;

    public Cliente(String nombre, String apellido, int identidad, String direccion, String tipoCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identidad = identidad;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
