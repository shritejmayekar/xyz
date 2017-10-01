//import java.util.Arrays;
class ArrayList {
	int size;
	int capacity;
	Object arr[];
	ArrayList() {
		size=0;
		capacity=5;
		arr=new Object[capacity];
	
		
	}
	void add(Object value) {
	
	if(size==capacity) {
	
		//System.out.println("imposssible");
		increaseCapacity();
		
		//return;
	}
	arr[size++]=value;
	
	
	}
	void addAt(Object value,int pos) {
	
		if(pos>size) {
		
			System.out.println("Impossible");
			return;
		}
		
	arrange(value,pos);
	
	}
	void arrange(Object value,int pos) {
	
		Object copy[]=new Object[capacity];
		for(int i=0;i<size+1;i++) {
			if(i==pos) {
				int j=pos;
				while(j<size) {
					copy[j+1]=arr[j];
					j++;
						
				}
				copy[pos]=value;
				arr=copy;
				return;
				
			}
			
		
		}
	
	}

	void increaseCapacity() {
		capacity=capacity*2;
		//arr=Arrays.copyOf(arr,capacity);
		Object[] copy=new Object[capacity];
		
		for(int i=0;i<size;i++) {
			copy[i]=arr[i];
		}
		arr=new Object[capacity];
		arr=copy;
	}
	void display() {
		System.out.println("=========Arraylist==========");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ "->");
		
		}
		System.out.println();
	
	
	}
	void removeEnd() {
		Object remove;
		remove=arr[size];
		size--;
		
	
	
	}		




}



class Testarr {
	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(5);
	a.add(15);
	a.add(8);
	a.add(18);
	a.add(81);
	a.display();
	a.add(8);
	a.add(12);
	a.add(55);
	a.add(64);
	a.display();
	a.removeEnd();
	a.display();
	a.addAt(88,0);
	a.display();
	}
}
