package com.teamamerica.mathhelper.controllers;

/**
 * Created by Christina on 4/11/2015.
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
