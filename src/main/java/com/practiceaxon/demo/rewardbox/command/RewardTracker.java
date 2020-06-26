package com.practiceaxon.demo.rewardbox.command;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.EntityId;

public class RewardTracker {

    @EntityId
    private final String rewardId;
    private final int rewardPoints;
    private boolean used = false;

    public RewardTracker(String rewardId, int rewardPoints){
        this.rewardId = rewardId;
        this.rewardPoints = rewardPoints;
    }

    @CommandHandler
    public void handle ()



}