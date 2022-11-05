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
 * Implementation of Nidalee.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Nidalee implements Champion
{

	@Override
	public String getName()
	{
		return "Nidalee";
	}

	@Override
	public Gender getGender()
	{
		return Gender.FEMALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return singletonList(Role.JUNGLE);
	}

	@Override
	public List<Species> getSpecies()
	{
		return asList(Species.HUMAN, Species.SPIRITUALIST, Species.VASTAYAN);
	}

	@Override
	public Resource getResource()
	{
		return Resource.MANA;
	}

	@Override
	public List<RangeType> getRangeTypes()
	{
		return asList(RangeType.MELEE, RangeType.RANGED);
	}

	@Override
	public List<Region> getRegions()
	{
		return singletonList(Region.IXTAL);
	}

	@Override
	public int getReleaseYear()
	{
		return 2009;
	}
}
