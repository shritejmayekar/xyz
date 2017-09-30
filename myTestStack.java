
package corejava;

/**
 *
 * @author Shritej
 */
class newNode
{
    int data;
    newNode link;
 
    /*  Constructor  */
    public newNode()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public newNode(int d,newNode n)
    {
        data = d;
        link = n;
    }    
    
}
class myyStack {
    newNode top;
    public int size;
	/*  Constructor  */
    public myyStack() {
        top=null;
        size=0;
    }
	/* stack push operation */
    public void push(int value) {
    newNode ptr=new newNode(value,null);
    size++;
		if(top==null) {
			top=ptr;
		}
		else {
			ptr.link=top;
			top=ptr;
        
		}
    
    }
	/* stack pop operation */
    public void pop() {
        top=top.link;
        size--;
        return;
        
    }
	/* stack display */
    public void display() {
        System.out.println("stack display");
        if(size==0) {
            System.out.println("empty");
            return;
        }
        
        if(top.link==null){
            System.out.println("|"+top.data +"|");
            return;
            
        }
        newNode nptr=top;
        System.out.println("|"+top.data+"|");
        nptr=top.link;
        while(nptr.link!=null) {
            System.out.println("|"+nptr.data+"|");
            nptr=nptr.link;
        }
        System.out.print("|"+nptr.data+"|\n ");
        
    }
   
    
    
}
public class myTestStack {
    public static void main(String[] args) {
       myyStack st=new myyStack();
       st.display();
       st.push(5);
       st.push(6);
       st.push(7);
	   st.push(15);
       st.display();
       st.pop();
       st.display();
            
    }
}
