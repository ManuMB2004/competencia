package com.mycompany.quickcart;

import interfaz.VentanaLogin;
import modelo.SistemaEcommerce;
import modelo.Administrador;

public class Quickcart {
    public static void main(String[] args) {
        SistemaEcommerce sistema = new SistemaEcommerce();
        
        Administrador admin = new Administrador("A1", "Admin", "admin@quickcart.com", "admin123");
        sistema.registrarUsuario(admin);
        
        new VentanaLogin(sistema);
    }
}