package com.wo.lp2_t1_wilmerocampo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "medicamentos")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_med")
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String descripcion;
    @Getter
    @Setter
    private String categoria;
    @Getter
    @Setter
    private BigDecimal precio;
    @Getter
    @Setter
    private int stock;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Getter
    @Setter
    private Date fecvence;
    @Getter
    @Setter
    private String proveedor;

    public Medicamento() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Medicamento(int id, String nombre, String descripcion, String categoria, BigDecimal precio, int stock,
                       Date fecvence, String proveedor) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.fecvence = fecvence;
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Medicamento [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria="
                + categoria + ", precio=" + precio + ", stock=" + stock + ", fecvence=" + fecvence + ", proveedor="
                + proveedor + "]";
    }

}
