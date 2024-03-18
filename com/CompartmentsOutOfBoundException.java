package com;

public class CompartmentsOutOfBoundException extends RuntimeException {

	@Override
	public String toString() {
		return "CompartmentsOutOfBoundException because compartments less than 5 and greater than 1";
	}
	
}
