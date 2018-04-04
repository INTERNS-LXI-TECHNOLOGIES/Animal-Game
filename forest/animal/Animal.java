package com.lxisoft.animalgame.forest.animal;
public abstract class Animal
{
	private String animalType;
	
	public void setAnimalType(String type)
	{
		this.animalType = type;
	}
	public String getAnimalType()
	{
		return animalType;
	}
	public abstract String typeName();
	public void setHungryLevel(int startingLevel,int endingLevel)
	{
		int hungry=startingLevel+(int)(Math.random() *(endingLevel-startingLevel)+1);
		System.out.print(hungry);
	}
	public void setStrengthLevel(int startingLevel,int endingLevel)
	{
		int strength=startingLevel+(int)(Math.random() *(endingLevel-startingLevel)+1);
		System.out.print(strength);
	}
	/*public String typeName()
	{
		return null;
	}*/
}