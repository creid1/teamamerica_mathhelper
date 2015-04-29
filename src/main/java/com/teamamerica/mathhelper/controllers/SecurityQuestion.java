/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.controllers;

/**
 * Created by Christina on 4/18/2015.
 */
/**
 * This is a data type called SecurityQuestion and is an enumeration.
 * The SecurityQuestion data types are used throughout the application to set data about the user's selections as well
 * as the category type columns that are stored in the database
 */

public enum SecurityQuestion {

    COLOR {
        @Override
        public String toString() {
            return "What is your favorite color?";
        }
    },

    PET {
        @Override
        public String toString() {
            return "What is the name of your pet?";
        }
    },

    MOVIE {
        @Override
        public String toString() {
            return "What is your favorite movie?";
        }
    },
    PLACE {
        @Override
        public String toString() {
            return "Where is your favorite place to go?";
        }
    },

    SCHOOL {
        @Override
        public String toString() {
            return "What is the name of your school?";
        }
    },
}
