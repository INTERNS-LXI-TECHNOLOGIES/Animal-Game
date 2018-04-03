package com.lxisoft.animalgame.forest.animal;
 	public String typeName()
	{
		setAnimalType("Tiger");		
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