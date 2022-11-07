package com.loldle;

import java.util.ArrayList;
import java.util.List;

public class LoldleSolver
{
    public static void main(String args[])
    {
        List<Champion> championGuessPool = new ArrayList<>();
        
        championGuessPool = LoldleUtil.getNonArchivedChampions();

        LoldleUtil.printChampions(championGuessPool);
    }
}
