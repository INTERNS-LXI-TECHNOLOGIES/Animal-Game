package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import java.util.ArrayList;

public class Forest
{
	
ArrayList<Animal>animals=new ArrayList<>();

private  String name;
private  String Animals;

public void createAnimals()
{
	animals.add(new Lion());
	animals.add(new Deer());
	animals.add(new Tiger());
	animals.add(new Rabbit());

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


public void setanimal(String Animals)
{
	this.Animals=Animals;
}
public String getanimal()
{
	return Animals;
}

public void inputForestDetails()
{
	setName("MALAMPUZHA FOREST");
	System.out.println("********"+getName()+"********");
	
	System.out.println("*****ANIMALS ARE*****");
	System.out.println(animals.get(0).getName());
	System.out.println(animals.get(1).getName());
	System.out.println(animals.get(2).getName());
	System.out.println(animals.get(3).getName());
	
}

public void initilization()
{
	Lion.setHungeryLevel((int)(Math.random()*50));
	Lion.setStrengthLevel((int)(Math.random()*100));
	Deer.setHungeryLevel((int)(Math.random()*50));
	Deer.setStrengthLevel((int)(Math.random()*100));
	Tiger.setHungerLevel((int)(Math.random()*50));
	Tiger.setStrengthLevel((int)(Math.random()*100));
	Rabbit.setHungryLevel((int)(Math.random()*50));
	Rabbit.setStrengthLevel((int)(Math.random()*100));
}








}
