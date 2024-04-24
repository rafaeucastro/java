/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema1;

/**
 *
 * @author Alunos
 */
interface GlobalVar{
        static final double PI = 3.14;
    }
    public class Circle implements GlobalVar {
       private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

       public double getRadius() {
           return this.radius;
       }
       public void setRadius(double radius) {
           this.radius = radius;
       }
       
       public double getArea() {
           return (this.radius*this.radius)*PI;
       }
       
        public double getCircunference() {
           return 2*PI*this.radius;
       }
        
         public double increaseRadius(double percentage) {
           return this.radius*(percentage/100);
       }
    }