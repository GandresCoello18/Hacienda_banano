/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import vista.reporte_destino;

/**
 *
 * @author ANDRES COELLO
 */
public class reporte_destino_controller {
    private reporte_destino ventana;
    
    public reporte_destino_controller(reporte_destino ventana){
        this.ventana = ventana;
        accion();
    }
    
    public void IniciarVista(){
        ventana.setVisible(true);
    }
    
    public void accion(){
        try{
            FileReader fr = new FileReader("contador_vehiculo.txt");
            BufferedReader br = new BufferedReader(fr);
            int limite = Integer.parseInt(br.readLine());
            
            for(int i=0; i<limite; i++){
            FileReader leer = new FileReader("datos_destino"+i+".txt");
            BufferedReader lectura_2 = new BufferedReader(leer);
            //System.out.println(lectura_2.readLine());
            ventana.insertar_destino.append(lectura_2.readLine() + "\n");
            }
            
        }catch(Exception err){
            System.out.println("ocurrio un erro "+ err);
            JOptionPane.showMessageDialog(ventana, "No hay datos que mostrar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
