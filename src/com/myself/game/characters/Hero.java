package com.myself.game.characters;

import com.myself.game.skills.MagicalSkills;
import com.myself.game.skills.PassiveSkills;

public class Hero {

	private String name;
	private PassiveSkills[] passiveSkills;
	private MagicalSkills[] magicalSkills;
	private Hero[] allys;
	
	public void sayMyName ()
	{
		System.out.println("My name is : "+name);
		System.out.println("End");
	}
}
