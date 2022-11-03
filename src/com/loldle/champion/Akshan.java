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
 * Implementation of Akshan.
 * </p>
 * <p>
 * Copyright &copy; 2022 
 * </p>
 *
 * @Author Wes Huhman
 */
public class Akshan implements Champion
{

	@Override
	public String getName()
	{
		return "Akshan";
	}

	@Override
	public Sex getGender()
	{
		return Sex.MALE;
	}

	@Override
	public List<Role> getRoles()
	{
		return asList(Role.MIDDLE, Role.TOP);
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
		return singletonList(Region.SHURIMA);
	}

	@Override
	public int getReleaseYear()
	{
		return 2021;
	}
}
