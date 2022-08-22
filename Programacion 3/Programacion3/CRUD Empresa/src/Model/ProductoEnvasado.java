package Model;

public class ProductoEnvasado extends Producto{

    public String fechaEnvasado;
    public String pesoEnvase;
    public String paisOrigen;


    public ProductoEnvasado(String nombre1, String codigo1, int ValorU, String descripcion1, String tipoProducto1, String fechaE, String pesoE, String pais) {
        super(nombre1, codigo1, ValorU, descripcion1, tipoProducto1);
        this.fechaEnvasado=fechaE;
        this.paisOrigen=pais;
        this.pesoEnvase=pesoE;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(String pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
