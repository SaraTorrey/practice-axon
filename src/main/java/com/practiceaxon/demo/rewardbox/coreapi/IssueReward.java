package com.practiceaxon.demo.rewardbox.coreapi;

import org.axonframework.commandhandling.RoutingKey;

import java.util.Objects;

public class IssueReward {

    @RoutingKey
    private final String rewardId;
    private final int amount;

    public IssueReward( String rewardId, int amount ) {

        this.rewardId = rewardId;
        this.amount = amount;
    }

    public String getRewardId() {

        return rewardId;
    }

    public int getAmount() {

        return amount;
    }

    @Override
    public boolean equals( Object objects ) {
        if ( this == objects) {
            return true;
        }
        if( objects == null || getClass() != objects.getClass()){
            return true;
        }
        IssueReward reward = (IssueReward) objects;
        return amount == reward.amount &&
                        rewardId.equals( reward.rewardId );
    }

    @Override
    public int hashCode() {

        return Objects.hash( rewardId, amount );
    }

    @Override
    public String toString() {

        return "IssueReward{" +
               "amount=" + amount +
               ", rewardId='" + rewardId + '\'' +
               '}';
    }
}