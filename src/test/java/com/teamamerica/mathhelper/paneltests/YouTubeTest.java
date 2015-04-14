package com.teamamerica.mathhelper.paneltests;


import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;

/**
 * Created by Christina on 4/13/2015.
 */
public class YouTubeTest  {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new YouTubeFrame("https://www.youtube.com/v/AQ7THUKx6Es?fs=1").setVisible(true);

            }
        });
    }
}