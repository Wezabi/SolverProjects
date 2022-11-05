package com.loldle;

import java.util.List;

import com.loldle.type.RangeType;
import com.loldle.type.Region;
import com.loldle.type.Resource;
import com.loldle.type.Role;
import com.loldle.type.Gender;
import com.loldle.type.Species;

public interface Champion
{
	public String getName();
	
	public Gender getGender();
	
	public List<Role> getRoles();
	
	public List<Species> getSpecies();
	
	public Resource getResource();
	
	public List<RangeType> getRangeTypes();
	
	public List<Region> getRegions();
	
	public int getReleaseYear();
}
