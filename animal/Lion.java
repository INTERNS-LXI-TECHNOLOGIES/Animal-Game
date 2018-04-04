package com.lxisoft.animalgame.animal;
import java.util.Scanner;
public class Lion extends Animal
{
	
	public void inputLionDetails()
	{	
		setTypeOfAnimal("liOn");
	    //setHungryLevel((int)(Math.random()*50)+1);
	   // setStrengthLevel((int)(Math.random()*100)+1);
	    System.out.println(getTypeOfAnimal());
	}
	public void setLionLevels()
	{
		setHungryLevel((int)(Math.random()*50)+1);
	    setStrengthLevel((int)(Math.random()*100)+1);
		System.out.print(" "+"HungryLevel ="+getHungryLevel());
		System.out.println(" "+"Strength Level ="+getStrengthLevel());
	}
}

