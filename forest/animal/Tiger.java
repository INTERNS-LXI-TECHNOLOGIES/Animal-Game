package com.lxisoft.animalgame.forest.animal;
public class Tiger extends Animal
{
 	public String typeName()
	{
		setAnimalType("Tiger");		
		return getAnimalType();
	}
	/*public void setHungryLevel()
	{
		i=100;
		int hungry=(int)((Math.random() *i)+1);
		System.out.print(hungry);
	}
	public void setStrengthLevel()
	{
		int strength=(int)((Math.random() *100)+1);
		System.out.print(strength);
	}	*/
}