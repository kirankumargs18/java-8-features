package com.globallogic.stream.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Programmers {

	private String name;
	private ArrayList<String> skills;

	public Programmers() {
		super();
	}

	public Programmers(String name, ArrayList<String> skills) {
		super();
		this.name = name;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Programmers [name=" + name + ", skills=" + skills + "]";
	}

}
