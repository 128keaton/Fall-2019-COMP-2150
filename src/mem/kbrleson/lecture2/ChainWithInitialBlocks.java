package com.Constructors;

public class ChainWithInitialBlocks {
	// block to be excuted first
	{
		System.out.println("init block");
	}

	ChainWithInitialBlocks() {
		this(100);
		System.out.println("no Arg constructor");
	}

	ChainWithInitialBlocks(int x) {
		System.out.println(x);
	}

	// block to be executed after the first block
	// which has been defined above.
	{
		System.out.println("second block");
	}

	public static void main(String args[]) {
		new ChainWithInitialBlocks();
		new ChainWithInitialBlocks(10);
	}
}
