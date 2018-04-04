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
	Animal t = new Tiger();
	Animal r = new Rabbit();
	Animal l = new Lion();
	Animal d = new Deer();
	
	public void animalType()
	{
		animals.add(new Tiger());
		System.out.println(animals.get(animals.size()-1).typeName());
		t.setHungryLevel(60,100);	
		t.setStrengthLevel(60,100);
		animals.add(new Rabbit());
		System.out.println(animals.get(animals.size()-1).typeName());
		r.setHungryLevel(10,20);	
		r.setStrengthLevel(10,20);
		animals.add(new Lion());
		System.out.println(animals.get(animals.size()-1).typeName());
		l .setHungryLevel(60,100);
		l.setStrengthLevel(60,100);
		animals.add(new Deer());
		System.out.println(animals.get(animals.size()-1).typeName());
		d.setHungryLevel(20,45);
		d.setStrengthLevel(20,45);
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