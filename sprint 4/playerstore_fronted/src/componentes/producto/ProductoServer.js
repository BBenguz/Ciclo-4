const API_URL="http://localhost:8080/producto/"

export const listProducto =() =>{
    return fetch (API_URL).then(response => response.json());    
}