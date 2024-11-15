package Modelo;

import java.sql.Date;

public class Ventas {

    private int id_venta;
    private int id_cliente;
    private int id_empleado;
    private String metodopagoV;
    private java.sql.Date fecha_venta;
    // Dos contructores y un get and setter

    public Ventas(int id_venta, int id_cliente, int id_empleado, String metodopagoV, Date fecha_venta) {
        this.id_venta = id_venta;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.metodopagoV = metodopagoV;
        this.fecha_venta = fecha_venta;
    }

    public Ventas(int id_cliente, int id_empleado, String metodopagoV, java.sql.Date fecha_venta) {
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.metodopagoV = metodopagoV;
        this.fecha_venta = fecha_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getMetodopagoV() {
        return metodopagoV;
    }

    public void setMetodopagoV(String metodopagoV) {
        this.metodopagoV = metodopagoV;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

}
