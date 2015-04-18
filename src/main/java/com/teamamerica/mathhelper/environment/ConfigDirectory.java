package com.teamamerica.mathhelper.environment;

import java.net.URL;

/**
 * Created by Christina on 4/10/2015.
 */
public class ConfigDirectory {

   public static String imageDirectory = "images/";

    public static String audioDirectory = "audio/";


    public static String getImageFileFromDirectory(String filename){
        return imageDirectory + configureImageDBFile(filename);

    }

    private static String configureImageDBFile(String filename){
        String[] split = filename.split("_");
        return split[0] +"/"+ split[1];
    }


    public static String getAudioFileFromDirectory(String file) {
        System.out.println(audioDirectory + file);
        return audioDirectory + file;
    }

    public static String getFileStringForFullPath(String relativeFilePath){
        URL url = ConfigDirectory.class.getClassLoader().getResource(relativeFilePath);
        String fullpath = url.getFile().substring(1);
        System.out.println("FULLPATH:" + fullpath);

        return fullpath;

    }
}
