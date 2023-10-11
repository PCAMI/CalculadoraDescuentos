/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradedescuentos;

/**
 *
 * @author kamil
 */
public class DiscountCalculator {

    private double cantidadMaximaDescuento = 30;

    public DiscountCalculator() {
    }


public DiscountCalculator(double cantidadMaximaDescuento) {
        this.cantidadMaximaDescuento = cantidadMaximaDescuento;
    }

    public double calcularDescuento(double precioOriginal, double precioPagado) {
        double porcentajeDescuento =((precioOriginal - precioPagado) / precioOriginal) * 100;

        return porcentajeDescuento;
    }
    
}
