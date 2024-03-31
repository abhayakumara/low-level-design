package com.design.creational.abstract_factory.os.mac;


import com.design.creational.abstract_factory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
