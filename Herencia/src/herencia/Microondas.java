/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Fabricio
 */
public class Microondas extends Electrodomestico {
    //almenos 2 atributos
    //sobrecargar el metodo  precioFinal
    //el metodo calcula si la gama es baja media alta 
        //sies gama baja el precio reduce un 10%
        //si es gama media el precio se mantiene
        //si es gama alta el precio aumenta un 23%
    private double capacidad; 
    private String gama; 

    public Microondas() {
        super();
        this.capacidad = 20.0;
        this.gama = "media";
    }

    public Microondas(double precioBase, String color, String consumoE, double peso, 
                     double capacidad, String gama) {
        super(precioBase, color, consumoE, peso);
        this.capacidad = capacidad;
        this.gama = comprobarGama(gama);
    }

    private String comprobarGama(String gama) {
        gama = gama.toLowerCase();
        if(gama.equals("baja") || gama.equals("alta")) {
            return gama;
        } else {
            return "media";
        }
    }

   
    public double precioFinal() {
        double precio = super.precioFinal();
        
        if(this.gama.equals("baja")) {
            precio *= 0.90; // 10% 
        } 
        else if(this.gama.equals("alta")) {
            precio *= 1.23; // 23% 
        }
      
        
        return precio;
    }

    
    public double precioFinal(String gamaParam) {
        double precio = super.precioFinal();
        gamaParam = gamaParam.toLowerCase();
        
        if(gamaParam.equals("baja")) {
            precio *= 0.90;
        } 
        else if(gamaParam.equals("alta")) {
            precio *= 1.23;
        }
       
        
        return precio;
    }

   
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = comprobarGama(gama);
    }
}
    

