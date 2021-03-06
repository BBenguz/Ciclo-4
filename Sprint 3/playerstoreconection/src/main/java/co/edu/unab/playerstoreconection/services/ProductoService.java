package co.edu.unab.playerstoreconection.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.playerstoreconection.models.ProductoModel;
import co.edu.unab.playerstoreconection.repositories.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;



    public ArrayList<ProductoModel> obtenerProducto(){
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel guardarProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }

    public boolean eliminarProducto(Long id){
        if (productoRepository.existsById(id)){
            productoRepository.deleteById(id);
            return true;            
        }else{
            return false;
        }
    }


    public Optional<ProductoModel> obtenerProductoPorId(Long id){
        return productoRepository.findById(id);
    }

    public ArrayList <ProductoModel> obtenerProductoPorNombre(String nombre){
        return  productoRepository.findByNombre(nombre);
    }

    public ArrayList <ProductoModel> obtenerProductoPorCosto(Integer costo){
        return productoRepository.findByCosto(costo);
    }
}
