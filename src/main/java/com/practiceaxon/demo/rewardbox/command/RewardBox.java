package com.practiceaxon.demo.rewardbox.command;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateMember;
import org.axonframework.spring.stereotype.Aggregate;

import java.nio.channels.MembershipKey;

@Aggregate
public class RewardBox {

    @AggregateIdentifier
    private String Id;

    @AggregateMember
    private List<RewardTracker> rewardTrackerLister;



}