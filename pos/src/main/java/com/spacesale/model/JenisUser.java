package com.spacesale.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bagus on 01/03/18.
 */
@Entity
@Table(name = "jenis_user")
public class JenisUser {
    @Id
    @Column(name = "id_jenis_user")
    private Integer idJenisUser;
    @Column(name = "nama_jenis_user")
    private String namaJenisUser;

    @OneToMany(mappedBy = "jenisUser")
    private List<User> users;

    public Integer getIdJenisUser() {
        return idJenisUser;
    }

    public void setIdJenisUser(Integer idJenisUser) {
        this.idJenisUser = idJenisUser;
    }

    public String getNamaJenisUser() {
        return namaJenisUser;
    }

    public void setNamaJenisUser(String namaJenisUser) {
        this.namaJenisUser = namaJenisUser;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
