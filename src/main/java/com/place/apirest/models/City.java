package com.place.apirest.models;

import com.sun.istack.NotNull;

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
    @NotNull
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
    private Date createdAt;

    @Column(name="updated_at")
    private Date updatedAt;

    public City(Integer id, String name, Integer stateOfCity, String nameState, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.stateOfCity = stateOfCity;
        this.nameState = nameState;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
                ", created_at=" + createdAt +
                ", updated_at=" + updatedAt +
                '}';
    }
}
