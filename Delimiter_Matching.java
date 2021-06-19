import java.util.*;
class StackD{
	private int size;
	private char[] ar;
	private int top;
	StackD(int n){
		size = n;
		ar = new char[size];
		top = -1;
	}
	public void push(char val){
		ar[++top] = val;
	}
	
	public char pop(){
		return ar[top--];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
}

class delimit{
	private String input;
	delimit(String in){
		input = in;
	}
	public void check(){
		int len = input.length();
		StackD ss = new StackD(len);
		for(int i = 0;i<input.length();i++){
			char value = input.charAt(i);
			switch(value){
			case '{' :
			
			case '(' :
			
			case '[' :
						ss.push(value);
						break;
			case ')' :
			
			case ']' :

			case '}' :
						if(!ss.isEmpty()){
							char ch = ss.pop();
						if((value == '}' && ch!='{') || (value == ']' && ch!='[') || (value == ')' && ch!='('))
							System.out.println("Error: "+value+" at "+i);
						}
						
						break;
			default:
						break;
						
			}		
		}
		if(!ss.isEmpty())
			System.out.println("Missing delimiter");	
	}
}

class Delimit_check{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input;
		while(true){
			System.out.println("Enter the string:");
			input = sc.nextLine();
			if(input.equals("")){
				System.out.println("Empty string");
				break;
			}
			delimit dd = new delimit(input);
			dd.check();
		}
		
	}
}
