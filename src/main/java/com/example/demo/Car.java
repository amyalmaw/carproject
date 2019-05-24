package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {
    public Car(@NotNull @Size(min = 4) String year, @NotNull @Size(min = 3) String make, @NotNull @Size(min = 3) String modell) {
        this.year = year;
        this.make = make;
        this.modell = modell;
    }

    public Car() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 4)
    private String year;

    @NotNull
    @Size(min = 3)
    private String make;

    @NotNull
    @Size(min = 3)
    private String modell;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}
