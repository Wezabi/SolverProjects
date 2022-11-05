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
 * Implementation of Ashe.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Ashe implements Champion
{

	@Override
	public String getName()
	{
		return "Ashe";
	}

	@Override
	public Gender getGender()
	{
		return Gender.MALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return asList(Role.BOTTOM, Role.SUPPORT);
	}

	@Override
	public List<Species> getSpecies()
	{
		return asList(Species.HUMAN, Species.ICEBORN);
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
		return singletonList(Region.FRELJORD);
	}

	@Override
	public int getReleaseYear()
	{
		return 2009;
	}
}
