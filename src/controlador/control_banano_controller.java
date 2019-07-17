/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author ANDRES COELLO
 */
public class control_banano_controller {
    
    public int vehiculo_vacio;
    public String vehiculo_cargado;
    public String matricula_vehiculo;
    public int peso_caja_libra;
    public String destino;
    
    public control_banano_controller(int vacio, String carga, String matricula ,int caja, String destino){
        this.vehiculo_vacio = vacio;
        this.vehiculo_cargado = carga;
        this.matricula_vehiculo = matricula;
        this.peso_caja_libra = caja;
        this.destino = destino;
    }

    public String getMatricula_vehiculo() {
        return matricula_vehiculo;
    }

    public void setMatricula_vehiculo(String matricula_vehiculo) {
        this.matricula_vehiculo = matricula_vehiculo;
    }

    public int getVehiculo_vacio() {
        return vehiculo_vacio;
    }

    public String getVehiculo_cargado() {
        return vehiculo_cargado;
    }

    public void setVehiculo_cargado(String vehiculo_cargado) {
        this.vehiculo_cargado = vehiculo_cargado;
    }

    public void setVehiculo_vacio(int vehiculo_vacio) {
        this.vehiculo_vacio = vehiculo_vacio;
    }

    public int getPeso_caja_libra() {
        return peso_caja_libra;
    }

    public void setPeso_caja_libra(int peso_caja_libra) {
        this.peso_caja_libra = peso_caja_libra;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    
}
