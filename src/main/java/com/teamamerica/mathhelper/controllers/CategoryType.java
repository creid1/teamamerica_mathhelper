package com.teamamerica.mathhelper.controllers;

/**
 * Created by Christina on 4/11/2015.
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

    TIME {
        @Override
        public String toString() {
            return "Time";
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
