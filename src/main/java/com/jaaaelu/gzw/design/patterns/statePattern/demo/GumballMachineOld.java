package com.jaaaelu.gzw.design.patterns.statePattern.demo;

/**
 * 烫过贩卖机
 */
public class GumballMachineOld {
    //  下面是糖果贩卖机的四种状态
    private static final int SOLD_OUT = 0;
    private static final int NO_QUARTER = 1;
    private static final int HAS_QUARTER = 2;
    private static final int SOLD = 3;

    //  用来记录当前的糖果贩卖机状态
    private int state = SOLD_OUT;
    //  用来记录贩卖机的糖果数量
    private int count = 0;

    public GumballMachineOld(int count) {
        this.count = count;
        if (count > 0) {
            //  进入没有 25 美分的状态，也就是等着别人投入 25  美分购买糖果
            state = NO_QUARTER;
        }
    }

    /**
     * 投入 25 美分时调用的方法
     */
    public void insertQuarter() {
        switch (state) {
            case HAS_QUARTER:
                // 当状态变成了糖果机内有 25 美分的时候就不能再继续放入 25 美分了
                System.out.println("You can't insert another quarter");
                break;
            case NO_QUARTER:
                // 状态转变为已经放入 25 美分
                state = HAS_QUARTER;
                System.out.println("You insert a quarter");
                break;
            case SOLD_OUT:
                System.out.println("You can't insert a quarter,the machine is sold out");
                break;
            case SOLD:
                System.out.println("Please wait, we're already giving you a gumball");
                break;
        }
    }

    /**
     * 退回 25 美分时调用的方法
     */
    public void ejectQuarter() {
        switch (state) {
            case HAS_QUARTER:
                //  状态转变为机器中没有 25 美分
                System.out.println("Quarter returned");
                state = NO_QUARTER;
                break;
            case NO_QUARTER:
                //  没有放钱进来当然就没法退
                System.out.println("You haven't insert a quarter");
                break;
            case SOLD_OUT:
                //  如果糖果售罄，就不可能收到 25 美分，当然也不可能退钱
                System.out.println("You can't eject, you haven't insert a quarter yet");
                break;
            case SOLD:
                System.out.println("Sorry, you already turned the crank");
                break;
        }
    }

    /**
     * 顾客试着转动曲柄时调用的方法（试着将钱换成糖）
     */
    public void turnCrank() {
        switch (state) {
            case HAS_QUARTER:
                //  改变糖果机状态并发放糖果
                System.out.println("You turned...");
                state = SOLD;
                dispense();
                break;
            case NO_QUARTER:
                System.out.println("You turned, but there's no quarter");
                break;
            case SOLD_OUT:
                System.out.println("You turned, but there are no gumballs");
                break;
            case SOLD:
                System.out.println("Turing twice doesn't get you another gumball");
                break;
        }
    }

    /**
     * 分发糖果时调用的方法
     */
    public void dispense() {
        switch (state) {
            case HAS_QUARTER:
            case SOLD_OUT:
                //  这两个状态时不应该分发糖果所以返回错误信息
                System.out.println("No gumball dispensed");
                break;
            case NO_QUARTER:
                //  提示客户应该先放钱
                System.out.println("You need to pay first");
            case SOLD:
                System.out.println("A gumball comes rolling out the slot");
                //  处理糖果数量以及数量对应的状态
                dealCountAndState();
                break;
        }
    }

    private void dealCountAndState() {
        count--;
        if (count == 0) {
            System.out.println("Oops, out of gumballs");
            state = SOLD_OUT;
        } else {
            state = NO_QUARTER;
        }
    }

    @Override
    public String toString() {
        return "GumballMachineOld{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
