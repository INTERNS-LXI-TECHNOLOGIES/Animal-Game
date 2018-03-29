package com.lxisoft.animalgame.animal; 
import java.util.*;

public class Animal
{
	private String nameOfAnimal;
	private int hungryLevel;
	private int strengthLevel;
	 
	 public void setName(String  nameOfAnimal)
	 {
		 this.nameOfAnimal = nameOfAnimal;
	 }
	 public String getNameOfAnimal()
	 {
		 return nameOfAnimal;
	 }
	 public void setHungryLevel(int hungryLevel)
	 {
		 this.hungryLevel = hungryLevel;
	 }
     public int getHungryLevel()
     {
	    return hungryLevel;
     } 
     public void setStrengthLevel(int strengthLevel)
	 {
		 this.strengthLevel = strengthLevel;
	 }
    public int getStrengthLevel()
	{
		return strengthLevel;
	}	
	 public String animalCharacteristics() 
	 {
	 return "animal";
	 }
	 
	 
	/*public int setHungryLevel()
	{
	return setHungryLevel((int) (Math.random()*50)+1);
	}*/
	 
	 
}

