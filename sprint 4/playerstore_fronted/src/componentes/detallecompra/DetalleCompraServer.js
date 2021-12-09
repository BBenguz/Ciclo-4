const API_URL="http://localhost:8080/detallecompra/"

export const listDetalleCompra =() =>{
    return fetch (API_URL).then(response => response.json());    
}