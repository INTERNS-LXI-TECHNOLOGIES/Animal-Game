package com.lxisoft.animalgame.forest;
import java.util.ArrayList;
import com.lxisoft.animalgame.forest.animal.Animal;
import com.lxisoft.animalgame.forest.animal.Tiger;
import com.lxisoft.animalgame.forest.animal.Rabbit;
import com.lxisoft.animalgame.forest.animal.Lion;
import com.lxisoft.animalgame.forest.animal.Deer;
public class Forest
{
	String name;
	
	ArrayList<Animal> animals = new ArrayList <>();
	Tiger t = new Tiger();
	Rabbit r = new Rabbit();
	Lion l = new Lion();
	Deer d = new Deer();
	
	public void animalType()
	{
		animals.add(new Tiger());
		System.out.println(animals.get(animals.size()-1).typeName());
		t.setHungryLevel();	
		
		animals.add(new Rabbit());
		System.out.println(animals.get(animals.size()-1).typeName());
		
		animals.add(new Lion());
		System.out.println(animals.get(animals.size()-1).typeName());
		
		animals.add(new Deer());
		System.out.println(animals.get(animals.size()-1).typeName());
		
		//System.out.print(animals.contains(animals.get(animals.size()-1)));
		/*for(int i = 0; i < animals.size(); i++) 
		{   
			System.out.print(animals.get(i));
		} */
	}
	public void setAnimalsForFight()
	{
		
	}
}