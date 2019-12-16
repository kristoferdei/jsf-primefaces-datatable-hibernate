package com.webfejl.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Utas")
public class Utas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long utas_azon;

    @Column(nullable=false)
    private String vnev;

    @Column(nullable=false)
    private String knev;

    @Column(nullable=true)
    private String telefon;

    @Column(nullable=true)
    private String email;

    @Column(nullable=true)
    private String lakcim;

    public Utas() {}

    public Utas(Long utas_azon, String vnev, String knev, String telefon, String email, String lakcim) {
        this.utas_azon = utas_azon;
        this.vnev = vnev;
        this.knev = knev;
        this.telefon = telefon;
        this.email = email;
        this.lakcim = lakcim;
    }

    public Long getUtas_azon() { return utas_azon; }

    public void setUtas_azon(Long utas_azon) { this.utas_azon = utas_azon; }

    public String getVnev() { return vnev; }

    public void setVnev(String vnev) {this.vnev = vnev; }

    public String getKnev() { return knev; }

    public void setKnev(String knev) {this.knev = knev; }

    public String getTelefon() { return telefon; }

    public void setTelefon(String telefon) {this.telefon = telefon; }

    public String getEmail() { return email; }

    public void setEmail(String email) {this.email = email; }

    public String getLakcim() { return lakcim; }

    public void setLakcim(String lakcim) {this.lakcim = lakcim; }

}
