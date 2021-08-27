package com.object_class;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void speak() {

    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }

        if(!(obj instanceof Person)){
            return false;
        }

        Person p=(Person) obj;

        boolean isEqual=this.id==p.id;

        return isEqual;
    }

    @Override
    public int hashCode() {
        return id;
    }

}
