package com.lxisoft.animalgame.animal;
import java.util.Scanner;



public class Animal
{


 private int hungrylevel;
 private int strengthlevel;
 private String typeOfAnimal;
	
	
 
 Scanner scan=new Scanner(System.in);
 

public void setHungryLevel(int hungrylevel)
{
	this.hungrylevel=hungrylevel;
}
public int getHungryLevel()
{
	return hungrylevel;
}
public void setStrengthLevel(int strengthlevel)
{
	this.strengthlevel=strengthlevel;
}
public int getStrengthLevel()
{
	return strengthlevel;
}

public void setTypeOfAnimal(String typeOfAnimal)
{
	this.typeOfAnimal=typeOfAnimal;
}
public String getTypeOfAnimal()
{
	return typeOfAnimal;
}
	
	public void inputLionDetails()
	{}
	public void inputDeerDetails()
	{}
	public void inputRabbitDetails()
	{}
	public void inputTigerDetails()
	{}
	public void setLionLevels()
	{}
	public void setDeerLevels()
	{}
	public void setRabbitLevels()
	{}
	public void setTigerLevels()
	{}
	
}