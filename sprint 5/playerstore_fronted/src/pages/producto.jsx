import React, { useEffect, useState } from "react";
import axios from "axios";
import * as ReactBootStrap from "react-bootstrap";

const Producto = () => {
    const[productos,setproductos]= useState({blogs:[]})
    useEffect(() => {
        
        const fetchPostList = async () =>{
            const{data} = await axios (
                "http://localhost:8080/producto"
            );
            setproductos({blogs:data});
            console.log(data);
        };
        fetchPostList();
    },[setproductos]);
    return (
        <div>
            <ReactBootStrap.Table striped bordered hover>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>nombre</th>
                        <th>costo</th>
                    </tr>
                </thead>
                <tbody>
                    {productos.blogs &&
                        productos.blogs.map((item) => (
                            <tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{item.nombre}</td>
                                <td>{item.costo}</td>
                            </tr>
                        ))
                    }
                </tbody>

            </ReactBootStrap.Table>
        </div>
    )
}; 
export default Producto;


