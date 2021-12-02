package co.edu.unab.playerstoreconection.repositories;


import java.util.ArrayList;


import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;

import co.edu.unab.playerstoreconection.models.UsuarioModel;


public interface UsuarioRepository extends MongoRepository<UsuarioModel , Long>{

   public abstract ArrayList <UsuarioModel> findByNombre(String nombre);
    
   public abstract ArrayList <UsuarioModel> findByCorreo(String correo);
  
   



}

