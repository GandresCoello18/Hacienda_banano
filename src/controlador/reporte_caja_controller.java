/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import vista.reporte_caja;

/**
 *
 * @author ANDRES COELLO
 */
public class reporte_caja_controller {
    
    private reporte_caja ventana;
    
    public reporte_caja_controller(reporte_caja ventana){
        this.ventana = ventana;
        accion();
    }
    
    public void IniciarVista(){
        ventana.setVisible(true);
    }
    
    public void accion(){
        try{
            FileReader fr = new FileReader("bodega.txt");
            BufferedReader br = new BufferedReader(fr);
            //int limite = Integer.parseInt(br.readLine());
            
            for(int i=0; i<1; i++){
            //System.out.println(lectura_2.readLine());
            ventana.insertar_caja.append(br.readLine() + " Cajas de fondo " + "\n");
            ventana.insertar_caja.append(br.readLine() + " Laminas " + "\n");
            ventana.insertar_caja.append(br.readLine() + " Fundas " + "\n");
            ventana.insertar_caja.append(br.readLine() + " Tapas " + "\n");
            }
            
        }catch(Exception err){
            System.out.println("ocurrio un erro "+ err);
            JOptionPane.showMessageDialog(ventana, "No hay datos que mostrar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
