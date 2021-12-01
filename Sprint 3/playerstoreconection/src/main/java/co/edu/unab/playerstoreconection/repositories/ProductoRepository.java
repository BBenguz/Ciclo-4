package co.edu.unab.playerstoreconection.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.playerstoreconection.models.ProductoModel;

@Repository
public interface ProductoRepository extends MongoRepository<ProductoModel , Long>{
    
}
