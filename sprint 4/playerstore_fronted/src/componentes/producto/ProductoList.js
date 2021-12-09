import React, { useEffect, useState } from "react";
import axios from "axios";
import * as ReactBootStrap from "react-bootstrap";

import * as ProductoServer from "./ProductoServer";

const ProductoList = () => {
    
    const[producto,setproducto]= useState([]);
    const listProducto = async() =>{
        try{
            const res = await ProductoServer.listProducto();
            //const data = await res.json;
            //setProducto(data.producto)
            console.log(res);
            
        }catch (error){
            console.log(error);
        }
    };

    useEffect(()=>{
        listProducto();
    },[]);
    return (
        <div>
            <h1>ProductoList</h1>
            {
                producto.map((producto)=>(
                    <h2>{producto.id} {producto.nombre} {producto.apellido} </h2>
                ))
            }
        </div>  
    )
};

export default ProductoList ;