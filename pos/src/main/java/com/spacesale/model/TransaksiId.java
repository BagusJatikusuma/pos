package com.spacesale.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by bagus on 01/03/18.
 */
@Embeddable
public class TransaksiId implements Serializable {
    @Column(name = "id_barang")
    private Integer idBarang;
    @Column(name = "id_user")
    private Integer idUser;

    public TransaksiId() {
    }

    public TransaksiId(Integer idBarang, Integer idUser) {
        this.idBarang = idBarang;
        this.idUser = idUser;
    }

    public Integer getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Integer idBarang) {
        this.idBarang = idBarang;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransaksiId that = (TransaksiId) o;

        if (!idBarang.equals(that.idBarang)) return false;
        return idUser.equals(that.idUser);
    }

    @Override
    public int hashCode() {
        int result = idBarang.hashCode();
        result = 31 * result + idUser.hashCode();
        return result;
    }
}
