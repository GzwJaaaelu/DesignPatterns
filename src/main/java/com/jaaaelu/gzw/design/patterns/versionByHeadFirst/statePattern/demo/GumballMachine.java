package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.statePattern.demo;

/**
 * 烫过贩卖机
 */
public class GumballMachine {
    //  下面是糖果贩卖机的五种状态
    private State hasQuarterState;
    private State noQuarterState;
    private State soldOutState;
    private State winnerState;
    private State soldState;

    //  用来记录当前的糖果贩卖机状态
    private State state = soldOutState;
    //  用来记录贩卖机的糖果数量
    private int count = 0;

    public GumballMachine(int count) {
        initState();
        this.count = count;
        if (count > 0) {
            //  进入没有 25 美分的状态，也就是等着别人投入 25  美分购买糖果
            state = noQuarterState;
        }
    }

    private void initState() {
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
    }

    /**
     * 投入 25 美分时调用的方法
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /**
     * 退回 25 美分时调用的方法
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 顾客试着转动曲柄时调用的方法（试着将钱换成糖）
     */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0) {
            count--;
        }
    }

    //  get/set 方法

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
