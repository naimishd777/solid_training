package com.meditab.training.lsp.exercise;

public class Pool extends Duck
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        Duck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
		Duck d=new Duck();
		d.quack();
		d.swim();
        Pool pool = new Pool();
        pool.run();
    }
}
