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
 * Implementation of Senna.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Senna implements Champion
{

	@Override
	public String getName()
	{
		return "Senna";
	}

	@Override
	public Gender getGender()
	{
		return Gender.FEMALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return singletonList(Role.SUPPORT);
	}

	@Override
	public List<Species> getSpecies()
	{
		return asList(Species.HUMAN, Species.UNDEAD);
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
		return singletonList(Region.BLESSED_ISLES);
	}

	@Override
	public int getReleaseYear()
	{
		return 2019;
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
