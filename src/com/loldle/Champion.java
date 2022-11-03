package com.loldle;

import java.util.List;

public interface Champion
{
	public String getName();
	
	public Sex getGender();
	
	public List<Role> getRoles();
	
	public List<Species> getSpecies();
	
	public Resource getResource();
	
	public List<RangeType> getRangeTypes();
	
	public List<Region> getRegions();
	
	public int getReleaseYear();
}
