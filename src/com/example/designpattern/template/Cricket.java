package com.example.designpattern.template;

/**
 * 板球实现类
 *
 * @author ynx
 * @version V1.0
 * @date 2019-12-29
 * @modified_date 2019-12-29
 */
public class Cricket extends Game {
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
