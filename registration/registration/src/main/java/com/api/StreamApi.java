package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {
public static void main(String[] args) {

//        List<String> fruits = Arrays.asList("orange","banana","pineapple");
//        String uniqueFruits = fruits.stream().collect(Collectors.joining(", "));
//        System.out.println(uniqueFruits);

    Function<String, Integer> x = s -> s.length();
    Integer val = x.apply("deep");
    System.out.println(val);
//
    Function<Integer, Integer> y = s->s*s;
    Integer square = y.apply(10);
    System.out.println(square);
//
    List<Integer> data = Arrays.asList(10,5,4,8,15,20);
    List<Integer> newData = data.stream().map(z -> z * z).collect(Collectors.toList());
    System.out.println(newData);
//
    List<String> words = Arrays.asList("banana", "apple", "cherry");
    List<String> newWords = words.stream().sorted().collect(Collectors.toList());
    System.out.println(newWords);
//
    List<String> fruit = Arrays.asList("banana", "apple", "cherry");
    List<Integer> newFruits = fruit.stream().map(c->c.length()).collect(Collectors.toList());
    System.out.println(newFruits);
//
    Consumer<String> print = v-> System.out.println(v);
    print.accept("this will print");
//
    List<String> strings = Arrays.asList("abc", "",  "def", "", "ghi");
    Consumer<String> f= v-> System.out.println(v.toUpperCase());
    strings.forEach(f);
//
    List<Integer> numbers = Arrays.asList(1,4,5,70,99,100,250);
    Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println(max.get());
//
    List<Integer> listOfNumbers = Arrays.asList(1,5,7,8,9);
    Optional<Integer> firstGreaterNumberThanGiven = listOfNumbers.stream().filter(n -> n > 5).findFirst();
        System.out.println(firstGreaterNumberThanGiven.get());
//



}
}
