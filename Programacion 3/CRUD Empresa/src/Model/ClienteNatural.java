package Model;

import com.sun.javafx.binding.StringFormatter;

public class ClienteNatural extends Cliente {

    public String fechaNacimiento;
    public String CorreoElectronico;


    public ClienteNatural(String nombre, String apellido, int identidad, String direccion, String tipoCliente, String fecha, String correo) {
        super(nombre, apellido, identidad, direccion, tipoCliente);
        this.fechaNacimiento=fecha;
        this.CorreoElectronico=correo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }
}
