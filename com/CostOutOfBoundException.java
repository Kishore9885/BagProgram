package com;

public class CostOutOfBoundException extends RuntimeException{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cost should be less than 1500 and greater than 400";
	}
	
	

}
