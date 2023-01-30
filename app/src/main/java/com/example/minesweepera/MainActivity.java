package com.example.minesweepera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;

import com.example.minesweepera.databinding.ActivityMainBinding;
import com.example.minesweepera.databinding.ContainerRowBinding;
import com.example.minesweepera.databinding.ItemCellBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    Cell[][] field = new Cell[9][9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        for (int i = 0; i < 9; i++) {
            ContainerRowBinding rowBinding = ContainerRowBinding.inflate(getLayoutInflater(), binding.gridPlace, false);
            binding.gridPlace.addView(rowBinding.getRoot());
            for (int j = 0; j < 9; j++) {
                ItemCellBinding cellBinding = ItemCellBinding.inflate(getLayoutInflater(), rowBinding.getRoot(), false);
                rowBinding.getRoot().addView(cellBinding.getRoot());
            }
        }
    }
}