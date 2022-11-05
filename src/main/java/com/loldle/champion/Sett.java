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
 * Implementation of Sett.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Sett implements Champion
{

	@Override
	public String getName()
	{
		return "Sett";
	}

	@Override
	public Gender getGender()
	{
		return Gender.MALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return singletonList(Role.TOP);
	}

	@Override
	public List<Species> getSpecies()
	{
		return asList(Species.HUMAN, Species.VASTAYAN);
	}

	@Override
	public Resource getResource()
	{
		return Resource.GRIT;
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
		return 2020;
	}
}
