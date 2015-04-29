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
 * This is a data type called DifficultyLevel and is an enumeration.
 * The DifficultyLevel data types are used throughout the application to set data about the user's selections as well
 * as the category type columns that are stored in the database
 */
public enum DifficultyLevel {

    EASY {
        @Override
        public String toString() {
            return "Easy";
        }
    },

    MEDIUM {
        @Override
        public String toString() {
            return "Medium";
        }
    },

    HARD {
        @Override
        public String toString() {
            return "Hard";
        }
    }
}
