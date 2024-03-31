package com.design.creational.abstract_factory.uifactory;


import com.design.creational.abstract_factory.Button;
import com.design.creational.abstract_factory.CheckBox;
import com.design.creational.abstract_factory.os.win.WinButton;
import com.design.creational.abstract_factory.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
