package com.teamamerica.mathhelper.environment;

import java.io.File;

/**
 * Created by Christina on 4/10/2015.
 */
public class ConfigDirectory {

    public static String imageDirectory = configureDirectory("resources.image.directory");
    public static String imageShapesDirectory = configureDirectory("image.shapes.directory");



    /**
     * This method configures the directory based on the system property variable param
     *
     * @param systemProperty
     * @return String
     */
    public static String configureDirectory(String systemProperty) {
        String testResources = "";
        String[] tempArr = System.getProperty(systemProperty).replace("\\", "/").split("/");
        for (String str : tempArr) {
            testResources = testResources + str + File.separator;
        }
        return testResources;
    }


    public static String getImageFileFromDirectory(String filename){
        return imageDirectory + filename;

    }

    public static String getCircleImageFileFromDirectory(String filename){
        return imageShapesDirectory + filename;
    }



}
