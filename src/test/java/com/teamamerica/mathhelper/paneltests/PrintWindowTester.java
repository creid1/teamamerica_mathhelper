package com.teamamerica.mathhelper.paneltests;

import com.teamamerica.mathhelper.ui.panels.PrintWindow;

import javax.swing.*;

public class PrintWindowTester {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    PrintWindow pw = new PrintWindow("Random String");
    frame.add(pw);
    frame.pack();
    frame.setVisible(true);
  }
}