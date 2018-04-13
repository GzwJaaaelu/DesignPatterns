package com.jaaaelu.gzw.design.patterns.statePattern.demo;

public class WinnerState implements State {
    private GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'ER A WINNER! You get two gumball for your quarter");
        machine.releaseBall();
        dealWinner();
    }

    private void dealWinner() {
        if (machine.getCount() == 0) {
            machine.setState(machine.getSoldOutState());
        } else {
            machine.releaseBall();
            if (machine.getCount() > 0) {
                machine.setState(machine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumball");
                machine.setState(machine.getSoldOutState());
            }
        }
    }
}
