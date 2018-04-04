package com.lxisoft.animalgame.animal;
import java.util.Scanner;
public class Tiger extends Animal
{
	public void inputTigerDetails()
	{
		setTypeOfAnimal("tiGeR");
		//setHungryLevel((int)(Math.random()*50));
		//setStrengthLevel((int)(Math.random()*100));
		System.out.println(getTypeOfAnimal());
	}
		public void setTigerLevels()
	{
		setHungryLevel((int)(Math.random()*50)+1);
	    setStrengthLevel((int)(Math.random()*100)+1);
		System.out.print(" "+"HungryLevel ="+getHungryLevel());
		System.out.println(" "+"Strength Level ="+getStrengthLevel());
	}
}
