package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import java.util.ArrayList;

public class Forest
{
	
 private ArrayList<Animal>animals=new ArrayList<>();

private  String name;



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
	
	System.out.println("*****ANIMALS ARE*****");
    //  for(int j = 0;j<4;j++)
	//{
		
	//System.out.println(animals.get(j).getTypeOfAnimal());
	/*System.out.println(animals.get(1).getName());
	System.out.println(animals.get(2).getName());
	System.out.println(animals.get(3).getName());*/
	//}
	initialization();
	
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
		System.out.println("ANIMALS ARE ENTERED INTO THE GAME :");
		System.out.println("ANIMALS ARE REDY TO FIGTH :");
	}








}
