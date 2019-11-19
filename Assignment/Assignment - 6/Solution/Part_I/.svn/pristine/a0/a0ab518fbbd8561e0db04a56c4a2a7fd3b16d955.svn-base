//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - I
//===================================

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String[] input = {"({})","({)","(1+2) * {(2+3)*(3+4)}","(1+2) * {{2+3)*(3+4}}"};
		
		for (int i=0; i<input.length;i++ ) {
			boolean answer = bracketMacthing(input[i]);
			System.out.println("Case " + (i+1) + ": " + answer);
		}

		System.out.println("*****************");

		int[] array1 = {1,3,5,4,6,8};
		int[] array2 = {9,2,5,3,8,7};
		int[] array3 = {3,2,4,6,7,5};

		List<int[]> question = new ArrayList<>();
		question.add(array1);
		question.add(array2);
		question.add(array3);

		for (int i=0 ;i<3 ;i++ ) {

			MyQueue queue1 = new MyQueue();
			int[] array = question.get(i);

 			for (int j=array.length-1 ;j>=0 ;j-- ) {

				Node temp = new Node();
				temp.setIntData(array[j]);
				queue1.enqueue(temp);

			}

			System.out.println("Case : " + (i+1));
			System.out.printf("input : ");
			MyQueue.displayQueue(queue1);
			System.out.println();
			System.out.printf("output : ");
			MyQueue.displayQueue(reverseQueue(queue1));
			System.out.println();

		}
		
		
	}

	public static boolean bracketMacthing (String input) {
		// List<Character> ip = new ArrayList<>();
		MyStack stack = new MyStack();
		for (int i=0 ;i<input.length() ;i++ ) {
			if (input.charAt(i)=='{' || input.charAt(i)=='[' || input.charAt(i)=='(' ) {
				Node temp = new Node();
				temp.setCharData(input.charAt(i));
				stack.push(temp);
			}

			else if (input.charAt(i)=='}') {
				Node temp = stack.peek();
				if (temp.getCharData()=='{') {
					stack.pop();
				}
				else {
					return false;
				}
			}

			else if (input.charAt(i)==']') {
				Node temp = stack.peek();
				if (temp.getCharData()=='[') {
					stack.pop();
				}
				else {
					return false;
				}
			}

			else if (input.charAt(i)==')') {
				Node temp = stack.peek();
				if (temp.getCharData()=='(') {
					stack.pop();
				}
				else {
					return false;
				}
			}
		}

		return true;
	}

	public static MyQueue reverseQueue(MyQueue input) {

		MyQueue output = new MyQueue();
		List<Integer> dummy = new ArrayList<>();

		while(!input.isEmpty()) {
			Node temp = input.dequeue();
			dummy.add(temp.getIntData());
			
		}

		for (int i=dummy.size()-1 ;i>=0 ;i-- ) {
			Node temp = new	Node();
			temp.setIntData(dummy.get(i));
			output.enqueue(temp);	
		}

		return output;
	}
}
