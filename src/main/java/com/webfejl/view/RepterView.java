package com.webfejl.view;

import com.webfejl.model.Repter;
import com.webfejl.repository.RepterRepository;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class RepterView implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private RepterRepository repterRepository;

    private List<Repter> repters;

    @PostConstruct
    public void init() {
        repters = repterRepository.findAll();
    }

    public List<Repter> getRepters() {
        return repters;
    }

    public void remove(Repter repter){
        repters.remove(repter);
    }
}