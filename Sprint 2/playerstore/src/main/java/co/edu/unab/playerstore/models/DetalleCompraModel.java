package co.edu.unab.playerstore.models;

import org.springframework.data.annotation.Id;

public class DetalleCompraModel {
    
    @Id
    private Long id;

    private String nombre;
    private String apellidos;
    private String correo;
    private String pais;
    private String ciudad;
    private String direccion;
    private String productos;
    private Integer costo_total;

    
    public DetalleCompraModel() {
    }


    public DetalleCompraModel(Long id, String nombre, String apellidos, String correo, String pais, String ciudad,
            String direccion, String productos, Integer costo_total) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.productos = productos;
        this.costo_total = costo_total;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
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


    public String getProductos() {
        return productos;
    }


    public void setProductos(String productos) {
        this.productos = productos;
    }


    public Integer getCosto_total() {
        return costo_total;
    }


    public void setCosto_total(Integer costo_total) {
        this.costo_total = costo_total;
    }

    
}
