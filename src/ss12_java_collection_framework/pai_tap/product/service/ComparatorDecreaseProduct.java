package ss12_java_collection_framework.pai_tap.product.service;

import ss12_java_collection_framework.pai_tap.product.model.Products;

import java.util.Comparator;

public class ComparatorDecreaseProduct implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}