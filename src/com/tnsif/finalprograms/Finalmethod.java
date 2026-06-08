package com.tnsif.finalprograms;
// demo for final method

class father{
	int a=90;
	
	void display() {
		System.out.println("welcome to java");
	}
}

public class Finalmethod extends father {
	@Override
	final void display() {
		System.out.println("welcome to python");
	}

}