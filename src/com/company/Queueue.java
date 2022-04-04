package com.company;

public class Queueue {
    class Node{
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node link) {
            this.data = data;
            this.link = link;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLink() {
            return link;
        }

        public void setLink(Node link) {
            this.link = link;
        }
    }
    private Node front;
    private Node rear;

    public Queueue() {
        this.front = null;
        this.rear = null;
    }

    public Queueue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }
    public void enQueue(int data){
        Node temp = new Node(data);
        if (this.front == null){
            this.front = this.rear = temp;
        }else {
            this.rear.link = temp;
            this.rear = temp;
        }
    }
    public Node deQueue(){
        Node temp = this.front;
        if (this.front == null){
            return null;
        }else {
            if (this.front== this.rear){
                this.front=this.rear=null;
            }else this.front = this.front.link;
        }
        return temp;
    }
    public void disPlayQueue(){
        Node temp = this.front;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.link;
        }
    }
    public void add(int index,int value){
        Node temp = front;
        Node abc;
        for (int i = 0; i < index-1; i++) {
            temp = temp.link;
        }
        abc = temp.link;
        temp.link = new Node(value);
        temp.link.link=abc;
    }
}
