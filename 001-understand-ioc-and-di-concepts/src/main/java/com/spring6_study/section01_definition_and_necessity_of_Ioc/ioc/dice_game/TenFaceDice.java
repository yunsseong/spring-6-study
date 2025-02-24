package com.spring6_study.section01_definition_and_necessity_of_Ioc.ioc.dice_game;

import java.util.Random;

public class TenFaceDice implements Dice{
    private final Random random = new Random();
    @Override
    public int roll() {
        return random.nextInt(10) + 1;
    }
}
