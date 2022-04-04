package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queueue thanh = new Queueue();
        thanh.disPlayQueue();
        thanh.enQueue(2);
        thanh.enQueue(4);

        thanh.disPlayQueue();
        System.out.println("--------------------");
        thanh.enQueue(-99);
        thanh.disPlayQueue();
        System.out.println("--------------------");
        thanh.deQueue();
        thanh.disPlayQueue();
        System.out.println("--------------------");
        thanh.deQueue();
        thanh.enQueue(10);
        thanh.enQueue(11);
        thanh.enQueue(12);
        thanh.disPlayQueue();
        System.out.println("--------------------");
        thanh.add(2,20);
        thanh.disPlayQueue();
    }
}
