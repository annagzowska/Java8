package com.annagzowska.max;

import java.util.List;

/**
 * Created by anna on 10/20/16.
 */
public class OldestPersonJava7 {
    public static Person getOldestPerson(List<Person> collection) {
        Person oldestPerson = new Person("", 0);
        for(Person person : collection) {
            if(person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }
}
