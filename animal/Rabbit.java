package com.lxisoft.animalgame.animal;
import java.util.Scanner;
public class Rabbit extends Animal
{
	public void inputRabbitDetails()
	{
		setTypeOfAnimal("rAbbiT");
		//setHungryLevel((int)(Math.random()*50));
		//setStrengthLevel((int)(Math.random()*100));
		System.out.println(getTypeOfAnimal());
	}
		public void setRabbitLevels()
	{
		setHungryLevel((int)(Math.random()*50)+1);
	    setStrengthLevel((int)(Math.random()*100)+1);
		System.out.print(" "+"HungryLevel ="+getHungryLevel());
		System.out.println(" "+"StrengthLevel ="+getStrengthLevel());
	}
}