package me.jasminedao.musictheoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Lessons extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Lessons.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Lessons.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Lessons.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Lessons.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        Button btn = (Button)findViewById(R.id.lessonOne);
        Button btn2= (Button)findViewById(R.id.lessonTwo);
        Button btn3 = (Button)findViewById(R.id.lessonThree);
        Button btn4 = (Button)findViewById(R.id.lessonFour);
        Button btn5 = (Button)findViewById(R.id.lessonFive);
        Button btn6 = (Button)findViewById(R.id.lessonSix);
        Button btn7 = (Button)findViewById(R.id.lessonSeven);
        Button btn8 = (Button)findViewById(R.id.lessonEight);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lessons.this, Lesson1.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lessons.this, Lesson2.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lessons.this, Lesson3.class));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lessons.this, Lesson4.class));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lessons.this, Lesson5.class));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lessons.this, Lesson6.class));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lessons.this, Lesson7.class));
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lessons.this, Lesson8.class));
            }
        });
    }
}
