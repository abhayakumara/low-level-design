package com.design.creational.abstract_factory.os.win;


import com.design.creational.abstract_factory.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
