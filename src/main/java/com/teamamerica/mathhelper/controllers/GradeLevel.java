package com.teamamerica.mathhelper.controllers;

/**
 * Created by Christina on 4/11/2015.
 */
public enum GradeLevel {


    PRE_K {
        @Override
        public String toString() {
            return "Pre_K";
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
            return "1";
        }
    },
    SECOND {
        @Override
        public String toString() {
            return "2";
        }
    },

    THIRD {
        @Override
        public String toString() {
            return "3";
        }
    },

    FOURTH {
        @Override
        public String toString() {
            return "4";
        }
    }
}
