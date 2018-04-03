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
		String animal1;
		String animal2;
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
		
		System.out.println("Animals going to fight");
		int a1 = animalSelection();
		int a2 = animalSelection();
		System.out.println(animal1 = animals.get(a1).getNameOfAnimal());
		System.out.println(animal2 = animals.get(a2).getNameOfAnimal());
		
		fightAnimals(a1,a2);
	}
	
	public int animalSelection()
	{
		int selectAnimal;
		selectAnimal=(int) (Math.random()*4)+1;
		return selectAnimal;
	}
	public void fightAnimals(int animal1 ,int animal2)
	{
		if(animals.get(animal1).getHungryLevel()>animals.get(animal2).getHungryLevel())
		{
			
			System.out.println(animals.get(animal1).getNameOfAnimal()+"Wins");
		}
	
	    else
	    {
		  System.out.println(animals.get(animal2).getNameOfAnimal()+"Wins");
	    }
    } 
}