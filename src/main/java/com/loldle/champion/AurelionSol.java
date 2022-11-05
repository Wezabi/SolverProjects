package com.loldle.champion;

import static java.util.Arrays.asList;
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
 * Implementation of Aurelion Sol.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class AurelionSol implements Champion
{

	@Override
	public String getName()
	{
		return "Aurelion Sol";
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
		return asList(Species.CELESITAL, Species.DRAGON);
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
		return asList(Region.RUNETERRA, Region.TARGON);
	}

	@Override
	public int getReleaseYear()
	{
		return 2016;
	}
}
