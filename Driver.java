package com.gl.balancebracket.main;

import com.gl.balancebracket.service.BalancingBrackets;

public class Driver {
	public static void main(String[] args) {
		
		BalancingBrackets balancingBrackets= new BalancingBrackets();
		String expression="([[{}]])";
		
		Boolean result;
		
		result= balancingBrackets.checkingBracketsBalanced(expression);
		if(result)
			System.out.println("The entered string has balanced brackets");
		else
			System.out.println("The entered string do not contain balanced brackets");
	}

}
