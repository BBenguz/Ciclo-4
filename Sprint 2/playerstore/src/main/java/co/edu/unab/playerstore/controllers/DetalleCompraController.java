package co.edu.unab.playerstore.controllers;

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

import co.edu.unab.playerstore.models.DetalleCompraModel;
import co.edu.unab.playerstore.services.DetalleCompraService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/detallecompra")
public class DetalleCompraController {
    @Autowired
    DetalleCompraService detalleCompraService;


    @GetMapping()
    public ArrayList<DetalleCompraModel> obteneDetalleCompra(){
        return detalleCompraService.obtenerDetalleCompra();
    }

    @PostMapping()
    public DetalleCompraModel guardDetalleCompraModel(@RequestBody DetalleCompraModel detalleCompra){
        return detalleCompraService.guardarDetalleCompra(detalleCompra);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarDetalleCompraPorId(@PathVariable("id")Long id){
        boolean resultadoEliminar=this.detalleCompraService.eliminarDetalleCompra(id);
        if(resultadoEliminar){
            return "Se elimino los detalles de la compra  con id " +id;
        }else{
            return "No se elimino los detalles de la compra con el id " +id;
        }
        
    }
    

    @GetMapping(path = "/{id}")
    public Optional<DetalleCompraModel>obtenerDetalleCompraPorId(@PathVariable("id") Long id ){
        return this.detalleCompraService.obtenerDetalleCompraPorId(id);
    }
}
