package co.edu.unab.playerstoreconection.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.playerstoreconection.models.ProductoModel;

@Repository
public interface ProductoRepository extends MongoRepository<ProductoModel , Long>{

    public abstract ArrayList <ProductoModel> findByNombre(String nombre);

    public abstract ArrayList <ProductoModel> findByCosto(Integer costo);
    
}
