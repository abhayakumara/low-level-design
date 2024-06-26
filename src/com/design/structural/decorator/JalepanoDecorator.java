package com.design.structural.decorator;

public class JalepanoDecorator extends PizzaDecorator {
    public JalepanoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + " " + addJalepano();
    }

    public String addJalepano(){
        return "jalepeno";
    }
}
