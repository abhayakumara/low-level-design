package com.design.creational.factory;

public class LinuxOperatingSystem extends OperatingSystem{

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Directory changed to " + dir + " in linux");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Directory removed " + dir + " in  linux");
    }
}
