
package com.arrl;
/**
 *
 * @author Shritej
 */
import java.util.Scanner;
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
 /*   
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
	
*/
 void insertAtFirst(Object value) {
        Node ptr=new Node(value,null);
        size++;
        if(front==null) {
            front=ptr;
            
        }
        else {
            ptr.link=front;
            front=ptr;
        }
        
    }
    void display() {
        System.out.println("Array linked list");
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
    void insertAtEnd(Object value) {
        Node nnptr=new Node(value,null);
        size++;
        if(front==null) {
            front=nnptr;
            return;
        }
        else {
            Node travel=front;
            //travel=travel.link;
            while(travel.link!=null) {
                travel=travel.link;
            }
            
            travel.link=nnptr;
        }
    }
    void deleteAtFirst() {
        front=front.link;
        size--;
        return;
    }
    void deleteAtEnd() {
        Node delete=front;
        while(delete.link!=null) {
            rear=delete;
            delete=delete.link;
        }
        size--;
        rear.link=null;
    }
    void deletByPosition(int pos) {
        
        if(pos==0) {
            deleteAtFirst();
           
            return;
        }
        if(pos==size) {
            deleteAtEnd();
            return;
        }
        Node deletePos=front;
       
        for (int j = 1; j <= size; j++) {
            
            if(j==pos) {
                Node temp=deletePos.link;
                temp=temp.link;
                deletePos.link=temp;
                break;
            }
            deletePos=deletePos.link;
        }
        size--;
    }
    void insertAtPos(Object value,int pos) {
        if(pos>size) {
            System.out.println("impossible");
            return;
        }
        if(pos==0) {
            insertAtFirst(value);
            return;
        }
        if(pos==size) {
            insertAtEnd(value);
            return;
        }
        Node ptr=front;
        Node nptr=new Node(value,null);
        for(int i=1;i<=size;i++) {
            if(i==pos) {
                
                Node temp=ptr.link;
                ptr.link=nptr;
                nptr.link=temp;
                break;
                
            }
            ptr=ptr.link;
            
        }
        size++;
       
    }

    
}


public class TestArr {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList(3);
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("1.Insert at first"
                    + "\n2.Insert at End"
                    + "\n3.Insert at position"
                    + "\n4.Delete at first"
                    + "\n5.Delete at End"
                    + "\n6.Diplay"
                    + "\n7.Delete at position"
                    + "\n8.Get size"
                    + "\n9.Exit\n");
            switch(sc.nextInt()) {
                case 1: System.out.print("Enter value:");
                        arr.insertAtFirst(sc.nextInt());
                        break;
                case 2: System.out.print("Enter value:");
                        arr.insertAtEnd(sc.nextInt());
                        break;
                case 3: System.out.print("Enter value and position");
                        arr.insertAtPos(sc.nextInt(),sc.nextInt());
                        break;
                case 4: arr.deleteAtFirst();
                        break;
                case 5: arr.deleteAtEnd();
                        break;
                case 6: arr.display();
                        break;
                case 7: arr.deletByPosition(sc.nextInt());
                        break;
                case 8: System.out.println("size:"+arr.size);
                        break;
                case 9: System.exit(0);
                
                default: System.out.println("Invalid choice");
                         break;
            }
        }
        
            
        
    }
    
}
