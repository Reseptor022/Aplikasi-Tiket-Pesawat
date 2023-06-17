/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report.hasil;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Reseptor
 */
@Entity
@Table(name = "user", catalog = "db_uas", schema = "")
@NamedQueries({
    @NamedQuery(name = "User_1.findAll", query = "SELECT u FROM User_1 u")
    , @NamedQuery(name = "User_1.findByIdTiket", query = "SELECT u FROM User_1 u WHERE u.idTiket = :idTiket")
    , @NamedQuery(name = "User_1.findByNama1", query = "SELECT u FROM User_1 u WHERE u.nama1 = :nama1")
    , @NamedQuery(name = "User_1.findByTujuanKeb1", query = "SELECT u FROM User_1 u WHERE u.tujuanKeb1 = :tujuanKeb1")
    , @NamedQuery(name = "User_1.findByJadwalKeb1", query = "SELECT u FROM User_1 u WHERE u.jadwalKeb1 = :jadwalKeb1")
    , @NamedQuery(name = "User_1.findByWaktuPembelian1", query = "SELECT u FROM User_1 u WHERE u.waktuPembelian1 = :waktuPembelian1")
    , @NamedQuery(name = "User_1.findByHarga1", query = "SELECT u FROM User_1 u WHERE u.harga1 = :harga1")})
public class User_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tiket")
    private Integer idTiket;
    @Basic(optional = false)
    @Column(name = "nama1")
    private String nama1;
    @Basic(optional = false)
    @Column(name = "tujuan_keb1")
    private String tujuanKeb1;
    @Basic(optional = false)
    @Column(name = "jadwal_keb1")
    private String jadwalKeb1;
    @Basic(optional = false)
    @Column(name = "waktu_pembelian1")
    private String waktuPembelian1;
    @Basic(optional = false)
    @Column(name = "harga1")
    private String harga1;

    public User_1() {
    }

    public User_1(Integer idTiket) {
        this.idTiket = idTiket;
    }

    public User_1(Integer idTiket, String nama1, String tujuanKeb1, String jadwalKeb1, String waktuPembelian1, String harga1) {
        this.idTiket = idTiket;
        this.nama1 = nama1;
        this.tujuanKeb1 = tujuanKeb1;
        this.jadwalKeb1 = jadwalKeb1;
        this.waktuPembelian1 = waktuPembelian1;
        this.harga1 = harga1;
    }

    public Integer getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(Integer idTiket) {
        Integer oldIdTiket = this.idTiket;
        this.idTiket = idTiket;
        changeSupport.firePropertyChange("idTiket", oldIdTiket, idTiket);
    }

    public String getNama1() {
        return nama1;
    }

    public void setNama1(String nama1) {
        String oldNama1 = this.nama1;
        this.nama1 = nama1;
        changeSupport.firePropertyChange("nama1", oldNama1, nama1);
    }

    public String getTujuanKeb1() {
        return tujuanKeb1;
    }

    public void setTujuanKeb1(String tujuanKeb1) {
        String oldTujuanKeb1 = this.tujuanKeb1;
        this.tujuanKeb1 = tujuanKeb1;
        changeSupport.firePropertyChange("tujuanKeb1", oldTujuanKeb1, tujuanKeb1);
    }

    public String getJadwalKeb1() {
        return jadwalKeb1;
    }

    public void setJadwalKeb1(String jadwalKeb1) {
        String oldJadwalKeb1 = this.jadwalKeb1;
        this.jadwalKeb1 = jadwalKeb1;
        changeSupport.firePropertyChange("jadwalKeb1", oldJadwalKeb1, jadwalKeb1);
    }

    public String getWaktuPembelian1() {
        return waktuPembelian1;
    }

    public void setWaktuPembelian1(String waktuPembelian1) {
        String oldWaktuPembelian1 = this.waktuPembelian1;
        this.waktuPembelian1 = waktuPembelian1;
        changeSupport.firePropertyChange("waktuPembelian1", oldWaktuPembelian1, waktuPembelian1);
    }

    public String getHarga1() {
        return harga1;
    }

    public void setHarga1(String harga1) {
        String oldHarga1 = this.harga1;
        this.harga1 = harga1;
        changeSupport.firePropertyChange("harga1", oldHarga1, harga1);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTiket != null ? idTiket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User_1)) {
            return false;
        }
        User_1 other = (User_1) object;
        if ((this.idTiket == null && other.idTiket != null) || (this.idTiket != null && !this.idTiket.equals(other.idTiket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "report.hasil.User_1[ idTiket=" + idTiket + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
