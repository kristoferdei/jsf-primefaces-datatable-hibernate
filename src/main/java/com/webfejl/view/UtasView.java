package com.webfejl.view;

import com.webfejl.model.Utas;
import com.webfejl.repository.UtasRepository;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class UtasView implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private UtasRepository utasRepository;

    private List<Utas> utass;

    @PostConstruct
    public void init() {
        utass = utasRepository.findAll();
    }

    public List<Utas> getUtass() {
        return utass;
    }

    public void remove(Utas utas){
        utasRepository.delete(utas);
    }

}
