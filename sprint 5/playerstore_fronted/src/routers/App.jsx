import React from "react";

import{
    Switch,
    Route,
    BrowserRouter,
} from "react-router-dom";


import Producto from "../pages/producto";
import Detallecompra from "../pages/detallecompra";
import Usuario from "../pages/usuario";
import NavBar from "../componentes/NavBar";
import Layout from "../container/Layout";
import Notfound from "../pages/notfound";
import Login from "../pages/login";



function App(){
    return(
        
        <BrowserRouter>        
            <Layout>
            <NavBar/>         
        <Switch>
            <Route exact path="/"></Route>
            <Route exact path="/login" component={Login}></Route>
            <Route exact path="/usuario" component={Usuario}></Route>
            <Route exact path="/producto" component={Producto}></Route>
            <Route exact path="/detallecompra" component={Detallecompra}></Route>
            <Route exact path="*" component={Notfound}></Route>
            
            </Switch>
            </Layout>
    </BrowserRouter>
    );
}

export default App;