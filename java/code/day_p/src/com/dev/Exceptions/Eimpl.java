package com.dev.Exceptions;

import java.util.HashSet;

public class Eimpl implements Dogint {

	HashSet<Dog> hs=new HashSet<Dog>();

	
	@Override
	public boolean addDog(Dog dog) {
		// TODO Auto-generated method stub
		if(dog!=null) {
			hs.add(dog);
		return true;
		}
		return false;
	}
	@Override
	public boolean removeDog(Dog dog) {
		// TODO Auto-generated method stub
		boolean b=hs.remove(dog);
		if(dog!=null) {
			hs.remove(dog);
		return true;
		}return false;
	}

	@Override
	public void getDog(Dog dog) {
		// TODO Auto-generated method stub
		System.out.println(hs);
		
	}

}
