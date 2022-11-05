package com.loldle.champion;

import static java.util.Collections.singletonList;

import java.util.List;

import com.loldle.Champion;
import com.loldle.type.RangeType;
import com.loldle.type.Region;
import com.loldle.type.Resource;
import com.loldle.type.Role;
import com.loldle.type.Gender;
import com.loldle.type.Species;

/**
 * <p>
 * Implementation of Zyra.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Zyra implements Champion
{

	@Override
	public String getName()
	{
		return "Zyra";
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
		return singletonList(Species.UNKNOWN);
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
		return singletonList(Region.IXTAL);
	}

	@Override
	public int getReleaseYear()
	{
		return 2012;
	}
}
