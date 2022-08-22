package View;

import Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerVentana implements Initializable {

    //////////////////////////////////////////////////CRUD DEL CLIENTE///////////////////////////////
    private ClienteNatural clienteN;
    private ClienteJuridico clienteJ;
    private Cliente cliente;


    @FXML
    public TableView<Cliente> tablaClientes;
    @FXML
    public TableColumn colNombre;
    @FXML
    public TableColumn colApellido;
    @FXML
    public TableColumn colIdentificacion;
    @FXML
    public TableColumn colDireccion;
    @FXML
    public TableColumn colTipoCliente;
    @FXML
    public TableColumn colValorUnitarioFactura;
    @FXML
    public Button agregar;
    //@FXML
    //public Button detalle;
    @FXML
    public Button actualizar;
    @FXML
    public Button eliminar;
    @FXML
    public TextField nombreC;
    @FXML
    public TextField apellidosC;
    @FXML
    public TextField identificacionC;
    @FXML
    public TextField direccionC;
    @FXML
    public TextField fechaNacimientoC;
    @FXML
    public TextField correoC;
    @FXML
    public TextField numeroTributarioC;
    @FXML
    public TextField nitC;
    @FXML
    public ComboBox tipoClientes;

    private ObservableList<Cliente> listaClientes;
    private ObservableList<ClienteJuridico> listaClientesJuridicos;
    private ObservableList<ClienteNatural> listaClientesNatural;

/////////////////////////////////////////CRUD DEL PRODUCTO/////////////////////////////////////////////
    private Producto producto;
    private ProductoEnvasado productoEnvasado;
    private ProductoPerecedero productoPerecedero;
    private ProductoRefrigerado productoRefrigerado;
    @FXML
    public Label labelTotal;
    @FXML
    public TextArea txtAreaFactura;
    @FXML
    public TableView<Producto> tablaProductos;
    @FXML
    public TableView<Producto> tablaFactura;
    @FXML
    public TableColumn colNombreFactura;
    @FXML
    public TableColumn colTipoFactura;
    @FXML
    public TableColumn colNombre1;
    @FXML
    public TableColumn colCodigo;
    @FXML
    public TableColumn colValorUnitario;
    @FXML
    public TableColumn colDescripcion1;
    @FXML
    public TableColumn colTipoProducto;
    @FXML
    public Button agregar1;
    @FXML
    public Button btonAgregarfactura;
    @FXML
    public Button actualizar1;
    @FXML
    public Button eliminar1;
    @FXML
    public TextField txtFieldCantidad;
    @FXML
    public TextField nombreP;
    @FXML
    public TextField codigoP;
    @FXML
    public TextField valorUnitarioP;
    @FXML
    public TextField descripcionP;
    @FXML
    public TextField fechaVencimientoP;
    @FXML
    public TextField temperaturaP;
    @FXML
    public TextField codigoAprovado;
    @FXML
    public TextField fechaEnvasadoP;
    @FXML
    public TextField paisOrigen;
    @FXML
    public TextField pesoEnvase;
    @FXML
    public ComboBox tipoProductos;

    private ObservableList<Producto> listaProductos;
    private ObservableList<ProductoPerecedero> listaProductosPerecederos;
    private ObservableList<ProductoRefrigerado> listaProductosRefrigerados;
    private ObservableList<ProductoEnvasado> listaProductosEnvasados;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //inicializar();
        listaClientes = FXCollections.observableArrayList();
        this.tablaClientes.setItems(listaClientes);
        tipoClientes.getItems().removeAll(tipoClientes.getItems());
        tipoClientes.getItems().addAll(" ", " Cliente Juridico", " Cliente Natural");

        listaProductos = FXCollections.observableArrayList();
        this.tablaProductos.setItems(listaProductos);
        tipoProductos.getItems().removeAll(tipoProductos.getItems());
        tipoProductos.getItems().addAll(" ", " Producto Perecedero", " Producto Refrigerado", "Producto Envasado");
        ///////////////////Tabla de Clientes////////////////////
        this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.colIdentificacion.setCellValueFactory(new PropertyValueFactory<>("identidad"));
        this.colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.colTipoCliente.setCellValueFactory(new PropertyValueFactory<>("tipoCliente"));
        ///////////////////Tabla de Productos////////////////////
        this.colNombre1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colValorUnitario.setCellValueFactory(new PropertyValueFactory<>("valorUnitario"));
        this.colTipoProducto.setCellValueFactory(new PropertyValueFactory<>("tipoProducto"));
        this.colDescripcion1.setCellValueFactory(new PropertyValueFactory<>("descripcion"));

        /////////////////////////////tabla Factura/////////////////////////////////////
        this.tablaFactura.setItems(listaProductos);
        colNombreFactura.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colTipoFactura.setCellValueFactory(new PropertyValueFactory<>("tipoProducto"));
        colValorUnitarioFactura.setCellValueFactory(new PropertyValueFactory<>("valorUnitario"));
        //inicializar();
    }

    @FXML
    public void activarCampoTexto() {
        int tipo = tipoClientes.getSelectionModel().getSelectedIndex();

        if (tipo == 1) {

            fechaNacimientoC.setDisable(true);
            correoC.setDisable(true);
            nitC.setDisable(false);
            numeroTributarioC.setDisable(false);

        } else if (tipo == 2) {
            fechaNacimientoC.setDisable(false);
            correoC.setDisable(false);
            nitC.setDisable(true);
            numeroTributarioC.setDisable(true);
        }
    }
    @FXML
    public void activarCampoTextoProductos() {
        int tipo = tipoProductos.getSelectionModel().getSelectedIndex();

        if (tipo == 1) {

            fechaVencimientoP.setDisable(false);
            fechaEnvasadoP.setDisable(true);
            pesoEnvase.setDisable(true);
            codigoAprovado.setDisable(true);
            paisOrigen.setDisable(true);
            temperaturaP.setDisable(true);


        } else if (tipo == 2) {
            fechaVencimientoP.setDisable(true);
            fechaEnvasadoP.setDisable(true);
            pesoEnvase.setDisable(true);
            codigoAprovado.setDisable(false);
            paisOrigen.setDisable(true);
            temperaturaP.setDisable(false);
        }else if (tipo == 3) {
            fechaVencimientoP.setDisable(true);
            fechaEnvasadoP.setDisable(false);
            pesoEnvase.setDisable(false);
            codigoAprovado.setDisable(true);
            paisOrigen.setDisable(false);
            temperaturaP.setDisable(true);
        }
    }
    @FXML
    public void guardarProducto(ActionEvent event){
        String nombres=this.nombreP.getText();
        String codigo=this.codigoP.getText();
        int valorU= Integer.parseInt(this.valorUnitarioP.getText());
        String descripcion= this.descripcionP.getText();
        String tipoProducto=this.tipoProductos.getValue().toString();
        String fechaE=this.fechaEnvasadoP.getText();
        String peso=this.pesoEnvase.getText();
        String pais=this.paisOrigen.getText();
        String fechaV=this.fechaVencimientoP.getText();
        String temperatura=this.temperaturaP.getText();
        String codigoA=this.codigoAprovado.getText();
        Producto producto= new Producto(nombres, codigo, valorU, descripcion,tipoProducto);
        listaProductos.add(producto);

        if(tipoProductos.getSelectionModel().getSelectedIndex()== 1){
            ProductoPerecedero productoPerecedero1= new ProductoPerecedero(nombres,codigo,valorU,descripcion,tipoProducto,fechaV);
            if(listaProductosPerecederos!=productoPerecedero1){
                System.out.println("si");
                this.productoPerecedero= productoPerecedero1;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Informacion");
                alert.setContentText("El producto se agrego correctamente");
                alert.showAndWait();


            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("El producto ya existe");
                alert.showAndWait();
            }
        }else if(tipoProductos.getSelectionModel().getSelectedIndex()==2){
            ProductoRefrigerado productoRefrigerado1= new ProductoRefrigerado(nombres, codigo,valorU,descripcion,tipoProducto,temperatura,codigoA);
            if(listaProductosRefrigerados!=productoRefrigerado1){
                System.out.println("si");
                this.productoRefrigerado=productoRefrigerado1;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Informacion");
                alert.setContentText("El producto se agrego correctamente");
                alert.showAndWait();

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("El producto ya existe");
                alert.showAndWait();
            }
        }else if(tipoProductos.getSelectionModel().getSelectedIndex()==3){
            ProductoEnvasado productoEnvasado1= new ProductoEnvasado(nombres, codigo,valorU,descripcion,tipoProducto,fechaE, peso,pais);
            if(listaProductosEnvasados!=productoEnvasado1){
                System.out.println("si");
                this.productoEnvasado=productoEnvasado1;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Informacion");
                alert.setContentText("El producto se agrego correctamente");
                alert.showAndWait();

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("El producto ya existe");
                alert.showAndWait();
            }
        }

        nombreP.setText("");
        codigoP.setText("");
        valorUnitarioP.setText("");
        descripcionP.setText("");
        tipoProductos.getSelectionModel().select(0);
        fechaVencimientoP.setText("");
        temperaturaP.setText("");
        codigoAprovado.setText("");
        fechaEnvasadoP.setText("");
        paisOrigen.setText("");
        pesoEnvase.setText("");


    }
    @FXML
    public void guardarCliente(ActionEvent event){
        String nombres=this.nombreC.getText();
        String apellidos=this.apellidosC.getText();
        int identificaciones= Integer.valueOf(this.identificacionC.getText());
        String direcciones= this.direccionC.getText();
        String tipoClientes1=this.tipoClientes.getSelectionModel().getSelectedItem().toString();
        System.out.println(tipoClientes1);
        String fecha=this.fechaNacimientoC.getText();
        String correo=this.correoC.getText();
        String nit=this.nitC.getText();
        String numeroT=this.numeroTributarioC.getText();
        Cliente clienteC= new Cliente(nombres,apellidos,identificaciones,direcciones,tipoClientes1);
        listaClientes.add(clienteC);

        if(tipoClientes.getSelectionModel().getSelectedIndex()== 2){
            ClienteNatural clienteNatural=new ClienteNatural(nombres,apellidos,identificaciones,direcciones,tipoClientes1,fecha,correo);
            if(listaClientesNatural!=clienteNatural){
                System.out.println("si");
                this.clienteN= clienteNatural;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Informacion");
                alert.setContentText("El producto se agrego correctamente");
                alert.showAndWait();


            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("El producto ya existe");
                alert.showAndWait();
            }
        }else if(tipoClientes.getSelectionModel().getSelectedIndex()==1){
            ClienteJuridico clienteJuridico = new ClienteJuridico(nombres,apellidos,identificaciones,direcciones,tipoClientes1,nit,numeroT);
            if(listaClientesJuridicos!=clienteJuridico){
                System.out.println("si");
                this.clienteJ=clienteJuridico;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Informacion");
                alert.setContentText("El producto se agrego correctamente");
                alert.showAndWait();

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("El producto ya existe");
                alert.showAndWait();
            }
        }

        nombreC.setText("");
        apellidosC.setText("");
        identificacionC.setText("");
        direccionC.setText("");
        tipoClientes.getSelectionModel().select(0);
        fechaNacimientoC.setText("");
        correoC.setText("");
        nitC.setText("");
        numeroTributarioC.setText("");


    }
    public void initAtributos(ObservableList<Cliente> clientes){
        this.listaClientes= clientes;
    }
    public void initAtributos(ObservableList< Cliente> listaClientes1, Cliente cliente1){
        this.cliente=cliente1;
        this.listaClientes= listaClientes1;

        this.colNombre.setText(cliente1.getNombre());
        this.colApellido.setText(cliente1.getApellido());
        this.colIdentificacion.setText(cliente1.getIdentidad()+ "");
        this.colDireccion.setText(cliente1.getDireccion());
        this.colTipoCliente.setText(cliente1.getTipoCliente());

    }
    @FXML
    public void eliminarCliente(ActionEvent event){
        System.out.println("eliminando");
        Cliente cliente = this.tablaClientes.getSelectionModel().getSelectedItem();

        if (cliente == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar una persona");
            alert.showAndWait();
        }else{
            this.listaClientes.remove(cliente);
            this.tablaClientes.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Info");
            alert.setContentText("Se ha borrado el Cliente");
            alert.showAndWait();

        }

    }

    @FXML
    public void eliminarProducto(ActionEvent event){
        System.out.println("eliminando");
        Producto producto = this.tablaProductos.getSelectionModel().getSelectedItem();

        if (producto == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar una persona");
            alert.showAndWait();
        }else{
            this.listaProductos.remove(producto);
            this.tablaProductos.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Info");
            alert.setContentText("Se ha borrado el Cliente");
            alert.showAndWait();

        }

    }
    @FXML
    private void seleccionar(MouseEvent event) {

        // Obtengo la persona seleccionada
        Cliente c= this.tablaClientes.getSelectionModel().getSelectedItem();


        // Sino es nula seteo los campos
        if (c != null) {
            this.nombreC.setText(c.getNombre());
            this.apellidosC.setText(c.getApellido());
            this.identificacionC.setText(c.getIdentidad()+ "");
            this.direccionC.setText(c.getDireccion());
            /////envio de tipo de ciente/////////
            if (tipoClientes.getSelectionModel().getSelectedIndex()==2){
                this.correoC.setText(clienteN.getCorreoElectronico());
                this.fechaNacimientoC.setText(clienteN.getFechaNacimiento());
            }else if (tipoClientes.getSelectionModel().getSelectedIndex()==1){
                this.nitC.setText(clienteJ.getNit());
                this.numeroTributarioC.setText(clienteJ.getNumeroTrbutario());
            }

        }

    }
    @FXML
    private void seleccionarProducto(MouseEvent event) {

        // Obtengo la persona seleccionada
        Producto c= this.tablaProductos.getSelectionModel().getSelectedItem();


        // Sino es nula seteo los campos
        if (c != null) {
            this.nombreP.setText(c.getNombre());
            this.codigoP.setText(c.getCodigo());
            this.valorUnitarioP.setText(c.getValorUnitario()+" ");
            this.descripcionP.setText(c.getDescripcion());


        }

    }
    public void inicializar(){

        String nombres= "carlos";
        String apellidos="cobaleda";
        int identificaciones= Integer.parseInt("453453453");
        String direcciones= "agualinda";
        String tipoClientes1="Cliente Juridico";
        String fecha="";
        String correo="";
        String nit="143442";
        String numeroT="23454524";
        Cliente clienteC= new Cliente(nombres,apellidos,identificaciones,direcciones,tipoClientes1);
        listaClientes.add(clienteC);
        String nombre= "santiago";
        String apellido="dorado";
        int identificacion= Integer.parseInt("32324334");
        String direccion= "Armenia";
        String tipoClientes2="Cliente Juridico";
        String fecha2="";
        String correo2="";
        String nit2="45544";
        String numeroT2="34143232";
        Cliente cliente1= new Cliente(nombre,apellido,identificacion,direccion,tipoClientes2);
        listaClientes.add(cliente1);

        String nombre1= "Andres";
        String apellidos2="muños";
        int identificaciones2= Integer.parseInt("6575643345");
        String direcciones2= "Armenia";
        String tipoClientes3="Cliente Natural";
        String fecha1="!9/09/2001";
        String correo1="asdfadsf@sadfda.com";
        String nit3="";
        String numeroT3="";
        Cliente cliente2= new Cliente(nombre1,apellidos2,identificaciones2,direcciones2,tipoClientes3);
        listaClientes.add(cliente2);

    }

    /////////////////////////////////////////////////////////////////////////////
    ///////////////////// VISTA FACTURA /////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////

    public void agregarAFactura(ActionEvent event){

        String factura = txtAreaFactura.getText();
        int total = Integer.parseInt(labelTotal.getText());

        Producto p= tablaFactura.getSelectionModel().getSelectedItem();
        String nombreProductoFacturar = p.getNombre();
        int valorUnitariototal = p.getValorUnitario();
        int cantidadFacturar = Integer.parseInt(txtFieldCantidad.getText());

        int valorTotalCantidad_valorUnitario = cantidadFacturar * valorUnitariototal;
        total = total + valorTotalCantidad_valorUnitario;
        String productoFacturado = String.format("%s........ %d............%d",nombreProductoFacturar,cantidadFacturar,valorTotalCantidad_valorUnitario);

        factura = factura+productoFacturado+"\n";
        txtAreaFactura.setText(factura);
        labelTotal.setText(total+"");
        txtFieldCantidad.setText("");
    }


}
