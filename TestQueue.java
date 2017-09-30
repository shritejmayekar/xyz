/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.que;

/**
 *
 * @author Shritesh
 */
class Node {
    int data;
    Node link;
    Node() {
        data=0;
        link=null;
    }
    Node(int value,Node l) {
        data=value;
        link=l;
    }
}
class Queue {
    Node front,rear;
    public int size;
    public Queue() {
        front=rear=null;
        size=0;
    }
    void Enqueue(int value) {
        Node ptr=new Node(value,null);
         size++;
        if(front==null) {
            front=ptr;
            return;
        }
        else {
            Node travel=front;
            //travel=travel.link;
            while(travel.link!=null) {
                travel=travel.link;
            }
            
            travel.link=ptr;
        }
    }
    void display() {
        System.out.println("queue display");
        Node nptr=front;
        if(size==0) {
            System.out.println("empty");
            return;
        }
        if(front.link==null) {
            System.out.print(front.data+" ->");
            return;
        }
        System.out.print(front.data+" -> ");
        nptr=nptr.link;
        while(nptr.link!=null) {
            System.out.print(nptr.data+" -> ");
            nptr=nptr.link;
        }
        System.out.print(nptr.data+" \n");
        
    }
    void Dequee() {
        front=front.link;
        size--;
    }
    
}
public class TestQueue {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.display();
        q.Enqueue(5);
        q.Enqueue(6);
        q.Enqueue(8);
        q.display();
        q.Dequee();
        q.display();
            
    }
    
}
