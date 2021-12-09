import React, { useEffect, useState } from "react";
import axios from "axios";
import * as ReactBootStrap from "react-bootstrap";
import * as DetalleCompraServer from "./DetalleCompraServer";

const DetalleCompraList = () => {
    
    const[detallecompra,setDetalleCompra]= useState([]);
    const listDetalleCompra = async() =>{
        try{
            const res = await DetalleCompraServer.listDetalleCompra();
            //const data = await res.json;
            //setDetalleCompra(data.detallecompra)
            console.log(res);
            
        }catch (error){
            console.log(error);
        }
    };

    useEffect(()=>{
        listDetalleCompra();
    },[]);
    return (
        <div>
            <h1>DetalleCompraList</h1>
            {
                detallecompra.map((detallecompra)=>(
                    <h2>{detallecompra.id} {detallecompra.nombre} {detallecompra.apellido} </h2>
                ))
            }
        </div>  
    )
};

export default DetalleCompraList ;