package co.edu.unab.playerstoreconection.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.playerstoreconection.models.DetalleCompraModel;
import co.edu.unab.playerstoreconection.models.ProductoModel;
import co.edu.unab.playerstoreconection.models.UsuarioModel;

@Repository
public interface DetalleCompraRepository extends MongoRepository<DetalleCompraModel , Long> {


    public abstract ArrayList <DetalleCompraModel> findByUsuario(UsuarioModel usuario);

    public abstract ArrayList <DetalleCompraModel> findByCiudad(String ciudad);

    public abstract ArrayList <DetalleCompraModel> findByProducto(ProductoModel producto);
}
