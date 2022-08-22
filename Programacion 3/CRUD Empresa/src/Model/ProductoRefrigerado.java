package Model;

public class ProductoRefrigerado extends Producto{

    public String temperaturaRecomendada;
    public String codigoAprovado;

    public ProductoRefrigerado(String nombre1, String codigo1, int ValorU, String descripcion1, String tipoProducto1, String temperatura, String codigo) {
        super(nombre1, codigo1, ValorU, descripcion1, tipoProducto1);
        this.codigoAprovado=codigo;
        this.temperaturaRecomendada=temperatura;

    }

    public String getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(String temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getCodigoAprovado() {
        return codigoAprovado;
    }

    public void setCodigoAprovado(String codigoAprovado) {
        this.codigoAprovado = codigoAprovado;
    }
}
