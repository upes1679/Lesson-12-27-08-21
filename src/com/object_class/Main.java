package com.object_class;

public class Main {
    public static void main(String[] args){
        Object obj=new Person(1,"Mark");
        System.out.println(obj);
        String s=obj.toString();

        Person p1=new Person(2,"Mark");
        //Person p2=p1;
        Person p2=new Person(2,"Mark");

       boolean b=p1.equals(p2);
        System.out.println(b);

        Class c=p1.getClass();
        System.out.println(c);
    }
}
