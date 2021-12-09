import React from "react";

import{
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";


import Producto from "../pages/producto";
import Detallecompra from "../pages/detallecompra";
import Usuario from "../pages/usuario";
// import UsuarioList from "../componentes/usuario/UsuarioList";


function App(){
    return(
        // <div className ="App">
        //     <UsuarioList></UsuarioList>
        // </div>
        <Router>
        <div className="container mt-5" >
            <div className="d-grid gap-2 d-md-flex mb-2">
                <Link to ="/" className="btn btn-dark">
                inicio
                </Link>
                <Link to="/usuario" className="btn btn-dark">
                Usuario
                </Link>
                <Link to="/producto" className="btn btn-dark">
                producto
                </Link>
                <Link to="/detallecompra" className="btn btn-dark">
                detallecompra
                </Link>
            </div>
            

        <Switch>
            <Route path="/">
            </Route>
        </Switch>
        <Switch>
            <Route path="/usuario">
                <Usuario/>
            </Route>
        </Switch>

        <Switch>
            <Route path="/producto">
                <Producto/>           
            </Route>
        </Switch>

        <Switch>
            <Route path="/detallecompra">
                <Detallecompra/>              
            </Route>
        </Switch>

    </div>
    </Router>
    );
}

export default App;