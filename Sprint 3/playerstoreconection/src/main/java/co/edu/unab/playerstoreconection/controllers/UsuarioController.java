package co.edu.unab.playerstoreconection.controllers;


import java.util.ArrayList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.playerstoreconection.models.UsuarioModel;
import co.edu.unab.playerstoreconection.services.UsuarioService;









@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;



    @GetMapping()
    public ArrayList<UsuarioModel> obteneUsuario(){
        return usuarioService.obtenerUsuario();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUsuarioPorId(@PathVariable("id")Long id){
        boolean resultadoEliminar=this.usuarioService.eliminarUsuario(id);
        if(resultadoEliminar){
            return "Se elimino el usuario con id " +id;
        }else{
            return "No se elimino el usuario con el id " +id;
        }
        
    }
    

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel>obtenerUsuarioPorId(@PathVariable("id") Long id ){
        return this.usuarioService.obtenerUsuarioPorId(id);
    }

    //Encontrar el error! tododos los get funcionan pero independientes cuando se coploca el "path"
    // correctamente sale un error en el postman  
    @GetMapping(path = "/{nombre}")
    public ArrayList<UsuarioModel>obtenerUsuarioPorNombre(@PathVariable("nombre") String nombre){
        return this.usuarioService.obtenerUsuarioPorNombre(nombre);
    }

    @GetMapping(path = "/e")
    public ArrayList<UsuarioModel>obtenerUsuarioPorCorreo(@PathVariable("correo") String correo){
        return this.usuarioService.obtenerUsuarioPorCorreo(correo);
    }

    
    
    
    

}
