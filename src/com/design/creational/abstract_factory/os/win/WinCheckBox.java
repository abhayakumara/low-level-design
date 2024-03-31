package com.design.creational.abstract_factory.os.win;


import com.design.creational.abstract_factory.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
