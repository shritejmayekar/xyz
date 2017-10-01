
package com.que;

/**
 *compile javac -d . TestQueue.java
* run  java com.que/TestQueue

 * @author Shritesh
 */
import java.util.Scanner;
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
	if(front==null) {
		System.out.println("queue is empty");
		return;
	}
        front=front.link;
        size--;
    }
    
}
public class TestQueue {
    public static void main(String[] args) {
        Queue q=new Queue();
	Scanner sc=new Scanner(System.in);
       /* q.display();
        q.Enqueue(5);
        q.Enqueue(6);
        q.Enqueue(8);
        q.display();
        q.Dequee();
        q.display();
*/
	while(true) {
	System.out.println("\n1.Enqueue\n2.Dequeue\n3.display\n4.exit\n");	
	switch(sc.nextInt()) 
	{
	
	case 1:	System.out.print("Enter the value:");
		q.Enqueue(sc.nextInt());	
		break;
	case 2:	q.Dequee();
		break;
	case 3:	q.display();
		break;
	case 4:	System.exit(0);
		break;
	default:
		System.out.println("Inavalid choice");
		break;

	}

            
    }
    
}
}
