package Model;

public class ClienteJuridico extends Cliente{

    public String nit;
    public String numeroTrbutario;


    public ClienteJuridico(String nombre, String apellido, int identidad, String direccion, String tipoCliente, String nit2, String numero) {
        super(nombre, apellido, identidad, direccion, tipoCliente);
        this.nit=nit2;
        this.numeroTrbutario=numero;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNumeroTrbutario() {
        return numeroTrbutario;
    }

    public void setNumeroTrbutario(String numeroTrbutario) {
        this.numeroTrbutario = numeroTrbutario;
    }
}
