package com.lxisoft.animalgame.animal;
import java.util.Scanner;
public class Deer extends Animal
{
	public void inputDeerDetails()
	{
		setTypeOfAnimal("dEer");
		//setHungryLevel((int)(Math.random()*50));
		//setStrengthLevel((int)(Math.random()*100));
		System.out.println(getTypeOfAnimal());
	
	}
		public void setDeerLevels()
	{
		setHungryLevel((int)(Math.random()*50)+1);
	    setStrengthLevel((int)(Math.random()*100)+1);
		System.out.print(" "+"HungryLevel ="+getHungryLevel());
		System.out.println(" "+"Strength Level ="+getStrengthLevel());
	}
}