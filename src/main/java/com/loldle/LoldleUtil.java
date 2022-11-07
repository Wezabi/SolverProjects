package com.loldle;

import static com.loldle.constants.LoldleArchive.LOLDLE_ARCHIVE;
import static com.loldle.constants.LoldlePool.LOLDLE_POOL;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.loldle.champion.comparator.ChampionComparator;

public final class LoldleUtil
{
    private LoldleUtil()
    {
    }

    public static List<Champion> getNonArchivedChampions()
    {
        return LOLDLE_POOL.stream()
                .filter(c -> !LOLDLE_ARCHIVE.entrySet().stream().map(Map.Entry::getValue).distinct().toList().contains(c)).toList();
    }
    
    public static List<Champion> getArchivedChampions()
    {
        return LOLDLE_ARCHIVE.entrySet().stream().map(Map.Entry::getValue).distinct().sorted(new ChampionComparator()).toList();
    }
    
    public static List<Champion> getDuplicateArchiveChampions()
    {
        List<Champion> allArchiveChampions = LOLDLE_ARCHIVE.entrySet().stream().map(Map.Entry::getValue).toList();
        return allArchiveChampions.stream()
                .filter(c -> Collections.frequency(allArchiveChampions, c) > 1).distinct().toList();
    }
    
    public static void printChampions(List<Champion> champions)
    {
        System.out.println("[\tChampions\t]");
        System.out.println("[-----------------------]");
        System.out.println("[Champion count: " + String.format("%-6s", champions.size()) + " ]");
        System.out.println("[-----------------------]");
        champions.stream().forEach(c -> 
        System.out.println("[" + String.format("%-23s", c.getName()) + "]"));
    }
}
