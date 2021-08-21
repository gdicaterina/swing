/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author gaboo
 */
public class convertirMoneda {
    
    private double Moneda;
    
    
public void setMonto(double Moneda){
    this.Moneda = Moneda;
}

public double getMonto(){
    return this.Moneda;
}

public double convierteDolares(double Moneda){
    
    this.Moneda = Moneda;
    double dolares;
    dolares = Moneda * 0.023100;
    
    return dolares;
}

public double convierteArgentinos(double Moneda){
    
    this.Moneda = Moneda;
    double argentinos;
    argentinos = Moneda * 2.25;
    
    return argentinos;
}

public double convierteReales(double Moneda){
    
    this.Moneda = Moneda;
    double Reales;
    Reales = Moneda * 0.12;
    
    return Reales;
}
  
    
}
