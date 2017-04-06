/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bono;

import becker.robots.*;

/**
 *
 * @author Estudiante
 */
public class Bono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City ciudad = new City();
        Matriz ej = new Matriz(ciudad);
        ej.Dibujar();
        
        Bot luke= new Bot(ciudad,11,0,Direction.EAST);
        
        
        
        while(!luke.full()){
                       
            if(luke.leftclear()){
                luke.leftr();
                luke.mover();
                luke.picking();
                luke.prehome();
            }
            else if(luke.checkfront()){
                luke.mover();
                luke.picking();
                luke.prehome();
            }
            else{
                luke.leftr();
                luke.leftr();
                luke.picking();
                luke.prehome();
                if(luke.leftclear()){
                    luke.leftr();
                    luke.picking();
                    luke.prehome();
                }
            }
        }
        if(luke.full()){
            while(!luke.home()){
                if(luke.leftclear()){
                luke.leftr();
                luke.mover(); 
               
            }
            else if(luke.checkfront()){
                luke.mover();
                
            }
            else{
                luke.leftr();
                luke.leftr();
                
                if(luke.leftclear()){
                    luke.leftr();
                    
                }
            }
            }
            
        }
        if(luke.full()&&luke.home())
        {
            for(int i=0;i<27;i++){
                System.out.println(luke.showcoordenates(i));
                
            }
        }
        
        
        
    }
        
        
        
    }
    

