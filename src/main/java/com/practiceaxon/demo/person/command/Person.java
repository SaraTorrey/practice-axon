package com.practiceaxon.demo.person.command;

import com.practiceaxon.demo.allergy.command.Allergy;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateMember;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.context.annotation.Profile;

import javax.persistence.Id;

@Profile( "command" )
@Aggregate(snapshotTriggerDefinition = "personSnapshotTriggerDefinition")

public class Person {

    @AggregateIdentifier
    private Id id;

    @AggregateMember
    private List<Person> personList;

    private int age;
    public enum gender{female, male};





}