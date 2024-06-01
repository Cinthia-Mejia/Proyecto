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
@Table(name = "carrodb", catalog = "clasesdb", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Carrodb.findAll", query = "SELECT c FROM Carrodb c"),
    @NamedQuery(name = "Carrodb.findByIdCarro", query = "SELECT c FROM Carrodb c WHERE c.idCarro = :idCarro"),
    @NamedQuery(name = "Carrodb.findByGas", query = "SELECT c FROM Carrodb c WHERE c.gas = :gas"),
    @NamedQuery(name = "Carrodb.findByMarca", query = "SELECT c FROM Carrodb c WHERE c.marca = :marca"),
    @NamedQuery(name = "Carrodb.findByModelo", query = "SELECT c FROM Carrodb c WHERE c.modelo = :modelo"),
    @NamedQuery(name = "Carrodb.findByColor", query = "SELECT c FROM Carrodb c WHERE c.color = :color")})
public class Carrodb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carro", nullable = false)
    private Integer idCarro;
    @Column(name = "gas", length = 10)
    private String gas;
    @Column(name = "marca", length = 15)
    private String marca;
    @Column(name = "modelo", length = 10)
    private String modelo;
    @Column(name = "color", length = 15)
    private String color;

    public Carrodb() {
    }

    public Carrodb(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public Integer getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
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
        hash += (idCarro != null ? idCarro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrodb)) {
            return false;
        }
        Carrodb other = (Carrodb) object;
        if ((this.idCarro == null && other.idCarro != null) || (this.idCarro != null && !this.idCarro.equals(other.idCarro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases_db.Carrodb[ idCarro=" + idCarro + " ]";
    }
    
}
