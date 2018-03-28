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
	
	public void animalType()
	{
		animals.add(new Tiger());
		animals.get(animals.size()-1).getAnimalType;
		//System.out.print(animals.getAnimalType);
		//animal.add(new Deer());
		//animal.add(new Rabbit());
		//animal.add(new Lion());
	}
}