package com.teamamerica.mathhelper.controllers;

/**
 * Created by Christina on 4/18/2015.
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
