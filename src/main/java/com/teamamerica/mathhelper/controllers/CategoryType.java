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
 * This is a data type called CategoryType and is an enumeration.
 * The CategoryType data types are used throughout the application to set data about the user's selections as well
 * as the category type columns that are stored in the database
 */
public enum CategoryType {


    ADDITION {
        @Override
        public String toString() {
            return "Addition";
        }
    },

    SUBTRACTION {
        @Override
        public String toString() {
            return "Subtraction";
        }
    },

    SETS {
        @Override
        public String toString() {
            return "Sets";
        }
    },
    MONEY {
        @Override
        public String toString() {
            return "Money";
        }
    },

    MEASURE {
        @Override
        public String toString() {
            return "Measure";
        }
    },

    SHAPES {
        @Override
        public String toString() {
            return "Shapes";
        }
    }
}
