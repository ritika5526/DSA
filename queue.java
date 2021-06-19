import java.util.*;
class Queue{
	int front,rear;
	int a[] = new int[5];
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue();
		while(true){
			
		System.out.println("Enter your choice:");
		System.out.println("1.IsEmpty! \n 2.IsFull! \n 3.Enqueue \n 4.Dequeue \n  5.Display \n 6.Exit");
		int x = sc.nextInt();
		
			switch(x){
				case 1:
				if(q.isFull()==true)
					System.out.println("Yes");
				else
					System.out.println("No");
				break;
				
				case 2:
				if(q.isEmpty()==true)
					System.out.println("Yes");
				else
					System.out.println("No");
				break;
				
				case 3:
				System.out.println("Enter the value");
				int n = sc.nextInt();
				q.enqueue(n);
				break;
				
				case 4:
				int p = q.dequeue();
				System.out.println("Deleted element:"+p);
				break;
				
				case 5:q.display();
				break;
				
				case 6: System.exit(0);
				return;
				
				
			}
		}
		
		
		
	}
	Queue(){
		int front=rear=-1;
	}


	public boolean isFull(){
		return(rear == 5);
	}
	
	public boolean isEmpty(){
		return (front == -1 && rear == -1);
	
	}
	
	public void enqueue(int val){
		if(isFull()){
			System.out.println("Queue is Full.");
			System.exit(1);
		}else
			if(isEmpty())
				front=rear=0;
		else{
			rear++;
			}
		a[rear] = val;
	}
	
	public int dequeue(){
		int x = 0;
		if(isEmpty()){
		System.out.println("Queue is Empty");
		System.exit(1);
	}
		else if(front == rear){
				x = a[front];
				front = rear = -1;
			}
		else
		{
			x = a[front];
			front++;
		}	
		return x;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			System.exit(1);
		}
		else
		{
			System.out.println("Elements are:");
			for(int j=front;j<=rear;j++){
				System.out.println(a[j]);
			}
		}
	}
	
	
}