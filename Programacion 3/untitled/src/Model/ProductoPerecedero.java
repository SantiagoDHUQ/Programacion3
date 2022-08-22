package Model;

public class ProductoPerecedero extends Producto{

    public String fechaVencimiento;


    public ProductoPerecedero(String nombre1, String codigo1, int ValorU, String descripcion1, String tipoProducto1, String fechaV) {
        super(nombre1, codigo1, ValorU, descripcion1, tipoProducto1);
        this.fechaVencimiento=fechaV;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
