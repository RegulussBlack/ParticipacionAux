/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Fabricio
 */
public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora(double precioBase, String color, String consumoE, double peso,double carga) {
        super(precioBase, color, consumoE, peso);
    }
    public Lavadora(){
        super();
        
    }
    public void muestraLavadora(){
        
    }
  
    public double precioFinal(){
        
        if (this.carga > 30){
            return super.precioFinal()+50;
        }
        return super.precioFinal();
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    
}
