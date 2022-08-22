package Model;

public class Producto {

    public String nombre;
    public String codigo;
    public int valorUnitario;
    public String descripcion;
    public String tipoProducto;


    public Producto(String nombre1, String codigo1, int ValorU, String descripcion1, String tipoProducto1){
        this.nombre= nombre1;
        this.codigo=codigo1;
        this.valorUnitario=ValorU;
        this.descripcion=descripcion1;
        this.tipoProducto=tipoProducto1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        valorUnitario = valorUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
