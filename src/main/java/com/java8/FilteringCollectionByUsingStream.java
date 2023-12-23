package com.java8;

import java.util.*;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilteringCollectionByUsingStream {
    public static void main(String[] args) {
    List<Product> productList = new ArrayList<>();
    productList.add(new Product(1,"apple",300000f));
        productList.add(new Product(2,"apple",200000f));
        productList.add(new Product(3,"hp",100000f));
        productList.add(new Product(4,"dell",500000f));
        productList.add(new Product(5,"redmi",800000f));
        productList.add(new Product(6,"jio",600000f));
        productList.add(new Product(7,"airtel",700000f));

        //productList.stream().filter(product -> product.price>500000).map(p->p.price).forEach(System.out::println);

        List<Float> productListPrice = productList.stream().
                filter(product -> product.price>400000).
                map(p->p.price).collect(Collectors.toList());
        System.out.println(productListPrice);



        Float totalPrice = productList.stream()
                .map(product->product.price)
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        System.out.println(totalPrice);
        // More precise code
        float totalPrice2 = productList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);

        // summing the value
        Double floatSum = productList.stream().collect(Collectors.summingDouble(product->product.price));
        System.out.println(floatSum);



        // find max price and min price from product
        Float maxPrice = productList.stream().max((product1, product2) -> product1.price >product2.price? 1:-1).get().price;
        System.out.println(maxPrice);

        //find min value

        // find max price and min price from product
        Float minPrice = productList.stream().min((product1, product2) -> product1.price > product2.price? 1:-1).get().price;
        System.out.println("min price" + minPrice);


        //Java Stream Example: count() Method in Collection

        long count = productList.stream()
                .filter(product -> product.price<500000)
                .count();

        System.out.println(count);

    // Convert List into Set

        Set<Float> setOfPrice = productList.stream().map(product -> product.price).collect(Collectors.toSet());
        System.out.println("Set of price : " + setOfPrice);


    // Java Stream Example : Convert List into Map

        Map<Integer, String> productMap =  productList.stream().collect(Collectors.toMap(product-> product.id,product-> product.name));
        System.out.println(productMap);
    }
}
