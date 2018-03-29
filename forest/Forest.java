package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import java.util.*;
public class Forest
{
	
  private String name;
	 
	 public void setName(String  name)
	 {
		 this.name = name;
	 }
	 public String getName()
	 {
		 return name;
	 }   
   ArrayList<Animal>animals = new ArrayList<>();
	
    public void gameImplementation()
	 {
		
		System.out.println("******GAME STARTS******");
		setName("AMAZON FOREST");
		System.out.println(getName());
		System.out.println("Animals are:");
			 //System.out.print("aaa");
		animals.add(new Elephant());
		    animals.get(animals.size()-1).setName(getClass().getSimpleName());
		    animals.get(animals.size()-1).setHungryLevel((int) (Math.random()*50)+1);
			animals.get(animals.size()-1).setStrengthLevel((int)(Math.random()*50)+1);
		animals.add(new Lion());
		    animals.get(animals.size()-1).setName(getClass().getSimpleName());
		    animals.get(animals.size()-1).setHungryLevel((int) (Math.random()*50)+1);
			animals.get(animals.size()-1).setStrengthLevel((int)(Math.random()*50)+1);

	    animals.add(new Tiger());
		    animals.get(animals.size()-1).setName(getClass().getSimpleName());
		    animals.get(animals.size()-1).setHungryLevel((int) (Math.random()*50)+1);
			animals.get(animals.size()-1).setStrengthLevel((int)(Math.random()*50)+1);

		animals.add(new Deer());
		   animals.get(animals.size()-1).setName(getClass().getSimpleName());
		   animals.get(animals.size()-1).setHungryLevel((int) (Math.random()*50)+1);
		   animals.get(animals.size()-1).setStrengthLevel((int)(Math.random()*50)+1);

		animals.add(new Rabbit());
		  animals.get(animals.size()-1).setName(getClass().getSimpleName());
		  animals.get(animals.size()-1).setHungryLevel((int) (Math.random()*50)+1);
		  animals.get(animals.size()-1).setStrengthLevel((int)(Math.random()*50)+1);

		 for(int i=0;i<animals.size();i++)
		{
			System.out.print(animals.indexOf(animals.get(i))+1);
            System.out.println(animals.get(i).animalCharacteristics());
		    System.out.println("Hungry level: "+animals.get(i).getHungryLevel());
			System.out.println("Strength Level :"+animals.get(i).getStrengthLevel());
        }
		
		 for(int j=0;j<animals.size();j++)
		 {
			if(animals.get(j).getHungryLevel()<10)
			 {
				 System.out.println("ready to fight"+(animals.get(j).animalCharacteristics()));

			 }
			if(animals.get(j).getStrengthLevel()<10)
			{
				System.out.println("animals dies"+(animals.get(j).animalCharacteristics()));

			}
		 }
		 
		
		 
		
		 
	}
	
}