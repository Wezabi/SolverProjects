package com.loldle.champion;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

import java.util.List;

import com.loldle.Champion;
import com.loldle.type.Gender;
import com.loldle.type.RangeType;
import com.loldle.type.Region;
import com.loldle.type.Resource;
import com.loldle.type.Role;
import com.loldle.type.Species;

/**
 * <p>
 * Implementation of Yasuo.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Yasuo implements Champion
{

	@Override
	public String getName()
	{
		return "Yasuo";
	}

	@Override
	public Gender getGender()
	{
		return Gender.MALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return singletonList(Role.MIDDLE);
	}

	@Override
	public List<Species> getSpecies()
	{
		return asList(Species.HUMAN, Species.MAGICBORN);
	}

	@Override
	public Resource getResource()
	{
		return Resource.FLOW;
	}

	@Override
	public List<RangeType> getRangeTypes()
	{
		return singletonList(RangeType.MELEE);
	}

	@Override
	public List<Region> getRegions()
	{
		return singletonList(Region.IONIA);
	}

	@Override
	public int getReleaseYear()
	{
		return 2013;
	}
	
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Champion champion)
        {
            return getName().equals(champion.getName());
        }
        
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return getName().hashCode();
    }
}
