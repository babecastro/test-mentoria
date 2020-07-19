package com.place.apirest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="city")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private String name;

    private Integer state_of_city;

    private String name_state;

    private Date created_at;

    private Date updated_at;

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

    public Integer getState_of_city() {
        return state_of_city;
    }

    public void setState_of_city(Integer state_of_city) {
        this.state_of_city = state_of_city;
    }

    public String getName_state() {
        return name_state;
    }

    public void setName_state(String description_state) {
        this.name_state = description_state;
    }
}
