package ss12_java_collection_framework.pai_tap.product.service;

import ss12_java_collection_framework.pai_tap.product.model.Products;

import java.util.Comparator;

public class ComparatorProduct implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}