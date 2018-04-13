package com.jaaaelu.gzw.design.patterns.statePattern.demo;

import java.util.Random;

public class HasQuarterState implements State {
    private GumballMachine machine;
    private Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        //  状态转变为机器中没有 25 美分
        System.out.println("Quarter returned");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        judgeState();
    }

    private void judgeState() {
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (machine.getCount() > 1)) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
