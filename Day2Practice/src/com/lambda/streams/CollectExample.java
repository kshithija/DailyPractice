package com.lambda.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

 class Person {
    private Integer id;
    private String name;
    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
public class CollectExample {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(200, "Sohan"));
        list.add(new Person(300, "Mahesh"));
        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName));
        map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
    }
}
