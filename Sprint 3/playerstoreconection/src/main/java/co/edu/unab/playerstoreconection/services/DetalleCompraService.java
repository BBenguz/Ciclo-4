package co.edu.unab.playerstoreconection.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.playerstoreconection.models.DetalleCompraModel;
import co.edu.unab.playerstoreconection.models.ProductoModel;
import co.edu.unab.playerstoreconection.models.UsuarioModel;
import co.edu.unab.playerstoreconection.repositories.DetalleCompraRepository;


@Service
public class DetalleCompraService {
    @Autowired
    DetalleCompraRepository detallecompraRepository;



    public ArrayList<DetalleCompraModel> obtenerDetalleCompra(){
        return (ArrayList<DetalleCompraModel>) detallecompraRepository.findAll();
    }

    public DetalleCompraModel guardarDetalleCompra(DetalleCompraModel detallecompra){
        return detallecompraRepository.save(detallecompra);
    }

    public boolean eliminarDetalleCompra(Long id){
        if (detallecompraRepository.existsById(id)){
            detallecompraRepository.deleteById(id);
            return true;            
        }else{
            return false;
        }
    }


    public Optional<DetalleCompraModel> obtenerDetalleCompraPorId(Long id){
        return detallecompraRepository.findById(id);
    }

    public ArrayList<DetalleCompraModel> obtenerDetalleCompraPorUsuario(UsuarioModel usuario){
        return detallecompraRepository.findByUsuario(usuario);
    }

    public ArrayList<DetalleCompraModel> obtenerDetallerCompraPorProducto(ProductoModel producto){
        return detallecompraRepository.findByProducto(producto);
    }

    public ArrayList<DetalleCompraModel> obtenerDetallerCompraPorCiuddad(String ciudad){
        return detallecompraRepository.findByCiudad(ciudad);
    }


}
