package com.example.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView questionText = findViewById(R.id.flashcard_question_textview);
        questionText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Log.i("Derv", "on Click method");

                Toast.makeText(MainActivity.this, "I CLICKED THE QUESTION", Toast.LENGTH_LONG).show();
            }
        });
        
    }
}