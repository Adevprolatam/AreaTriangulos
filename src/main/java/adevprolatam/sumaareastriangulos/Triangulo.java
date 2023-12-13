/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.sumaareastriangulos;

/**
 *
 * @author dell
 */
public class Triangulo {
    //Constructor 
    public Triangulo(double a, double b, double c){
        this.lado1 = a;
        this.lado2 = b;
        this.lado3 = c;
    }
    //
    private double lado1;
    private double lado2;
    private double lado3;
    
    //Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    
    public double area() {
    double s = (this.lado1 + this.lado2 + this.lado3) / 2.0;
    double a = Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
    return a;
    }
      
}
