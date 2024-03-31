package com.design.creational.abstract_factory;


import com.design.creational.abstract_factory.uifactory.UIFactory;

public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
