package com.usa.ciclo3.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="boat")
public class Boat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBoat;
    private String brand;
    private Integer model;
    private Integer category_id;
    private String name;

    public Integer getIdBoat() {
        return idBoat;
    }

    public void setId(Integer idBoat) {
        this.idBoat = idBoat;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
