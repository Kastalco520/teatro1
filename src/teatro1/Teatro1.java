/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatro1;

import control.BaseDatos;

/**
 *
 * @author Alejo
 */
public class Teatro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BaseDatos objb=new BaseDatos();
        boolean t=objb.crearConexion();
        
        if(t==true){
            System.out.println("Conexión Exitosa ");
        }else{
            System.out.println("Conexión No Exitosa ");
        }
        
        
        
    }
    
}
