package com.lxisoft.animalgame.forest.animal;
public class Lion extends Animal
{
	public String typeName()
	{
		setAnimalType("Lion");
		return getAnimalType();
	}
	/*public void setHungryLevel()
	{
		int hungry=(int)((Math.random() *100)+1);
		System.out.print(hungry);
	}
	public void setStrengthLevel()
	{
		int strength=(int)((Math.random() *100)+1);
		System.out.print(strength);
	}*/
}