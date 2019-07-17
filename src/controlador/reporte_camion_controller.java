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
import vista.reporte_camion;

/**
 *
 * @author ANDRES COELLO
 */
public class reporte_camion_controller {
    
    private reporte_camion ventana;
    
    public reporte_camion_controller(reporte_camion ventana){
        this.ventana = ventana;
        accion();
    }
    
    public void IniciarVista(){
        ventana.setVisible(true);
    }
    
    public void accion(){
        try{
            FileReader fr = new FileReader("contador.txt");
            BufferedReader br = new BufferedReader(fr);
            int limite = Integer.parseInt(br.readLine());
            
            for(int i=0; i<limite; i++){
            FileReader leer = new FileReader("nuevo"+i+".txt");
            BufferedReader lectura_2 = new BufferedReader(leer);
            //System.out.println(lectura_2.readLine());
            ventana.insertar.append(lectura_2.readLine() + "\n");
            }
            
        }catch(Exception err){
            System.out.println("ocurrio un erro "+ err);
            JOptionPane.showMessageDialog(ventana, "No hay datos que mostrar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
