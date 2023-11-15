package com.classProblems;

// Parent class
class ParentClass {
    protected int parentVariable;
    protected void parentMethod() {
        System.out.println("This is the parent method.");
    }
}

// Child class inheriting from the parent class
class ChildClass extends ParentClass {
    private int childVariable;
    public void childMethod() {
        System.out.println("This is the child method.");
    }
    public void useSuper() {
        super.parentVariable = 10;
        System.out.println("Parent Variable in Child Class using super: " + super.parentVariable);
        super.parentMethod();
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        ChildClass childObj = new ChildClass();
        childObj.useSuper();
        childObj.childMethod();
    }
}
