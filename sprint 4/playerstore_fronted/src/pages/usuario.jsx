import React, { useEffect, useState } from "react";
import axios from "axios";
import * as ReactBootStrap from "react-bootstrap";


const Usuario = () => {
    
    const[usuarios,setusuarios]= useState({blogs:[]})

    useEffect(() => {
        const fetchPostList = async () =>{
            const{data} = await axios (
                "http://localhost:8080/usuario"
            );
            setusuarios({blogs:data});
            console.log(data);
        };

        // listUsuario();
        fetchPostList();
    },[setusuarios]);
    return (
        <div>
            <ReactBootStrap.Table striped bordered hover>
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>nombre</th>
                            <th>apellidos</th>
                        </tr>
                    </thead>
                    <tbody>
                        {usuarios.blogs &&
                            usuarios.blogs.map((item) => (
                                <tr key={item.id}>
                                    <td>{item.id}</td>
                                    <td>{item.nombre}</td>
                                    <td>{item.apellidos}</td>
                                </tr>   
                            ))
                        }    
                            
                    </tbody>    
            </ReactBootStrap.Table>
        </div>  
    )
}

export default Usuario ;
