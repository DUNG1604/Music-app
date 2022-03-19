/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import jaco.mp3.player.MP3Player;
import java.io.File;

/**
 *
 * @author DELL
 */
public class Player {
    private MP3Player player;
    private File songFile;
    private String currentDirectory;
    private boolean repeat;
    public Player() {
        currentDirectory="";
        songFile = new File("");
        String fileName = songFile.getName();
        player = new MP3Player(songFile) ;
        repeat = false;
    }

    public MP3Player getPlayer() {
        return player;
    }

    public void setPlayer(MP3Player player) {
        this.player = player;
    }

    public File getSongFile() {
        return songFile;
    }

    public void setSongFile(File songFile) {
        this.songFile = songFile;
    }

    public String getCurrentDirectory() {
        return currentDirectory;
    }

    public void setCurrentDirectory(String currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }
    
}
