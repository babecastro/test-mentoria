package com.place.apirest.models;

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
    private Date created_at;

    @Column(name="updated_at")
    private Date updated_at;

    @Column(name="description_city")
    private String nameCity;

    public Place(Integer id, String name, String slug, Integer city, Date created_at, Date updated_at, String nameCity) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.city = city;
        this.created_at = created_at;
        this.updated_at = updated_at;
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
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", nameCity='" + nameCity + '\'' +
                '}';
    }
}
