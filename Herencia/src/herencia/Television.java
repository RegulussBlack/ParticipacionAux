/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Fabricio
 */
public class Television extends Electrodomestico {
    private double resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = 0.0;
        this.sintonizadorTDT = false;
        
    }

    public Television(double p, String c, String cE, double pes,double res, boolean sint) {
        super(p, c, cE, pes);
        this.resolucion = res;
        this.sintonizadorTDT = sint;
    }
    public double precioFinal(){
        
        if (this.resolucion > 50 && this.sintonizadorTDT == true){
            return ((super.precioFinal())*1.3)+50;
        }
        else if (this.resolucion > 50)
            return ((super.precioFinal()*1.30));
        else if (this.sintonizadorTDT == true){
            return (super.precioFinal()+50);
        }
        else{
            return super.precioFinal();
        }
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
    
    
}
