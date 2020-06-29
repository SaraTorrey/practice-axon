package com.practiceaxon.demo.person.coreapi;

import org.axonframework.serialization.Revision;

import java.util.Objects;

@Revision( "1" )
public class PersonCreatedEvent {

    private final String personId;
    private final int personAge;
    private final String personName;

    public PersonCreatedEvent( String personId, int personAge, String personName ) {


        this.personId = personId;
        this.personAge = personAge;
        this.personName = personName;
    }

    public String getPersonId() { return personId; }

    public int getPersonAge() { return personAge; }

    public String getPersonName() { return personName; }

    @Override public boolean equals( Object o ) {

        if ( this == o ) return true;
        if ( !( o instanceof PersonCreatedEvent ) ) return false;
        PersonCreatedEvent that = (PersonCreatedEvent) o;
        return personAge == that.personAge &&
               personId.equals( that.personId ) &&
               personName.equals( that.personName );
    }

    @Override public int hashCode() {

        return Objects.hash( personId, personAge, personName );
    }

    @Override
    public String toString() {

        return "PersonCreatedEvent{" +
               "personAge=" + personAge +
               ", personId='" + personId + '\'' +
               ", personName='" + personName + '\'' +
               '}';
    }
}