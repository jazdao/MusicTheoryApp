package me.jasminedao.musictheoryapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class QuizResult extends AppCompatActivity {

    private Button btn1;
    private Button btn2;

    private TextView score;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(QuizResult.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(QuizResult.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(QuizResult.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(QuizResult.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        btn1 = findViewById(R.id.try1);
        btn2 = findViewById(R.id.next);

        score = findViewById(R.id.score1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizResult.this, Lessons.class));
            }
        });

        Intent intent = getIntent();
        int val = intent.getExtras().getInt("Score");
        score.setText(String.valueOf(val));
    }
}