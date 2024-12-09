package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void Main(String[] args){

        //Task One: Create a superclass Parent with a method greet().
        Parent heyParent = new Parent();
        heyParent.greet();


        //Task Two: Create a subclass Child that overrides greet().
        Child heyChild = new Child();
        heyChild.greet();


        //Task three: Perform Upcasting and Downcasting, demonstrating both concepts.
        Parent theParent = new Child();
        theParent.genChild();

        //Task Four: Extend the Polymorphism example and check object types.
        if (theParent instanceof Child) {  //using instanceof to test theParent
            Child theChild = (Child) theParent;
            theChild.genChild();
            theChild.greet();
        }
        //
        }

    }