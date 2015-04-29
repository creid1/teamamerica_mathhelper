/**
 * Name: Christina Reid, Jyoti Sharma
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.ui.customcomponents;

import com.teamamerica.mathhelper.environment.ConfigDirectory;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Christina on 4/16/2015.
 */

/**
 * This class has static methods that handle the audio in the application
 */
public class AudioListener {

    private static AudioInputStream stream;
    private static AudioFormat format;
    private static DataLine.Info info;
    private static Clip clip;

    /**
     * This method runs the audio listener based on the .wav file provided
     * @param file
     */
    public static void runAudioListener(String file) {

        String relativeFilePath = ConfigDirectory.getAudioFileFromDirectory(file);
        System.out.println("relative filepath: " + relativeFilePath);

        URL url = AudioListener.class.getClassLoader().getResource(relativeFilePath);
        // A try/catch block to play the .wav file
        try {
            stream = AudioSystem.getAudioInputStream(url);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(AudioListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(AudioListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method stops the audio listener from running the current audio
     */
    public static void stopAudioListener() {
        if (clip != null) {
            clip.stop();
        }
    }
}
