import React from 'react'
import { Container, Nav, Navbar, NavDropdown } from 'react-bootstrap'
import { Link } from 'react-router-dom'

const NavBar = () => {
    return (
        <Navbar bg=" light" expand="lg">
            <Container>
                <Navbar.Brand href='/'>Inicio</Navbar.Brand>
                <Navbar.Toggle aria-controls='basic-navbar-nav'/>
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <Link className='nav-link' to="/usuario">Usuario</Link>
                        <Link className='nav-link' to="/producto">Producto</Link>
                        <Link className='nav-link' to="/detallecompra">Detalle de compra</Link>
                        <Link className='nav-link' to="/login">login</Link>
                        <NavDropdown title="Dropdown" id='basic-nav-dropdown'>
                        <NavDropdown.Item href='#action/3.1'>Action</NavDropdown.Item>
                        <NavDropdown.Item href='#action/3.2'>Another action</NavDropdown.Item>
                        <NavDropdown.Item href='#action/3.3'>Something</NavDropdown.Item>
                        <NavDropdown.Divider/>
                        <NavDropdown.Item href='#action/3.4'>Separate link</NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
 
    )
}

export default NavBar
