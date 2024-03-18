package com;

public class BrandMismatchException extends RuntimeException{
	@Override
	public String toString()
	{
		return "bag must be adidas || puma || skybags ||wildcraft ";
	}

}
