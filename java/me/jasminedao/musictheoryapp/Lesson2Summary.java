package me.jasminedao.musictheoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Lesson2Summary extends AppCompatActivity {

    Button btn;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2_summary);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Lesson2Summary.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Lesson2Summary.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Lesson2Summary.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Lesson2Summary.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        btn = (Button)findViewById(R.id.next2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lesson2Summary.this, LessonQuiz.class).putExtra("quiz", 2));
            }
        });
    }
}
