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
 * Implementation of Amumu.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Amumu implements Champion
{

	@Override
	public String getName()
	{
		return "Amumu";
	}

	@Override
	public Gender getGender()
	{
		return Gender.MALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return asList(Role.JUNGLE, Role.SUPPORT);
	}

	@Override
	public List<Species> getSpecies()
	{
		return asList(Species.UNDEAD, Species.YORDLE);
	}

	@Override
	public Resource getResource()
	{
		return Resource.MANA;
	}

	@Override
	public List<RangeType> getRangeTypes()
	{
		return singletonList(RangeType.MELEE);
	}

	@Override
	public List<Region> getRegions()
	{
		return singletonList(Region.SHURIMA);
	}

	@Override
	public int getReleaseYear()
	{
		return 2009;
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
