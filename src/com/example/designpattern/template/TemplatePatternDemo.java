package com.example.designpattern.template;

/**
 * @author ynx
 * @version V1.0
 * @date 2019-12-29
 * @modified_date 2019-12-29
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
