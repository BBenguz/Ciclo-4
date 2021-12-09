import React, { useEffect, useState } from "react";
import axios from "axios";
import * as ReactBootStrap from "react-bootstrap";



const Detallecompra = () => {
    const[detallecompra,setdetallecompra]= useState({blogs:[]})
    useEffect(() => {
        
        const fetchPostList = async () =>{
            const{data} = await axios (
                "http://localhost:8080/detallecompra"
            );
            setdetallecompra({blogs:data});
            console.log(data);
        };
        fetchPostList();
    },[setdetallecompra]);
    return (
        <div>
            <ReactBootStrap.Table striped bordered hover>
                <thead>
                    <tr>
                        <th>id</th> 
                        <th>usuario</th>                       
                        <th>ciudad</th>
                        <th>producto</th><th>costo</th>
                    </tr>
                </thead>
                <tbody>
                    {detallecompra.blogs &&
                        detallecompra.blogs.map((item) => (
                            <tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{item.usuario.nombre}  {item.usuario.apellidos}</td>
                                <td>{item.ciudad}</td>
                                <td>{item.producto.nombre}</td><td> {item.producto.costo}</td>
                                
                            </tr>
                        ))
                    }                                                         
                                                                                   
                </tbody>

            </ReactBootStrap.Table>
        </div>
    )
}; 
export default Detallecompra;

