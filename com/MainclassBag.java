package com;

import java.util.Scanner;

public class MainclassBag {
	public static void main(String[] args) {
		BagClassMethods m=new BagClassMethods();
		Scanner sc=new Scanner(System.in);
		boolean start=true; 
		while(start)
		{
			System.out.println("enter the choice: \n 1.add bag \n 2.display bag \n 3.search bag based on cost \n 4.search bag by brand \n 5.update Cost Based on noOfBlocks \n 6.remove bag based on cost \n 7.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("enter the brand name");
				String brandName=sc.next();
				System.out.println("enter the cost of bag");
				int cost =sc.nextInt();
				System.out.println("enter the bag color");
				String color=sc.next();
				System.out.println("enter the no of compartments for bag");
				int noOfComp=sc.nextInt();
				
				while(true)
				{
					try
					{
						m.addBag(new Bag(brandName,cost,color,noOfComp));
						break;
					}
					catch(BrandMismatchException be)
					{
						System.out.println("re-enter the brand name");
						brandName=sc.next();
					}
					catch(ColourMismatchException ce)
					{
						System.out.println("re-enter the color of bag");
						color=sc.next();
					}
					catch(CompartmentsOutOfBoundException c)
					{
						System.out.println("re-enter the no of compartments of bag");
						noOfComp=sc.nextInt();
					}
					catch(CostOutOfBoundException c)
					{
						System.out.println("re-enter the new cost");
						cost=sc.nextInt();
					}
				}
			}
			break;
			case 2:
			{
				m.displayBag();
			}
			break;
			case 3:
			{
				 System.out.println("enter the bag cost");
				  int cost=sc.nextInt();
				  m.searchBasedOnCost(cost);
			}
			break;
			case 4:
			{
				 System.out.println("enter the bag brandName");
				  String brandName=sc.next();
				  m.searchBasedONBrand(brandName);
			}
			break;
			case 5:
			{
				System.out.println("enter the no of blocks");
				int noOfBlocks=sc.nextInt();  
				System.out.println("enter the  cost");
				int cost=sc.nextInt();
				while(true)
				{
					try
					{
						m.updateCostBasedonnoOfBlocks(noOfBlocks,cost);
						break;
					}
					catch(CostOutOfBoundException c)
					{
						System.out.println("re-enter the new cost");
						cost=sc.nextInt();
					}
					catch(CompartmentsOutOfBoundException c)
					{
						System.out.println("re-enter the no of blocks");
						noOfBlocks=sc.nextInt();
					}
					
				}
			}
			break;
			
			
			case 6:
			{
				System.out.println("enter the  cost");
				int cost=sc.nextInt();
				while(true)
				{
					try
					{
						m.removeBag(cost);
						break;
					}
					catch(CostOutOfBoundException c)
					{
						System.out.println("re-enter the  cost");
						cost=sc.nextInt();
					}
				}
			}
			break;
			case 7:
			{
				start=false;
				System.out.println("thank you....... :) :) ");
			}
			break;
			default:System.out.println("enter the valid choice .... ): ):");
			}
	
		}
	
	}
}
