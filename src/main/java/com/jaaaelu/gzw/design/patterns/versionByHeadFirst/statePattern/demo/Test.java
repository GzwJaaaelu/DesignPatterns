package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.statePattern.demo;

public class Test {

    public static void main(String[] args){
//       testOldVersion();

       testNewVersion();
    }

    private static void testNewVersion() {
        GumballMachine machine = new GumballMachine(5);

        System.out.println(machine);

        System.out.println("\n------------------------------------------------\n");

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n------------------------------------------------\n");

        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n------------------------------------------------\n");

        System.out.println(machine);
    }

    private static void testOldVersion() {
        GumballMachineOld machine = new GumballMachineOld(5);

        System.out.println(machine);

        System.out.println("\n------------------------------------------------\n");

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n------------------------------------------------\n");

        System.out.println(machine);

        System.out.println("\n------------------------------------------------\n");

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        System.out.println("\n------------------------------------------------\n");

        System.out.println(machine);

        System.out.println("\n------------------------------------------------\n");

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();

        System.out.println("\n------------------------------------------------\n");

        System.out.println(machine);

        System.out.println("\n------------------------------------------------\n");

        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n------------------------------------------------\n");

        System.out.println(machine);
    }
}
