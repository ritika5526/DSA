import java.util.*;

class StackR{
	private int size;
	private char[] ar;
	private int top;
	StackR(int s){
		size = s;
		ar= new char[size];
		top = -1;
	}
	public void push(char val){
		ar[++top] = val;
	}
	
	public char pop(){
		return ar[top--];
	}
	
	public char peek(){
		return ar[top];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	
}

class ReverseR{
	private String input;
	private String output;
	ReverseR(String in){
		input = in;
	}
	public String doRev(){
		int len = input.length();
		StackR ss = new StackR(len);
		for(int i = 0;i<input.length();i++){
			char value = input.charAt(i);
			ss.push(value);
		}
		output = "";
		while(!ss.isEmpty()){
			char ch = ss.pop();
			output = output + ch;
		}
		return output;
	}
}

class Reverse_word{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input,output;
		
		while(true){
		System.out.println("Enter the string:");
		input = sc.nextLine();
		if(input.equals("")){
		System.out.println("Empty String.");
		break;
		}
		ReverseR rob = new ReverseR(input);
		output = rob.doRev();
		System.out.println("The reversed string using Stack:"+output);
		
		}
		
		
	}
}