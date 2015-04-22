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
public class AudioListener {

    public static void runAudioListener(String file) {
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        Clip clip;

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
}
