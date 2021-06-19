import java.util.*;
class StackX{
	private int size;
	private long[] ar;
	private int top;
	public StackX(int n){
		size = n;
		top = -1;
		ar = new long[size];
	}
	public void push(long val){
		if(isFull())
			System.out.println("Stack overflow");
		else
		ar[++top] = val;
	}
	
	public long pop(){
		if(isEmpty()){
		System.out.println("Stack underflow");
		return 0;
		}
		
		else
		return ar[top--];
	}
	
	public long peek(){
		return ar[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == size-1);
	}
	
}


class StackApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StackX ob = new StackX(10);
		while(true)
    {
       System.out.println("\n 1.Push \n 2.Pop \n 3.Peek \n 4.isEmpty? \n 5.isFull? \n 6.Exit \n Enter ur choice=");
       int n=sc.nextInt();
       switch(n)
       {
        case 1:  long value = sc.nextLong();
				ob.push(value);
                 break;
                
                
        case 2:  
                 System.out.println("Popped Value:"+ob.pop());
				 break;
                
                
        case 3:  System.out.println("Peek value:"+ob.peek());
                 break; 
        
        
        case 4:  if(ob.isEmpty())
					System.out.println("Stack Empty.");
				else
					System.out.println("Stack not Empty.");
                 break;
        
        
        case 5:  if(ob.isFull())
					System.out.println("Stack Full.");
				else
					System.out.println("Stack not Full.");
                 break;
        
        
        case 6:  System.exit(0);
                 return;  
                
        
			}
    
		}
		
	}
}