package com.loldle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.loldle.constants.LoldlePool;
import com.loldle.type.Gender;
import com.loldle.type.RangeType;
import com.loldle.type.Region;
import com.loldle.type.Resource;
import com.loldle.type.Role;
import com.loldle.type.Species;

public class LoldleSolver
{
    public static void main(String args[])
    {
        List<Champion> championGuessPool = new ArrayList<>();
        
        championGuessPool = LoldleUtil.getNonArchivedChampions();
        championGuessPool = LoldlePool.LOLDLE_POOL;
        
        List<Champion> filteredChampionGuessPoll = championGuessPool.stream()
        		.filter(c -> c.getGender().equals(Gender.MALE))
        		.filter(c -> !c.getRoles().contains(Role.JUNGLE))
        		.filter(c -> c.getRoles().contains(Role.TOP))
        		.filter(c -> !c.getSpecies().contains(Species.HUMAN))
        		.filter(c -> !c.getSpecies().contains(Species.UNKNOWN))
        		.filter(c -> c.getResource().equals(Resource.MANA))
        		.filter(c -> c.getRangeTypes().contains(RangeType.MELEE))
        		.filter(c -> !c.getRegions().contains(Region.DEMACIA)
        				||!c.getRegions().contains(Region.IONIA)
        				||!c.getRegions().contains(Region.NOXUS))
        		.filter(c -> c.getRegions().contains(Region.ICATHIA)
        				|| c.getRegions().contains(Region.RUNETERRA)
        				|| c.getRegions().contains(Region.SHURIMA))
        		.filter(c -> c.getReleaseYear() == 2009)
        		
//        		.filter(c -> c.getReleaseYear() < 2010)
//        		.filter(c -> c.getRegions().size() == 3)
//        		.filter(c -> c.getRoles().size() == 2)
//        		.filter(c -> ?c.getSpecies().contains(Species.HUMAN))
        		.toList();

//        LoldleUtil.printChampions(championGuessPool);
        LoldleUtil.printChampions(filteredChampionGuessPoll);
    }
}
