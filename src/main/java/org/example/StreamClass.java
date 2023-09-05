package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamClass {
    public static void main(String[] args) {
        Person person1=new Person("Bhuvana","B",Gender.FEMALE, LocalDate.parse("1989-01-10"));
        Person person2=new Person("Palak","Goyal",Gender.FEMALE, LocalDate.parse("1988-05-05"));
        Person person3=new Person("Shubha","Dhang",Gender.FEMALE, LocalDate.parse("1990-02-06"));
        Person person4=new Person("Andres","Loren",Gender.MALE, LocalDate.parse("1990-01-11"));
        Person person5=new Person("Bassim","Naidu",Gender.MALE, LocalDate.parse("1986-01-12"));

        List<Person>peopleDetails=new ArrayList<>();

        peopleDetails.add(person1);
        peopleDetails.add(person2);
        peopleDetails.add(person3);
        peopleDetails.add(person4);
        peopleDetails.add(person5);

        Predicate<Person> personPredicatewithNameB=(person)->person.getFirstName().startsWith("B");
        List<Person>startNameB=peopleDetails.stream()  //1 step
                .filter(personPredicatewithNameB)      //2 step
                .toList();                            //3 step
        //print
        Consumer<Person>printDetails=(person)-> System.out.println(person);
        startNameB.forEach(printDetails);


    }
}
