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
@Table(name = "balsadb", catalog = "clasesdb", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Balsadb.findAll", query = "SELECT b FROM Balsadb b"),
    @NamedQuery(name = "Balsadb.findByIdBalsa", query = "SELECT b FROM Balsadb b WHERE b.idBalsa = :idBalsa"),
    @NamedQuery(name = "Balsadb.findByMotor", query = "SELECT b FROM Balsadb b WHERE b.motor = :motor"),
    @NamedQuery(name = "Balsadb.findByMarca", query = "SELECT b FROM Balsadb b WHERE b.marca = :marca"),
    @NamedQuery(name = "Balsadb.findByModelo", query = "SELECT b FROM Balsadb b WHERE b.modelo = :modelo"),
    @NamedQuery(name = "Balsadb.findByColor", query = "SELECT b FROM Balsadb b WHERE b.color = :color")})
public class Balsadb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_balsa", nullable = false)
    private Integer idBalsa;
    @Column(name = "motor", length = 10)
    private String motor;
    @Column(name = "marca", length = 15)
    private String marca;
    @Column(name = "modelo", length = 10)
    private String modelo;
    @Column(name = "color", length = 15)
    private String color;

    public Balsadb() {
    }

    public Balsadb(Integer idBalsa) {
        this.idBalsa = idBalsa;
    }

    public Integer getIdBalsa() {
        return idBalsa;
    }

    public void setIdBalsa(Integer idBalsa) {
        this.idBalsa = idBalsa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
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
        hash += (idBalsa != null ? idBalsa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Balsadb)) {
            return false;
        }
        Balsadb other = (Balsadb) object;
        if ((this.idBalsa == null && other.idBalsa != null) || (this.idBalsa != null && !this.idBalsa.equals(other.idBalsa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases_db.Balsadb[ idBalsa=" + idBalsa + " ]";
    }
    
}
