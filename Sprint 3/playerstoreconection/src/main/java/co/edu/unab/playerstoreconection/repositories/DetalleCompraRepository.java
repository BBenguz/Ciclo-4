package co.edu.unab.playerstoreconection.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.playerstoreconection.models.DetalleCompraModel;

@Repository
public interface DetalleCompraRepository extends MongoRepository<DetalleCompraModel , Long> {
    
}
