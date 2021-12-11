const API_URL="http://localhost:8080/usuario/"

export const listUsuario =() =>{
    return fetch (API_URL).then(response => response.json());    
}