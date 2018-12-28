package com.meditab.training.isp.exercise;

import java.util.Random;

public class Sensor extends Sensor
{
    public void register(Door door)
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
