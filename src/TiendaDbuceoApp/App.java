/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaDbuceoApp;

import Entidades.*;
import java.util.Date;


/**
 *
 * @author manub
 */
public class App {
    
    public static void main(String[] args) {
        
        Empresa empresa =  new Empresa();
        empresa.setIdEmpresa(00023000100022);
        empresa.setNombre("Tienda de articulos de buceo");
        empresa.setDomicilio("Lote 2, manzana 45, colonia Moderna, cP: 85330");
        empresa.setTelefono("622-105-1175");
        empresa.setRfc("GORM0410156R3");
        empresa.setCorreoElectronico("TiendaDbuceo243@gmail.com");
        empresa.setPaginaWeb("www.TiendaBuceo.mx ");
        empresa.setRegistroPatronal("XXX-0232-YYY");
       
        Operador operador = new Operador();
        operador.setIdOperador(00001234);
        operador.setNombre("Sebastian Rodgriguez Sanchez");
        operador.setDomicilio("Callejon abasolo, lote 35, colonia Moderna, CP: 85330");
        operador.setTelefono("622-167-3158");
        operador.setPaginaWeb("www.facebook.Sebas.mx");
        operador.setRfc("MASISDD88893E4");
        operador.setCorreoElectronico("SebasRS23@gmail.com");
        operador.setCurp("SGG040719R29");
        
        Cliente cliente = new Cliente();
        cliente.setIdCliente(7239);
        cliente.setNombre("Paco Esteban Alvarado");
        cliente.setRfc("PEA3349RR678");
        cliente.setDomicilio("Guaymas Sonora, Mexico, Itson Campus Guaymas");
        cliente.setCorreoElectronico("Paco.Alvarado244883@potros.itson.edu.mx");
        cliente.setPaginaWeb("www.cursoDebuceo.mx");
        cliente.setTelefono("622-244-8924");
        
        Caja caja = new Caja();
        caja.setIdCaja(1);
        caja.setMarca("BBVA");
        caja.setModelo("RT7235");
        caja.setIdCaja(0000023034);
        
        Producto producto = new Producto();
        producto.setIdProducto(900235);
        producto.setNombre("Traje de buseo");
        producto.setDescripcion("Te permite mantener la temperatura de tú cuerpo");
        producto.setPrecioUnitario(9098.70);
        
        detalleVenta DetalleVenta = new detalleVenta();
        DetalleVenta.setIdDetalleVenta(12346);
        DetalleVenta.setCantidad(2);
        DetalleVenta.setProducto(producto);
        DetalleVenta.setPrecioUnitario(producto.getPrecioUnitario());
        
        Venta venta = new Venta();
        venta.setIdVenta(9003);
        venta.setEmpresa(empresa);
        venta.setCliente(cliente);
        venta.setCaja(caja);
        venta.setOperador(operador);
        venta.setFechaHora(new Date());
        venta.setDetalleVenta(DetalleVenta);
        venta.setSubTotal(DetalleVenta.getImporte());
        venta.setImpuesto(0.16);
        
      /* TICKET DE LA VENTA */
      /* Diseño */
       
        System.out.println("==============================================");
        System.out.println("              TICKET DE VENTA                 ");
        System.out.println("=============================================="); 
      
        System.out.println(venta.getEmpresa().getNombre());       
        System.out.println(venta.getEmpresa().getDomicilio());
        System.out.println(venta.getEmpresa().getTelefono());
        System.out.println(venta.getEmpresa().getCorreoElectronico());
        System.out.println(venta.getEmpresa().getPaginaWeb());
        System.out.println(venta.getEmpresa().getRfc());
        System.out.println("==============================================");
        System.out.println("Cliente: "+ venta.getCliente().getNombre());
        System.out.println("Domicilio: " +venta.getCliente().getDomicilio());
        System.out.println("Telefono: " +venta.getCliente().getTelefono());    
        System.out.println("Correo Electronico: "+ venta.getCliente().getCorreoElectronico());    
        System.out.println("R.F.C: "+ venta.getCliente().getRfc());    
        System.out.println("==============================================");
        System.out.println("            COMPROBANTE DE VENTA              ");
        System.out.println("=============================================="); 
        System.out.println("Fecha y hora: "+ venta.getFechaHora());    
        System.out.println("No. de Caja: " + venta.getCaja().getIdCaja());    
        System.out.println("Operador: " + venta.getOperador().getNombre());    
        System.out.println("=============================================="); 
        System.out.println("Producto\t Cantidad \t Precio  Importe ");
        System.out.println("=============================================="); 
        System.out.println(venta.getDetalleVenta().getProducto().getNombre()
            + " \t" + venta.getDetalleVenta().getCantidad()
            + "\t\t "+ venta.getDetalleVenta().getPrecioUnitario()
            + "\t " + venta.getDetalleVenta().getImporte()
        );    
        System.out.println("=============================================="); 
        System.out.println("SubTotal: "+venta.getSubTotal());    
        System.out.println("Impuesto" + (venta.getImpuesto() * 100)+ " %) : " +(venta.getSubTotal() * venta.getImpuesto()));    
        System.out.println("Total: " + venta.getTotal());    
           
      
        
        
        
        
        
    }
    
}
