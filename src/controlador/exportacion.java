/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import vista.control_banano;
import java.text.DecimalFormat;
import java.io.*;
import java.util.Date;
import controlador.control_banano_controller;
/**
 *
 * @author ANDRES COELLO
 */
public class exportacion extends control_banano_controller{
    
    public exportacion(int vehiculo_vacion,String carga ,String matricula ,int peso_caja_libra, String destino){
        super(vehiculo_vacion, carga, matricula ,peso_caja_libra, destino);
    }
    
    public void mensaje(){
            
        control_banano vent = new control_banano();
        JOptionPane.showMessageDialog(vent, "Su producto de "+ this.vehiculo_cargado +" toneladas de banano con matricula vehicular, "+this.matricula_vehiculo +" sera exportado a "+this.destino, "Importante", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public String calculo(int vacio, int libra_caja, int cantidad){
        try{
            double total;
            String total_2;
            DecimalFormat formato1 = new DecimalFormat("#.00");
            total = libra_caja * cantidad;
            total = total / 2.205; // de libras a kilos
            total = total / 100; // de kilos a toneladas
            total = total + vacio;// sumando peso vacio con total
            total_2 = formato1.format(total); // limite de 2 decimal
            
            return total_2;
        }catch(Exception err){
            return "null";
        }
    }
    
    public void archivos(String carga, String Matricula){
         
        try{
            FileReader fr = new FileReader("contador.txt");
            BufferedReader br = new BufferedReader(fr);
            
            int contador = Integer.parseInt(br.readLine());
            
            Date objDate = new Date();
            String text = "Datos del camio: Carga total es: "+ carga +" toneladas , la placa del vehiculo es: "+ Matricula +", se llevo a cabo el: "+ objDate.toString()+ " .";
            PrintWriter pw = new PrintWriter("nuevo"+contador+".txt");
            pw.print(text);
            pw.close();
            
            PrintWriter c = new PrintWriter("contador.txt");
            contador += 1;
            c.print(String.valueOf(contador));
            c.close();
        }catch(Exception err){
            System.out.println("Erros "+ err);
        }
    }
    
    public void archivos_destino(int cantidad, String destino){
        try{
            FileReader fr = new FileReader("contador_vehiculo.txt");
            BufferedReader br = new BufferedReader(fr);
            
            int contador = Integer.parseInt(br.readLine());
            
            Date objDate = new Date();
            String text = "Datos: La Carga total de cajas enviada es: "+ cantidad +", y fue llevada a "+ destino + " en la fecha " +objDate.toString()+ " .";
            PrintWriter pw = new PrintWriter("datos_destino"+contador+".txt");
            pw.print(text);
            pw.close();
            
            PrintWriter c = new PrintWriter("contador_vehiculo.txt");
            contador += 1;
            c.print(String.valueOf(contador));
            c.close();
        }catch(Exception err){
            System.out.println("Erros "+ err);
        }
    }   
}