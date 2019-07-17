/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import vista.login;

/**
 *
 * @author ANDRES COELLO
 */
public class login_modelo {
    public String usuario;
    public String clave;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public String validar(){
        login vent = new login();
        if("Andres".equals(this.usuario) && "1234567".equals(this.clave)){
            JOptionPane.showMessageDialog(vent, "Datos correctos, Bienvenido", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            return "Exito";
        }else{
            JOptionPane.showMessageDialog(vent, "Datos incorrectos, intentelo nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
            return "Error";
        }
    }
    
}
