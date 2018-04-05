package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Forest
{
	
	private ArrayList<Animal>animals=new ArrayList<>();

private  String name;

Scanner scan=new Scanner(System.in);


public void createAnimals()
{
	animals.add(new Lion());
	animals.add(new Deer());
	animals.add(new Rabbit());
	animals.add(new Tiger());

}


//Scanner scan=new Scanner(System.in);

public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}


public void setanimal(ArrayList<Animal> animals)
{
	this.animals=animals;
}
public ArrayList<Animal> getanimal()
{
	return animals;
}

public void inputForestDetails()
{
	setName("MALAMPUZHA FOREST");
	System.out.println("********"+getName()+"********");
	
	System.out.println("*********ANIMALS ARE*********");
    //  for(int j = 0;j<4;j++)
	//{
		
	//System.out.println(animals.get(j).getTypeOfAnimal());
	/*System.out.println(animals.get(1).getName());
	System.out.println(animals.get(2).getName());
	System.out.println(animals.get(3).getName());*/
	//}
	initialization();
	 inputGameImplimentation();
	  animalGenertaion();
	
}

public void initialization()
{
	
	for(int i=0;i<animals.size();i++)
	{
		if(i==0)
		{
			
			animals.get(i).inputLionDetails();
			animals.get(i).setLionLevels();
		}
		if(i==1)
		{
			animals.get(i).inputDeerDetails();
			animals.get(i).setDeerLevels();
		}
		if(i==2)
		{
			animals.get(i).inputRabbitDetails();
			animals.get(i).setRabbitLevels();
		}
		if(i==3)
		{
			animals.get(i).inputTigerDetails();
			animals.get(i).setTigerLevels();
		}
		
	}	
	
}
	public void inputGameImplimentation()
	{
		
		
		System.out.println("                                                   ");
		System.out.println("********ANIMALS ARE ENTERED INTO THE GAME**********");
		System.out.println("***********ANIMALS ARE REDY TO FIGTH****************");
		System.out.println("                                                   ");
		
		 int i = (int)(Math.random()*animals.size());
		if(animals.get(i) instanceof Tiger)
		{
			
			
		}
		
	}

   public void animalGenertaion()
   {
	   int ch=0;
	   do{
		  
	   String animal1;
	   String animal2;
	   Animal a1 = animalSelection();
	   Animal a2 = animalSelection();
	   animal1 = a1.getTypeOfAnimal();
	   animal2 = a2.getTypeOfAnimal();
	   if(a1!=a2){
		   System.out.println(animal1+" vs "+animal2);
		   
			if(a1.getStrengthLevel()>a2.getStrengthLevel() && a1.getHungryLevel()>a2.getHungryLevel())
			{
				System.out.println(a1.getTypeOfAnimal()+"WIN");
			}
			else{
				System.out.println(a2.getTypeOfAnimal()+"WIN");
			}
		}
		else{
				System.out.println("same animal....... try again....");
				
		}
		System.out.println("do you want to play again 1.yes/0.no");
		ch=scan.nextInt();
	   }while(ch==1);
	}
   
   
   public Animal animalSelection()
   {
	    
		int x=(int)(Math.random()*animals.size());
		Animal selectAnimal=animals.get(x);
	    return selectAnimal;
   }
}