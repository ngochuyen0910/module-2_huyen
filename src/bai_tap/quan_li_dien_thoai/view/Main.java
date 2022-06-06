package bai_tap.quan_li_dien_thoai.view;

import bai_tap.quan_li_dien_thoai.controller.PhoneManagement;

import java.util.LinkedList;

public class Mais {
    public static void main(String[] args) {
        //PhoneManagement.menu();
        LinkedList<Integer> l= new LinkedList<>();
        l.offer(1);
        l.offer(2);
        l.offer(3);
        int value= l.poll();
        System.out.println(value);
    }
}
