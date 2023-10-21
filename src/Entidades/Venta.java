/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author manub
 */
public class Venta {
    
    private int idVenta = 0;
    private Empresa empresa = new Empresa();
    private Cliente cliente = new Cliente();
    private Caja caja = new Caja();
    private Operador operador = new Operador();
    private detalleVenta DetalleVenta = new detalleVenta();
    private Date fechaHora = new Date();
    private double subTotal = 0.0;
    private double Impuesto = 0.0;
    private double Total = 0.0;

    public Venta() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public detalleVenta getDetalleVenta() {
        return DetalleVenta;
    }

    public void setDetalleVenta(detalleVenta DetalleVenta) {
        this.DetalleVenta = DetalleVenta;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(double Impuesto) {
        this.Impuesto = Impuesto;
    }

    public double getTotal() {
        return this.subTotal + (this.subTotal * this.getImpuesto());
    }

   
    
    
    
    
    
    
}
