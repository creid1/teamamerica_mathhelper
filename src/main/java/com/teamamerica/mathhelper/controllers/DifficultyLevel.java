package com.teamamerica.mathhelper.controllers;

/**
 * Created by Christina on 4/11/2015.
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
