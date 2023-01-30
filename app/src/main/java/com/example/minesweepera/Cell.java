package com.example.minesweepera;

public class Cell {
    private int nearMines;
    private boolean isOpened;

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
