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
	/*public String typeName()
	{
		return null;
	}*/
}