package com.spacesale.model;

import javax.persistence.*;

/**
 * Created by bagus on 01/03/18.
 */
@Entity
@Table(name = "transaksi")
public class Transaksi {
    @EmbeddedId
    private TransaksiId transaksiId;
    @Column(name = "jumlah_dibeli")
    private Integer jumlahDibeli;
    @Column(name = "harga_satuan")
    private Long hargaSatuan;

    @ManyToOne
    @JoinColumn(
            name = "id_barang",
            insertable = false,
            updatable = false,
            referencedColumnName = "id_barang"
    )
    private Barang barang;
    @ManyToOne
    @JoinColumn(
            name = "id_user",
            insertable = false,
            updatable = false,
            referencedColumnName = "id_user"
    )
    private User user;

    public TransaksiId getTransaksiId() {
        return transaksiId;
    }

    public void setTransaksiId(TransaksiId transaksiId) {
        this.transaksiId = transaksiId;
    }

    public Integer getJumlahDibeli() {
        return jumlahDibeli;
    }

    public void setJumlahDibeli(Integer jumlahDibeli) {
        this.jumlahDibeli = jumlahDibeli;
    }

    public Long getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(Long hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
