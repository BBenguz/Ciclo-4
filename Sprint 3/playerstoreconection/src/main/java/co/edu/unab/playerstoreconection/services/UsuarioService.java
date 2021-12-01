package co.edu.unab.playerstoreconection.services;

import java.util.ArrayList;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import co.edu.unab.playerstoreconection.models.UsuarioModel;
import co.edu.unab.playerstoreconection.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuario(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(Long id){
        if (usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
            return true;            
        }else{
            return false;
        }
    }


    public Optional<UsuarioModel> obtenerUsuarioPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public ArrayList<UsuarioModel> obtenerUsuarioPorNombre(String nombre){
        return  (ArrayList<UsuarioModel>) usuarioRepository.findByNombre(nombre);
    }

    public ArrayList<UsuarioModel> obtenerUsuarioPorCorreo(String correo){
        return (ArrayList<UsuarioModel>)usuarioRepository.findByCorreo(correo);
    }
    

    
    
    
}
