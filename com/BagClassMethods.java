package com;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


public class BagClassMethods {
	private Bag b;
	ArrayList<Bag> bag=new ArrayList();
	
	public void addBag(Bag b)
	{
		bag.add(b);
		System.out.println("bag added succesfully");
	}
	public void displayBag()
	{
		if(bag.isEmpty())
		{
			System.out.println("there is no bag");
		}
		else
		{
			for(Bag b: bag)
			{
				System.out.println(b );
			}
		}
	}
	public void searchBasedOnCost(int cost)
	{
		boolean isFound=false;
		if(bag.isEmpty())
		{
			System.out.println("there is no bag");
		}
		else
		{
			for(Bag b:bag)
			{
				if(b.getCost()==cost)
				{
					System.out.println("bag found :"+b.getBrand());
					isFound=true;
				}
			}
			
		}
		if(isFound==false)
		{
			System.out.println("bag not found");
		}
	}
	public void searchBasedONBrand(String brand)
	{
		boolean isFound=false;
		if(bag.isEmpty())
		{
			System.out.println("there is no bag");
		}
		else
		{
			for(Bag b:bag)
			{
				if(b.getBrand().equalsIgnoreCase(brand))
				{
					System.out.println("bag found :"+brand);
					isFound=true;
				}
			}
			
		}
		if(isFound==false)
		{
			System.out.println("bag not found");
		}
	}
	public void updateCostBasedonnoOfBlocks(int noOfBlocks,int newCost)
	{
		boolean isUpdated=false;
		boolean cost=false;
		if(bag.isEmpty())
		{
			System.out.println("there is no bag");
		}
		else
		{
			for(Bag b:bag)
			{
				if(b.getNoOfComp()==noOfBlocks)
				{
					b.setCost(newCost);
					isUpdated=true;
					cost=true;
					System.out.println("cost is updated");
				}
			}
			
		}
		if(isUpdated==false)
		{
			throw new CompartmentsOutOfBoundException();
		}
		if(cost==false)
		{
			throw new CostOutOfBoundException();
		}
	}
	
	public void removeBag(int cost)
	{
		ListIterator<Bag> li=bag.listIterator();
		boolean isUpdated=false;
		if(bag.isEmpty())
		{
			System.out.println("there is no bag");
		}
		else
		{
			
			while(li.hasNext())
			{
				Bag b=li.next();
				if(b.getCost()==cost)
				{
				  li.remove();
				  isUpdated=true;
				  System.out.println("bag is removed");
				}
			}
		}
		if(isUpdated==false)
		{
			throw new CostOutOfBoundException();
		}
	}
	

}

