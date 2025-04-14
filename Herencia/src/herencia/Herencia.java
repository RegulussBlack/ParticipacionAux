/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author Fabricio
 */
public class Herencia {
    public static void main(String[] args) {
        Electrodomestico eP = new Electrodomestico(12.0, "rojo", "B", 22);
        System.out.println("precio del electrodomestico = " + eP.precioFinal());
        
        Lavadora l = new Lavadora(12.0, "rojo", "B", 22, 31);
        double precioLavadora = l.precioFinal();
        System.out.println("precio de la lavadora = " + precioLavadora);
        
        Television t = new Television(12.0, "rojo", "B", 22, 55, true);
        double precioTelevision = t.precioFinal();
        System.out.println("precio de la television = " + precioTelevision);
        
        Microondas m1 = new Microondas(150.0, "blanco", "C", 12, 25, "baja");
        Microondas m2 = new Microondas(200.0, "negro", "B", 15, 30, "media");
        
        System.out.println("precio de la microondas = " + m1.precioFinal());
        System.out.println("precio de la microondas = : " + m2.precioFinal());
        
    }
}
