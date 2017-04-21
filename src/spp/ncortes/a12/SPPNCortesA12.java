/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortes.a12;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author Nohely C
 */
public class SPPNCortesA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicio();
        double h,imc;
        int w;
        w=solicitaPeso();
        h=solicitaEstatura();
        imc= w / Math.pow(h, 2);
        if(imc<18.5){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
        }
        if(imc>=18.5 && imc<=25){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
        }
        if(imc>25){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
        }
    }
   
    
    public static void inicio(){
        JOptionPane.showMessageDialog(null, "Usted ha ingresado a la calculadora de IMC");
    }



    public static int solicitaPeso(){
        JFrame frame = new JFrame();
        int peso=0;
        boolean flag;
        do{        
            try{
                String entrada = JOptionPane.showInputDialog(null, "Ingrese su peso en kilogramos: ");
                peso =Integer.parseInt(entrada);
                flag=false;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Intente de nuevo", " Error ", 
                                        JOptionPane.ERROR_MESSAGE);
                flag=true;
            }
        }while(flag==true);
        return peso;
    }
    
    
    public static double solicitaEstatura(){
        JFrame frame = new JFrame();
        double e=0;
        boolean flag;
        do{        
            try{
                String entrada = JOptionPane.showInputDialog(null, "Ingrese su estatura en metros: ");
                e =Double.parseDouble(entrada);
                flag=false;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Intente de nuevo", " Error ", 
                                        JOptionPane.ERROR_MESSAGE);
        flag=true;
            }
        }while(flag==true);
        return e;
    }
}