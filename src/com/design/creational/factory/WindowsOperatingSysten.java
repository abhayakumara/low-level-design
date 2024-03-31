package com.design.creational.factory;

public class WindowsOperatingSysten extends OperatingSystem{
    public WindowsOperatingSysten(String version, String architecture) {
        super(version,architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Directory changed to " + dir + " in windows");
        //Windows command
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Directory removed " + dir + " in windows");
        //Windows command
    }
}
