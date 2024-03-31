package com.design.creational.abstract_factory.uifactory;

import com.design.creational.abstract_factory.Button;
import com.design.creational.abstract_factory.CheckBox;
import com.design.creational.abstract_factory.os.mac.MacButton;
import com.design.creational.abstract_factory.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
