   package com;

public class Bag {
	private String brand;
	private int cost;
	private String color;
	private int noOfComp;
	public Bag() {
		
	}
	public Bag(String brand, int cost, String color, int noOfComp) {
		if(brand.equalsIgnoreCase("adidas")|| brand.equalsIgnoreCase("puma")||brand.equalsIgnoreCase("skybags")||brand.equalsIgnoreCase("wildcraft"))
		{
		  this.brand = brand;
		}
		else
		{
			throw new BrandMismatchException();
		}
		if(cost>=400&&cost<=1500)
		{
		  this.cost = cost;
		}
		else
		{
			throw new CostOutOfBoundException();
		}
		if(color.equalsIgnoreCase("black")|| color.equalsIgnoreCase("orange")||color.equalsIgnoreCase("blue"))
		{
		  this.color = color;
		}
		else
		{
			throw new ColourMismatchException();
		}
		if(noOfComp>=1&&noOfComp<=5)
		{
		  this.noOfComp = noOfComp;
		}
		else
		{
			throw new CompartmentsOutOfBoundException();
		}
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		if(brand.equalsIgnoreCase("adidas")|| brand.equalsIgnoreCase("puma")||brand.equalsIgnoreCase("skybags")||brand.equalsIgnoreCase("wildcraft"))
		{
		  this.brand = brand;
		}
		else
		{
			throw new BrandMismatchException();
		}
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		if(cost>=400&&cost<=1500)
		{
			
		  this.cost = cost;
		
		}
		else
		{
			throw new CostOutOfBoundException();
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color.equalsIgnoreCase("black")|| color.equalsIgnoreCase("orange")||color.equalsIgnoreCase("blue"))
		{
		  this.color = color;
		}
		else
		{
			throw new ColourMismatchException();
		}
	}
	public int getNoOfComp() {
		return noOfComp;
	}
	public void setNoOfComp(int noOfComp) {
		if(noOfComp>=1&&noOfComp<=5)
		{
		  this.noOfComp = noOfComp;
		}
		else
		{
			throw new CompartmentsOutOfBoundException();
		}
	}
	
	public void display()
	{
		System.out.println("-----------------------");
		System.out.println("bag brand :"+getBrand());
		System.out.println("bag cost :"+getCost());
		System.out.println(" bag colour :"+getColor());
		System.out.println("bag comaprtments :"+getNoOfComp());
	}
	@Override
	public String toString() {
		return  "-----------------------------"+
				"\n Bag brand:" + getBrand()+
				"\n cost :" + getCost() +
				"\n color :" + getColor() +
				"\n noOfComp :" + getNoOfComp() +
				"\n ---------------------------";
	}
}
