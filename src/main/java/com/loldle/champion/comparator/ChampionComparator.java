package com.loldle.champion.comparator;

import java.util.Comparator;

import com.loldle.Champion;

public class ChampionComparator implements Comparator<Champion>
{

    @Override
    public int compare(Champion champion1, Champion champion2)
    {
        return champion1.getName().compareTo(champion2.getName());
    }
}
