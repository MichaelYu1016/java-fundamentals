package com.company.designpattern.adapter;

/**
 * @author ynx
 * @version V1.0
 * @date 2019-12-15
 * @modified_date 2019-12-15
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if(MP3.equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(VLC.equalsIgnoreCase(audioType)
                || MP4.equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
