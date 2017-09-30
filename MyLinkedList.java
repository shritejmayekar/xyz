
package com.br;

import java.util.Scanner;

/**
 *
 * @author Shritej
 */
class Node{
    public int data;
    public Node link;
    Node() {
        data=0;
        link=null;
    }
    Node(int value,Node link) {
        data=value;
        this.link=link;
    }
}
class myLinkedList{
    Node start;
    Node end;
    public int size;

    public myLinkedList() {
        start=null;
        size=0;
    }
    
    
    void insertAtFirst(int value) {
        Node ptr=new Node(value,null);
        size++;
        if(start==null) {
            start=ptr;
            
        }
        else {
            ptr.link=start;
            start=ptr;
        }
        
    }
    void display() {
        System.out.println("linked list");
        Node nptr=start;
        if(size==0) {
            System.out.println("empty");
            return;
        }
        if(start.link==null) {
            System.out.print(start.data+" ->");
            return;
        }
        System.out.print(start.data+" -> ");
        nptr=nptr.link;
        while(nptr.link!=null) {
            System.out.print(nptr.data+" -> ");
            nptr=nptr.link;
        }
        System.out.print(nptr.data+" \n");
    }
    void insertAtEnd(int value) {
        Node nnptr=new Node(value,null);
        size++;
        if(start==null) {
            start=nnptr;
            return;
        }
        else {
            Node travel=start;
            //travel=travel.link;
            while(travel.link!=null) {
                travel=travel.link;
            }
            
            travel.link=nnptr;
        }
    }
    void deleteAtFirst() {
        start=start.link;
        size--;
        return;
    }
    void deleteAtEnd() {
        Node delete=start;
        while(delete.link!=null) {
            end=delete;
            delete=delete.link;
        }
        size--;
        end.link=null;
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
        Node deletePos=start;
       
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
    void insertAtPos(int value,int pos) {
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
        Node ptr=start;
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

public class MyLinkedList {
    public static void main(String[] args) {
        myLinkedList list=new myLinkedList();
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
                        list.insertAtFirst(sc.nextInt());
                        break;
                case 2: System.out.print("Enter value:");
                        list.insertAtEnd(sc.nextInt());
                        break;
                case 3: System.out.print("Enter value and position");
                        list.insertAtPos(sc.nextInt(),sc.nextInt());
                        break;
                case 4: list.deleteAtFirst();
                        break;
                case 5: list.deleteAtEnd();
                        break;
                case 6: list.display();
                        break;
                case 7: list.deletByPosition(sc.nextInt());
                        break;
                case 8: System.out.println("size:"+list.size);
                        break;
                case 9: System.exit(0);
                
                default: System.out.println("Invalid choice");
                         break;
            }
        }
        
    }
    
}
