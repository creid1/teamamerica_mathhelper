/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.environment;

import java.net.URL;

/**
 * Created by Christina on 4/10/2015.
 */

/**
 * This class contains static methods that are used to configure the filepaths for the images and audio files
 * that are used in the application
 */
public class ConfigDirectory {

   public static String imageDirectory = "images/";

    public static String audioDirectory = "audio/";


    /**
     * This method returns the relative filepath for the filename provided
     * @param filename
     * @return String
     */
    public static String getImageFileFromDirectory(String filename){
        return imageDirectory + configureImageDBFile(filename);

    }

    /**
     * This method returns the formatted relative path filepath
     * @param filename
     * @return String
     */
    private static String configureImageDBFile(String filename){
        System.out.println("Configure image db file name: " + filename);
        String[] split = filename.split("_");
        return split[0] +"/"+ split[1];
    }


    /**
     * This method returns the relative path of the audio file provided
     * @param file
     * @return
     */
    public static String getAudioFileFromDirectory(String file) {
        System.out.println(audioDirectory + file);
        return audioDirectory + file;
    }

    /**
     * This method returns the full path of the file based on the relative path provided
     * @param relativeFilePath
     * @return String
     */
    public static String getFileStringForFullPath(String relativeFilePath){
        URL url = ConfigDirectory.class.getClassLoader().getResource(relativeFilePath);
        String fullpath = url.getFile().substring(1);
        System.out.println("FULLPATH:" + fullpath);

        return fullpath;

    }
}
