package com.lxisoft.animalgame.forest.animal;
public class Tiger extends Animal
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
	
	public void typeName()
	{
		setAnimalType("Tiger");
	}
}