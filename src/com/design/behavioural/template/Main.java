package com.design.behavioural.template;


/*
 *  References: https://refactoring.guru/design-patterns/template-method
 *              https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */



public class Main {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
