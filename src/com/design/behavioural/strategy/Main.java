package com.design.behavioural.strategy;


/*
 *  References: https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 *              https://refactoring.guru/design-patterns/strategy
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        Strategy addStrategy = new OperationAdd();
        System.out.println("10 + 5 = " + addStrategy.doOperation(100, 5));

    }

}
