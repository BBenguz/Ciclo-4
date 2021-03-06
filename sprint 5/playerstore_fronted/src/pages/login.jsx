import React from 'react'
import "./login.css"

const login = () => {
    return (
        
        <html lang="en">
        <head>
            <meta charset="UTF-8"/>
            <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous"/>
            <link rel="stylesheet" type="text/css" href="/sprint 5/playerstore_fronted/src/pages/login.css"/> 
            <script src="/sprint 5/playerstore_fronted/src"></script>
            <title>login player's_store</title>
            
        </head>
        <body>
            <header>
                <nav class="navbar navbar-expand-lg navbar-light">
                    <p  class="logo" width="100" height="88"  alt="players_store"/>
                    <p >PLAYER'S STORE</p>
                    <div class="collapse navbar-collapse" id="navbarNav">
                    </div>
                </nav>
            </header>



            

            <form id="login"> 
                <div class="container1">
                <div class="row">
                    <h1 class="titulo">BIENVENIDO</h1>
                    <input class="form-control" id="usuario" type="text"  placeholder="Usuario" />
                    <input class="form-control" id="contra" type="password"  placeholder="Contraseña" />
                    <button class="btn-inicio" id="btn" type="button" onclick="validar_login()">Iniciar sesion</button>  
                    <p class="registrarse" href="">¿Has olvidado la contraseña?</p>
                    <p class="registrarse" href="register.html">Registrarse</p>
                </div>
                </div>  
            </form>








            <footer class="page-footer font-small teal pt-6">
                <div class="container-fluid text-md-left text-md-left footer-content">
                <div class="row">
                    <div class="col-md-6 mt-md-0 mt-3">
                    <h5 class="text-uppercase font-weight-bold">player's_store</h5>
                    <p>Esta pagina pertenece a player's_store el cual es el nuevo supermercado Virtual, que ofrece calidad,
                        precio y facilidad en las compras.</p>
                    </div>
                    <hr class="clearfix w-100 d-md-none pb-3"/>
                    <div class="col-md-6 mb-md-0 mb-3">
                    <h5 class="text-uppercase font-weight-bold">Contactanos</h5>
                    <p><i class="fas fa-phone-alt"></i> Celular - 3211234567</p>
                    <p><i class="fab fa-whatsapp"></i> WhatsApp - 3211234567</p>
                    <p><i class="fas fa-envelope-open-text"></i> Correo: contacto@players_store.com.co</p>
                    </div>
                </div>
                </div>
                <div class="footer-copyright text-center py-3">© 2021 Copyright:
                <p href="#"> MISIONTIC PLAYER'S_STORE</p>
                </div>
            </footer>
        </body>
        </html>
    )
}

export default login
