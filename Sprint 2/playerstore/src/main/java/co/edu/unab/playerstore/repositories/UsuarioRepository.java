package co.edu.unab.playerstore.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.playerstore.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends MongoRepository<UsuarioModel , Long>{

    
    
}
