package com.sfj.testing;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class List {

    private ArrayList<String> people = new ArrayList<>();

    public List() {
    }

    public List(ArrayList<String> people) {
        this.people = people;
    }

    public void add(String person) {
        people.add(person);
    }

    public void remove(String person) {
        if (!people.contains(person)) {
            throw new NoSuchElementException();
        }
        people.remove(person);
    }

    public int size() {
        return people.size();
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public void removeAll() {
        people.clear();
    }

    public ArrayList<String> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<String> people) {
        this.people = people;
    }
}
