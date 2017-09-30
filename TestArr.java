
package com.arrl;
/**
 *
 * @author Shritej
 */
class Node {
    Object data;
    Node link;
    Node() {
        data=0;
        link=null;
    }
    Node(Object value,Node l) {
        data=value;
        link=l;
    }
}
class ArrayList {
    Node front,rear;
    public int size,capacity;
    public ArrayList() {
        front=rear=null;
        size=0;
        capacity=10;
    }

    public ArrayList(int capacity) {
        this.capacity = capacity;
    }
    
    void add(Object value) {
        if(size==capacity) {
            System.out.println("not possible");
            return;
        }
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
        System.out.println("ArrayList display");
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
    void remove() {
        front=front.link;
        size--;
    }
    
}


public class TestArr {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList(3);
        arr.display();
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(5);
        arr.add("hello");
        
        
        arr.display();
        arr.remove();
        arr.display();
            
        
    }
    
}
