package com.example.android.musicalstructureapp;

import java.util.ArrayList;

public class Playlist {

    public static ArrayList<MusicsElement> getPlaylist(){

        ArrayList<MusicsElement> playlist = new ArrayList<MusicsElement>();
        playlist.add(new MusicsElement("Ed Sheeran", "The A Team", "+"));
        playlist.add(new MusicsElement("Ed Sheeran", "Lego House", "+"));
        playlist.add(new MusicsElement("Ed Sheeran", "Sing","X"));
        playlist.add(new MusicsElement("Ed Sheeran", "One","X"));
        playlist.add(new MusicsElement("Ed Sheeran","Dive", "÷"));
        playlist.add(new MusicsElement("Ed Sheeran","Shape of you", "÷"));
        playlist.add(new MusicsElement("Beyoncé","Crazy in love", "Dangerously in Love"));
        playlist.add(new MusicsElement("Beyoncé","Hip Hop Star", "Dangerously in Love"));
        playlist.add(new MusicsElement("Beyoncé","Kitty Kat", "B'Day"));
        playlist.add(new MusicsElement("Beyoncé","Irreplaceable", "B'Day"));
        playlist.add(new MusicsElement("Beyoncé", "","I Am... Sasha Fierce"));
        playlist.add(new MusicsElement("Beyoncé", "Party","4"));
        playlist.add(new MusicsElement("Beyoncé", "Haunted","Beyoncé"));
        playlist.add(new MusicsElement("Beyoncé", "Hold Up","Lemonade"));
        playlist.add(new MusicsElement("Beyoncé", "Forward","Lemonade"));
//        playlist.add(new MusicsElement("Coldplay","", "Parachutes"));
//        playlist.add(new MusicsElement("Coldplay","", "A Rush of Blood to the Head"));
//        playlist.add(new MusicsElement("Coldplay","", "X&Y"));
//        playlist.add(new MusicsElement("Coldplay","", "Viva la Vida or Death and All His Friends"));
//        playlist.add(new MusicsElement("Coldplay","", "Mylo Xyloto"));
        playlist.add(new MusicsElement("Coldplay", "Ink","Ghost Stories"));
        playlist.add(new MusicsElement("Coldplay", "Magic","Ghost Stories"));
        playlist.add(new MusicsElement("Coldplay", "True Love","Ghost Stories"));
        playlist.add(new MusicsElement("Coldplay","Birds", "A Head Full of Dreams"));
        playlist.add(new MusicsElement("Coldplay","Fun", "A Head Full of Dreams"));

        return playlist;
    }
}
