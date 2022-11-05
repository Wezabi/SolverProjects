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
 * Implementation of Riven.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Riven implements Champion
{

	@Override
	public String getName()
	{
		return "Riven";
	}

	@Override
	public Gender getGender()
	{
		return Gender.FEMALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return singletonList(Role.TOP);
	}

	@Override
	public List<Species> getSpecies()
	{
		return singletonList(Species.HUMAN);
	}

	@Override
	public Resource getResource()
	{
		return Resource.MANALESS;
	}

	@Override
	public List<RangeType> getRangeTypes()
	{
		return singletonList(RangeType.MELEE);
	}

	@Override
	public List<Region> getRegions()
	{
		return asList(Region.IONIA, Region.NOXUS);
	}

	@Override
	public int getReleaseYear()
	{
		return 2011;
	}
}
