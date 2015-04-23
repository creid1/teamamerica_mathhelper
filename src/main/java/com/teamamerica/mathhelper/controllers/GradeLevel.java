package com.teamamerica.mathhelper.controllers;

/**
 * Created by Christina on 4/11/2015.
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
