package balancedParan;

import java.util.Stack;

public class balancedParanthesis {
	
	public static void main(String args[]){
		System.out.println(balanParan("))(("));
		System.out.println(balanParan("(s)"));
		
	}
	
	public static int balanParan(String s) {
		Stack<Character> stack = new Stack<Character>();
		int needed = 0;
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if (c == '('){
				stack.push(c);
			}
			else if (c == ')'){

				if (!stack.isEmpty()){
					stack.pop();
				}
				else{
					needed += 1;
				}
			}
				
		}			
		return needed + stack.size();	
	}

}
