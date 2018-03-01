package com.spacesale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

/**
 * Created by bagus on 01/03/18.
 */
@Entity
@Table(name = "barang")
public class Barang {
    @Id
    @Column(name = "id_barang")
    private Integer idBarang;
    @Column(name = "nama_barang")
    private String namaBarang;
    @Column(name = "harga_barang")
    private Long hargaBarang;
    @Column(name = "jumlah_barang")
    private Integer jumlahBarang;

    public Integer getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Integer idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Long getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(Long hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public Integer getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(Integer jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
}
