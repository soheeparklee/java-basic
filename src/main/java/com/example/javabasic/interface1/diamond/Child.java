package com.example.javabasic.interface1.diamond;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {} //override from InterfaceA
    @Override
    public void methodB() {} //override from InterfaceB
    @Override
    public void methodCommon() {}  //override from both
}
