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
		 animals.add(new Lion());
		 animals.add(new Tiger());
		 animals.add(new Deer());
		 animals.add(new Rabbit());
		 for(int i=0;i<animals.size();i++)
		 {
			System.out.print(animals.indexOf(animals.get(i))+1);
            System.out.println(animals.get(i).animalCharacteristics());			
		 }
		 //System.out.println(animals.get(animals.size()-1).animalCharacterists());
		 
		 
		 



		 


		 
	 }
	
	
	
		
	
	
  
}