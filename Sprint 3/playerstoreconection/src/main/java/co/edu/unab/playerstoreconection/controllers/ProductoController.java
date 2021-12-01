package co.edu.unab.playerstoreconection.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.playerstoreconection.models.ProductoModel;
import co.edu.unab.playerstoreconection.services.ProductoService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;


    @GetMapping()
    public ArrayList<ProductoModel> obteneProducto(){
        return productoService.obtenerProducto();
    }

    @PostMapping()
    public ProductoModel guardarProducto(@RequestBody ProductoModel producto){
        return productoService.guardarProducto(producto);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarProductoPorId(@PathVariable("id")Long id){
        boolean resultadoEliminar=this.productoService.eliminarProducto(id);
        if(resultadoEliminar){
            return "Se elimino el producto con id " +id;
        }else{
            return "No se elimino el producto con el id " +id;
        }
        
    }
    

    @GetMapping(path = "/{id}")
    public Optional<ProductoModel>obtenerProductoPorId(@PathVariable("id") Long id ){
        return this.productoService.obtenerProductoPorId(id);
    }
    
}
