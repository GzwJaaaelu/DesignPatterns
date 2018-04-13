package com.jaaaelu.gzw.design.patterns.statePattern.demo;

public class SoldState implements State {
    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turing twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        //  处理糖果数量以及数量对应的状态
        machine.releaseBall();
        dealMachineState();
    }

    private void dealMachineState() {
        if (machine.getCount() == 0) {
            System.out.println("Oops, out of gumballs");
            machine.setState(machine.getSoldOutState());
        } else {
            machine.setState(machine.getNoQuarterState());
        }
    }
}
