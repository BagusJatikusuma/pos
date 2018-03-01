package com.spacesale.model;

import javax.persistence.*;
import java.sql.Types;

/**
 * Created by bagus on 01/03/18.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "nama_user")
    private String namaUser;
    @Enumerated(EnumType.STRING)
    @Column(name = "jenis_kelamin", columnDefinition="enum('LAKI_LAKI','PEREMPUAN')")
    private JenisKelaminEnum jenisKelaminEnum;
    @Column(name = "alamat", columnDefinition = "TEXT")
    private String alamat;
    @Column(name = "email")
    private String email;
    @ManyToOne @JoinColumn(name = "id_jenis_user")
    private JenisUser jenisUser;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public JenisKelaminEnum getJenisKelaminEnum() {
        return jenisKelaminEnum;
    }

    public String getJenisKelamin() {
        return jenisKelaminEnum.toString();
    }

    public void setJenisKelaminEnum(JenisKelaminEnum jenisKelaminEnum) {
        this.jenisKelaminEnum = jenisKelaminEnum;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public JenisUser getJenisUser() {
        return jenisUser;
    }

    public void setJenisUser(JenisUser jenisUser) {
        this.jenisUser = jenisUser;
    }
}
