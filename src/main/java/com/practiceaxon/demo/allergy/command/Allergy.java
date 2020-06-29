package com.practiceaxon.demo.allergy.command;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.EntityId;

public class Allergy {

    @EntityId
    private final String Id;
    private final String name;

    public Allergy( String rewardId, String rewardName){
        this.Id = rewardId;
        this.name = rewardName;
    }

    @CommandHandler
    public void handle ()



}