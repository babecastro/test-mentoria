package com.place.apirest.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Barbara Ellen
 */
@Entity
@Table(name="place")
public class Place implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="slug")
    private String slug;

    @Column(name="city")
    private Integer city;

    @Column(name="created_at")
    private Date createdAt;

    @Column(name="updated_at")
    private Date updatedAt;

    @Column(name="description_city")
    private String nameCity;

    public Place(Integer id, String name, String slug, Integer city, Date created_at, Date updated_at, String nameCity) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.city = city;
        this.createdAt = created_at;
        this.updatedAt = updated_at;
        this.nameCity = nameCity;
    }

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

    }public Date getCreatedAt() {
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

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", city=" + city +
                ", created_at=" + createdAt +
                ", updated_at=" + updatedAt +
                ", nameCity='" + nameCity + '\'' +
                '}';
    }
}
