package com.webfejl.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Repter")
public class Repter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String repterkod;

    @Column(nullable=false)
    private String repternev;

    @Column(nullable=false)
    private String helyszin;

    public Repter() {}

    public Repter(Long id, String repterkod, String repternev, String helyszin) {
        this.id = id;
        this.repterkod = repterkod;
        this.repternev = repternev;
        this.helyszin = helyszin;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getRepterkod() {
        return repterkod;
    }

    public void setRepterkod(String repterkod) {
        this.repterkod = repterkod;
    }

    public String getRepternev() {
        return repternev;
    }

    public void setRepternev(String repternev) {
        this.repternev = repternev;
    }

    public String getHelyszin() {
        return helyszin;
    }

    public void setHelyszin(String helyszin) {
        this.helyszin = helyszin;
    }
}