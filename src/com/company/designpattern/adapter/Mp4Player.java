package com.company.designpattern.adapter;

/**
 * @author ynx
 * @version V1.0
 * @date 2019-12-15
 * @modified_date 2019-12-15
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
