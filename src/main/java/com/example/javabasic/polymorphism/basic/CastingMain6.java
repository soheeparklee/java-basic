package com.example.javabasic.polymorphism.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parentParent = new Parent();
        call(parentParent);

        Parent parentChild = new Child();
        call(parentChild);

    }

    private static void call(Parent parent){
        if(parent instanceof Child child){ //downcast here
            System.out.println("this is child instance");
            //Child child = (Child) parent; //can omit this line
            child.childMethod();
        }else if(parent instanceof Parent ){
            System.out.println("this is parent instance");
            parent.parentMethod();
        }
    }
}
