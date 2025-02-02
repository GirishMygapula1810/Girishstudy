package amazon.finance.practise.assignment;

import javax.xml.namespace.QName;

public class Person {

    String name;
    int age;

    public static void main(String[] args){
        Person p = new Person();
        p.name = "Girish";
        p.age = 20;

        System.out.println(" name " +  p.name);
        System.out.println(" age " +  p.age);
    }

}