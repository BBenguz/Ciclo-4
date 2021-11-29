package co.edu.unab.playerstore.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.playerstore.models.ProductoModel;

@Repository
public interface ProductoRepository extends MongoRepository<ProductoModel , Long>{
    
}
