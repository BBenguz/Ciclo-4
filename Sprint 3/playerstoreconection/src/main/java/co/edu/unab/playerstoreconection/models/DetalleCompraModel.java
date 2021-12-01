package co.edu.unab.playerstoreconection.models;

import org.springframework.data.annotation.Id;

public class DetalleCompraModel {
    
    @Id
    private Long id;


    private UsuarioModel usuario;
    private String ciudad;
    private String direccion;
    private ProductoModel producto;
    private Integer costo_total;

    
    public DetalleCompraModel() {
    }


    public DetalleCompraModel(Long id, UsuarioModel usuario, String ciudad, String direccion, ProductoModel producto,
            Integer costo_total) {
        this.id = id;
        this.usuario = usuario;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.producto = producto;
        this.costo_total = costo_total;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public UsuarioModel getUsuario() {
        return usuario;
    }


    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public ProductoModel getProducto() {
        return producto;
    }


    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }


    public Integer getCosto_total() {
        return costo_total;
    }


    public void setCosto_total(Integer costo_total) {
        this.costo_total = costo_total;
    }

    
   
    
}
