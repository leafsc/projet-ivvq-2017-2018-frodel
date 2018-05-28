package com.frodel;

import com.frodel.services.InitialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Marti_000 on 20/05/2018.
 */
@Component
public class Bootstrap {

    @Autowired
    private InitialisationService initialisationService;

    @PostConstruct
    public void init(){
        initialisationService.initData();
    }

    public void setInitialisationService(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public InitialisationService getInitialisationService() {
        return initialisationService;
    }
}