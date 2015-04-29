/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.controllers;

/**
 * Created by Christina on 4/11/2015.
 */

/**
 * This is a data type called MainMenuSelection and is an enumeration.
 * The CategoryType data types are used throughout the application to set data about the user's selections.
 */
public enum MainMenuSelection {

    TUTORIALS {
        @Override
        public String toString() {
            return "Tutorials";
        }
    },

    TESTS {
        @Override
        public String toString() {
            return "Tests";
        }
    },

    PRACTICE {
        @Override
        public String toString() {
            return "Practice";
        }
    }

}
