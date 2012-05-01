package com.chenlm.learn.tjava.typeinfo;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 下午9:53:42
 */
public class Position {
    private String title;
    private Person person;
    public Position(String jobTitle, Person employee) {
        title = jobTitle;
        person = employee;
        if (person == null) {
            person = Person.NULL;
        }
    }
    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }
    public String getTitle() { return title; }
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    public Person getPerson() { return person; }
    public void setPerson(Person newPerson) {
        person = newPerson;
        if (person == null) {
            person = Person.NULL;
        }
    }
    public String toString() {
        return "Position: " + title + " " + person;
    }
}
