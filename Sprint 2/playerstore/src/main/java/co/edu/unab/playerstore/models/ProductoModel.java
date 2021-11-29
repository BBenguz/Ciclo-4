package co.edu.unab.playerstore.models;

import org.springframework.data.annotation.Id;

public class ProductoModel {

    @Id 
    private Long id;

    private String nombre;
    private Integer costo;
    private boolean disponibilida;
    private Integer cantidad;
    private String descripcion;
    
    
    public ProductoModel() {
    }


    public ProductoModel(Long id, String nombre, Integer costo, boolean disponibilida, Integer cantidad,
            String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.disponibilida = disponibilida;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
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


    public Integer getCosto() {
        return costo;
    }


    public void setCosto(Integer costo) {
        this.costo = costo;
    }


    public boolean isDisponibilida() {
        return disponibilida;
    }


    public void setDisponibilida(boolean disponibilida) {
        this.disponibilida = disponibilida;
    }


    public Integer getCantidad() {
        return cantidad;
    }


    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    


    
}
