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
 * Implementation of Lucian.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Lucian implements Champion
{

	@Override
	public String getName()
	{
		return "Lucian";
	}

	@Override
	public Gender getGender()
	{
		return Gender.MALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return singletonList(Role.BOTTOM);
	}

	@Override
	public List<Species> getSpecies()
	{
		return singletonList(Species.HUMAN);
	}

	@Override
	public Resource getResource()
	{
		return Resource.MANA;
	}

	@Override
	public List<RangeType> getRangeTypes()
	{
		return singletonList(RangeType.RANGED);
	}

	@Override
	public List<Region> getRegions()
	{
		return asList(Region.BLESSED_ISLES, Region.DEMACIA);
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
