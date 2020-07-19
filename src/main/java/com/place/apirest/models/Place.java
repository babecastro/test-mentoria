package com.place.apirest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="place")
public class Place implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private String name;

    private String slug;

    private Integer city;

    private Date created_at;

    private Date updated_at;

    private String name_city;

    public Place() {
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;

    }public Date getCreated_at() {
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

    public String getName_city() {
        return name_city;
    }

    public void setName_city(String description_city) {
        this.name_city = description_city;
    }
}
