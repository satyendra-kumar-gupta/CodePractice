package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductExample{




    int id;
    String name;
    float price;

    public ProductExample(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }


}

public class MethodReferenceInStream {
    public static void main(String[] args) {

        List<ProductExample> productExampleList = new ArrayList<>();
        productExampleList.add(new ProductExample(1,"test1", 100f));
        productExampleList.add(new ProductExample(2,"test2", 200f));
        productExampleList.add(new ProductExample(3,"test3", 300f));
        productExampleList.add(new ProductExample(4,"test4", 400f));
        productExampleList.add(new ProductExample(5,"test5", 500f));
        productExampleList.add(new ProductExample(6,"test6", 600f));
        productExampleList.add(new ProductExample(7,"test7", 700f));
        productExampleList.add(new ProductExample(8,"test8", 800f));

        List<Float> productExamplepriceList = productExampleList.stream()
                .map(ProductExample::getPrice)
                .collect(Collectors.toList());

        System.out.println("Product Example Price List : "+productExamplepriceList);
    }
}
