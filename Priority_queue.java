import java.util.*;
class P_queue{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		p_queueApp qq = new p_queueApp();
		
		while(true){
			System.out.println("Enter your choice:");
			System.out.println("1.IsEmpty! \n 2.IsFull! \n 3.Enqueue \n 4.Dequeue \n  5.Exit");
			int x = sc.nextInt();
			
			switch(x){
				case 1:
				if(qq.isEmpty()== true)
					System.out.println("Yes");
				else
					System.out.println("No");
				break;
				
				case 2:
				if(qq.isFull()== true)
					System.out.println("Yes");
				else
					System.out.println("No");
				break;
				
				case 3:
				System.out.println("Enter the value:");
				int b = sc.nextInt();
				qq.enqueue(b);
				break;
				
				case 4:
				System.out.println("Top priority value:"+qq.remove());
				break;
				
				case 5 :
				System.exit(0);
				return;
			}
			
		}
		
	}
}
class p_queueApp{
	int c;
	
	int[] a = new int[5];
	p_queueApp(){
		int c = 0;
	}
	
	public boolean isEmpty(){
		return(c == 0);
	}
	
	public boolean isFull(){
		return(c == 5);
	}
	
	public void enqueue(int m){
		
		if(isFull()){
					System.out.println("Queue is full.");
					
				}
		else{
			int j;
		if(c == 0)
			a[c++] = m;
		else{					//keeping the smallest key as highest priority
			for(j  = c-1; j>=0; j--){
				if(m>a[j])
					a[j+1] = a[j];
				else
					break;
				
			}
			a[j+1] = m;
			c++;
		} 
		
		
		}
		
	}
	
	public int remove(){
		if(isEmpty()){
					System.out.println("Queue is empty.");
					
					return 0;
				}
		else{
		return(a[--c]);
			}
	}
}                                                                                                          