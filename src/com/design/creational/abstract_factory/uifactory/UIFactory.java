package com.design.creational.abstract_factory.uifactory;


import com.design.creational.abstract_factory.Button;
import com.design.creational.abstract_factory.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
