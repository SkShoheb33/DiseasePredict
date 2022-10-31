package com.example.diseasepredict;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DiseaseListActivity extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_list);

    }

    public void scanBrain(View view) {
        Intent intent = new Intent(DiseaseListActivity.this,ScanBrainActivity.class);
        startActivity(intent);
    }

    public void scanSkin(View view) {
        Intent intent = new Intent(DiseaseListActivity.this,ScanSkinActivity.class);
        startActivity(intent);
    }
    public void scanChest(View view) {
        Intent intent = new Intent(DiseaseListActivity.this,LungsActivity.class);
        startActivity(intent);
    }
}