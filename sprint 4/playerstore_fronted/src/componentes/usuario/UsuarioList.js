import React, { useEffect, useState } from "react";
import axios from "axios";
import * as ReactBootStrap from "react-bootstrap";

// import * as UsuarioServer from "./UsuarioServer";

const UsuarioList = () => {
    
    const[usuarios,setUsuarios]= useState({blogs:[]})
    // const listUsuario = async() =>{
    //     try{
    //         const res = await UsuarioServer.listUsuario();
    //         //const data = await res.json;
    //         //setUsuarios(data.usuario)
    //         console.log(res);
            
    //     }catch (error){
    //         console.log(error);
    //     }
    // };

    useEffect(() => {
        const fetchPostList = async () =>{
            const{data} = await axios (
                "http://localhost:8080/usuario"
            );
            setUsuarios({blogs:data});
            console.log(data);
        };

        // listUsuario();
        fetchPostList();
    },[setUsuarios]);
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
            {/* {
                usuarios.map((usuario)=>(
                    <h2>{usuario.id} {usuario.nombre} {usuario.apellido} </h2>
                ))
            } */}
        </div>  
    )
}

export default UsuarioList ;