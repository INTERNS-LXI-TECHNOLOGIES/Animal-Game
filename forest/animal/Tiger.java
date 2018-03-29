package com.lxisoft.animalgame.forest.animal;
public class Tiger extends Animal
{
	//Animal a = new Tiger();
	public String typeName()
	{
		//a.
		setAnimalType("Tiger");
		//a.
		
		return getAnimalType();
	}
	public void setHungryLevel()
	{
		int hungry=(int)((Math.random() *100)+1);
		System.out.print(hungry);
	}
	public void setStrengthLevel()
	{
		int strength=(int)((Math.random() *100)+1);
		System.out.print(strength);
	}	
}