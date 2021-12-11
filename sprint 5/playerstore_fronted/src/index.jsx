import React from 'react';
import ReactDOM from 'react-dom';
import App  from "./routers/App";
import 'bootstrap/dist/css/bootstrap.min.css';



//import UsuarioList from './componentes/usuario/UsuarioList'
//import ProductoList from './componentes/producto/ProductoList'
//import DetalleCompraList from './componentes/detallecompra/DetalleCompraList';

ReactDOM.render(
  <React.StrictMode>
    {/* <UsuarioList />
    <ProductoList/>
    <DetalleCompraList/> */}
    <App />

  </React.StrictMode>,
  document.getElementById('root')
);

