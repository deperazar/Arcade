/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bono;
import becker.robots.*;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Bot {
    private Robot juni;
    private City maze;
    private Coordenada[] position;
    
    public Bot(City n,int i,int f,Direction w){
       
        juni=new Robot(n,i,f,w);
        position=new Coordenada[30];
    }
    
    public void mover(){
        juni.move();
    }
    public void leftr(){
        juni.turnLeft();
    }
    public void rightr(){
        juni.setSpeed(1000);
        juni.turnLeft();
        juni.turnLeft();
        juni.turnLeft();
        juni.setSpeed(3);
    }
    int z=0;
    public void picking(){
        
        if(juni.canPickThing()==true){
            juni.pickThing();
            position[z]=new Coordenada(juni.getAvenue(),juni.getStreet());
            z++;
        }
    }
    
   
    
    public boolean home(){
        if(juni.getAvenue()==13&&juni.getStreet()==0){
            juni.turnLeft();
            juni.turnLeft();
            return true;
        }
        return false;
    }
    
    public void prehome(){
        if(juni.getAvenue()==13&&juni.getStreet()==0){
            juni.turnLeft();
            juni.turnLeft();
        }
    }
    
    public boolean full(){
        if(juni.countThingsInBackpack()==27){
            return true;
        }
        return false;
    }
    
    public String showcoordenates(int i){
        return "\nCoordenadas cosa: "+(1+i)+" X: "+position[i].getx()+" Y: "+position[i].gety();
    }
    
    
    public boolean checkfront(){
        if(juni.frontIsClear()==true){
            return true;
        }
        return false;
    }
    
    public boolean leftclear(){
        juni.setSpeed(1000);
        juni.turnLeft();
        if(juni.frontIsClear()==false){
            juni.turnLeft();
            juni.turnLeft();
            juni.turnLeft();
            juni.setSpeed(3);
            return false;
        }
            juni.turnLeft();
            juni.turnLeft();
            juni.turnLeft();
            juni.setSpeed(3);
            return true;
    }
    public boolean rightclear(){
        juni.setSpeed(1000);
        juni.turnLeft();
        juni.turnLeft();
        juni.turnLeft();
        
        if(juni.frontIsClear()==false){
            juni.turnLeft();   
            juni.setSpeed(3);
            return false;
        }
            juni.turnLeft();
            juni.setSpeed(3);
            
            
            return true;
    }
    
    
    
}
