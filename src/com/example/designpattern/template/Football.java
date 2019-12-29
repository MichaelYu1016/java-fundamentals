package com.example.designpattern.template;

/**
 * 足球实现类
 *
 * @author ynx
 * @version V1.0
 * @date 2019-12-29
 * @modified_date 2019-12-29
 */
public class Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
