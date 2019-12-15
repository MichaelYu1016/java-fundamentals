package com.company.designpattern.adapter;

/**
 * @author ynx
 * @version V1.0
 * @date 2019-12-15
 * @modified_date 2019-12-15
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);

    String VLC = "vlc";
    String MP4 = "mp4";
    String MP3 = "mp3";
}
