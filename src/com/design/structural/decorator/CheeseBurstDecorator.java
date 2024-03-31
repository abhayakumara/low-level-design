package com.design.structural.decorator;

public class CheeseBurstDecorator extends PizzaDecorator{
    public CheeseBurstDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + " " + addCheese();
    }

    public String addCheese(){
        return "Cheese";
    }

}
