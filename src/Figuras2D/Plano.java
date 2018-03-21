/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras2D;

/**
 *
 * @author Alumno
 */
public class Plano extends Figuras2D {
    
    private double x = 0;
    private double y = 0;
    
    public Plano (int x, int y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double setX(int x){
        this.x = x;        
    }
    
    public double getY(){
        return y;
    }
     public double setY(int y){
        this.y = y;
    }
     
}
