package com.place.apirest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Barbara Ellen
 */
@Entity
@Table(name="city")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="city_name")
    private String name;

    @Column(name="state_of_city")
    private Integer stateOfCity;

    @Column(name="description_state")
    private String nameState;

    @Column(name="created_at")
    private Date created_at;

    @Column(name="updated_at")
    private Date updated_at;

    public City() {

    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStateOfCity() {
        return stateOfCity;
    }

    public void setStateOfCity(Integer stateOfCity) {
        this.stateOfCity = stateOfCity;
    }

    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stateOfCity=" + stateOfCity +
                ", nameState='" + nameState + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
