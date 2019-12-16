package com.example.designpattern.adapter;

/**
 * @author ynx
 * @version V1.0
 * @date 2019-12-15
 * @modified_date 2019-12-15
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(VLC.equalsIgnoreCase(audioType) ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (MP4.equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(VLC.equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playVlc(fileName);
        }else if(MP4.equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
