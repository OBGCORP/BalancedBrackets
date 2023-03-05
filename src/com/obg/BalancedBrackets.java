package com.obg;
import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {
	 
	public static boolean isBalanced() {
		Stack<Character> stack = new Stack<Character>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter brackets to be checked");
		String input = scanner.nextLine();
		for(int i = 0; i < input.length(); i++) {
			if("{[(".contains(Character.toString(input.charAt(i)))) {
				stack.add(input.charAt(i));
			}
			else if(input.charAt(i) == '}' && stack.peek() == '{') {
				stack.pop();
			}
			else if(input.charAt(i) == ']' && stack.peek() == '[') {
				stack.pop();
			}
			else if(input.charAt(i) == ')' && stack.peek() == '(') {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		System.out.println(isBalanced());

	}

}
