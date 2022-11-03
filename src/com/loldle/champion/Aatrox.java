package com.loldle.champion;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.loldle.Champion;
import com.loldle.RangeType;
import com.loldle.Region;
import com.loldle.Resource;
import com.loldle.Role;
import com.loldle.Sex;
import com.loldle.Species;

/**
 * <p>
 * Implementation of Aatrox.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Aatrox implements Champion
{

	@Override
	public String getName()
	{
		return "Aatrox";
	}

	@Override
	public Sex getGender()
	{
		return Sex.MALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return singletonList(Role.TOP);
	}

	@Override
	public List<Species> getSpecies()
	{
		return singletonList(Species.DARKIN);
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
		return asList(Region.RUNETERRA, Region.SHURIMA);
	}

	@Override
	public int getReleaseYear()
	{
		return 2013;
	}
}
