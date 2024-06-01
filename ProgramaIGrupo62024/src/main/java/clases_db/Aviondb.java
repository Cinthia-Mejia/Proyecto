/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author vmora
 */
@Entity
@Table(name = "aviondb", catalog = "clasesdb", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Aviondb.findAll", query = "SELECT a FROM Aviondb a"),
    @NamedQuery(name = "Aviondb.findByIdAvion", query = "SELECT a FROM Aviondb a WHERE a.idAvion = :idAvion"),
    @NamedQuery(name = "Aviondb.findByPasajeros", query = "SELECT a FROM Aviondb a WHERE a.pasajeros = :pasajeros"),
    @NamedQuery(name = "Aviondb.findByMarca", query = "SELECT a FROM Aviondb a WHERE a.marca = :marca"),
    @NamedQuery(name = "Aviondb.findByModelo", query = "SELECT a FROM Aviondb a WHERE a.modelo = :modelo"),
    @NamedQuery(name = "Aviondb.findByColor", query = "SELECT a FROM Aviondb a WHERE a.color = :color")})
public class Aviondb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_avion", nullable = false)
    private Integer idAvion;
    @Column(name = "pasajeros")
    private Integer pasajeros;
    @Column(name = "marca", length = 15)
    private String marca;
    @Column(name = "modelo", length = 10)
    private String modelo;
    @Column(name = "color", length = 15)
    private String color;

    public Aviondb() {
    }

    public Aviondb(Integer idAvion) {
        this.idAvion = idAvion;
    }

    public Integer getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(Integer idAvion) {
        this.idAvion = idAvion;
    }

    public Integer getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAvion != null ? idAvion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aviondb)) {
            return false;
        }
        Aviondb other = (Aviondb) object;
        if ((this.idAvion == null && other.idAvion != null) || (this.idAvion != null && !this.idAvion.equals(other.idAvion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases_db.Aviondb[ idAvion=" + idAvion + " ]";
    }
    
}
