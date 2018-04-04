package com.lxisoft.animalgame.forest.animal;
public class Deer extends Animal
{
	public String typeName()
	{
		setAnimalType("Deer");
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