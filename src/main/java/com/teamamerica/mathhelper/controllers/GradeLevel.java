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
 * This is a data type called GradeLevel and is an enumeration.
 * The GradeLevel data types are used throughout the application to set data about the user's selections as well
 * as the category type columns that are stored in the database
 */
public enum GradeLevel {


    PRE_K {
        @Override
        public String toString() {
            return "PRE_K";
        }
    },

    K {
        @Override
        public String toString() {
            return "K";
        }
    },

    FIRST {
        @Override
        public String toString() {
            return "FIRST";
        }
    },
    SECOND {
        @Override
        public String toString() {
            return "SECOND";
        }
    },

    THIRD {
        @Override
        public String toString() {
            return "THIRD";
        }
    },

    FOURTH {
        @Override
        public String toString() {
            return "FOURTH";
        }
    }
}
