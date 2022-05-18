package com.pmsa.chartsapplication;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieActivity extends AppCompatActivity {
    PieChart pieChart;
    PieData pieData;
    PieDataSet pieDataSet;
    ArrayList pieEntries;
    ArrayList PieEntryLabels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieChart = findViewById(R.id.piechart);
        getEntries();
        pieDataSet = new PieDataSet(pieEntries, "LABELS");
        pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setSliceSpace(25);
        pieDataSet.setValueTextColor(Color.WHITE);
        pieDataSet.setValueTextSize(25);
        pieDataSet.setSliceSpace(5f);
    }
    private void getEntries() {
        pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(15, "Label 1",0)); // sample check with changing value and label
        pieEntries.add(new PieEntry(4f, 1));
        pieEntries.add(new PieEntry(6f, 2));
        pieEntries.add(new PieEntry(8f, 3));
        pieEntries.add(new PieEntry(7f, 4));
        pieEntries.add(new PieEntry(3f, 5));
    }
}
