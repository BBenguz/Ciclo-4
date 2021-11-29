package co.edu.unab.playerstore.models;

import org.springframework.data.annotation.Id;



public class UsuarioModel { 

    @Id
    private Long id;

    private String nombre;
    private String apellidos;
    private String fecha_de_nacimiento;
    private String correo;
    private String contrasena;
    private String contrasena1;
    private String pais;


    public UsuarioModel() {
    }


    public UsuarioModel(Long id, String nombre, String apellidos, String fecha_de_nacimiento, String correo,
            String contrasena, String contrasena1, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.correo = correo;
        this.contrasena = contrasena;
        this.contrasena1 = contrasena1;
        this.pais = pais;
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



    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }



    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }



    public String getCorreo() {
        return correo;
    }



    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public String getContrasena() {
        return contrasena;
    }



    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }



    public String getContrasena1() {
        return contrasena1;
    }



    public void setContrasena1(String contrasena1) {
        this.contrasena1 = contrasena1;
    }



    public String getPais() {
        return pais;
    }



    public void setPais(String pais) {
        this.pais = pais;
    }

    
}
