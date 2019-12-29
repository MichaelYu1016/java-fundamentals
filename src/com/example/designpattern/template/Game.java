package com.example.designpattern.template;

/**
 * 模板模式
 *
 * @author ynx
 * @version V1.0
 * @date 2019-12-29
 * @modified_date 2019-12-29
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
