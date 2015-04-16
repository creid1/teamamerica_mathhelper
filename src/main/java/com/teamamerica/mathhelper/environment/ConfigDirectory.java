package com.teamamerica.mathhelper.environment;

/**
 * Created by Christina on 4/10/2015.
 */
public class ConfigDirectory {

   public static String imageDirectory = "images/";

    public static String getImageFileFromDirectory(String filename){
        return imageDirectory + configureImageDBFile(filename);

    }

    private static String configureImageDBFile(String filename){
        String[] split = filename.split("_");
        return split[0] +"/"+ split[1];
    }


}
