package me.jasminedao.musictheoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Practice2 extends AppCompatActivity {

    private ImageView image;
    private TextView percent;

    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;

    private String answer;

    Random random;

    private int question;
    private double questionNum = 0.0;
    private double correct = 0.0;
    private double score = 0.0;
    String str;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Practice2.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Practice2.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Practice2.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Practice2.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        image = (ImageView)findViewById(R.id.question);
        percent = (TextView)findViewById(R.id.score);
        choice1 = (Button)findViewById(R.id.answer1);
        choice2 = (Button)findViewById(R.id.answer2);
        choice3 = (Button)findViewById(R.id.answer3);
        choice4 = (Button)findViewById(R.id.answer4);

        random = new Random();
        updateQuestion();

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice1.getText().equals(answer)) {
                    Toast.makeText(Practice2.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice2.this, "Sorry, the correct answer is " + answer + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice2.getText().equals(answer)) {
                    Toast.makeText(Practice2.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice2.this, "Sorry, the correct answer is " + answer + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice3.getText().equals(answer)) {
                    Toast.makeText(Practice2.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice2.this, "Sorry, the correct answer is " + answer + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice4.getText().equals(answer)) {
                    Toast.makeText(Practice2.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice2.this, "Sorry, the correct answer is " + answer + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });
    }

    public void updateQuestion() {
        questionNum++;
        question = random.nextInt((9)+1);

        switch (question) {
            case 1:
                image.setImageResource(R.drawable.p1);
                answer = "2";
                break;
            case 2:
                image.setImageResource(R.drawable.p2);
                answer = "4";
                break;
            case 3:
                image.setImageResource(R.drawable.p3);
                answer = "8";
                break;
            case 4:
                image.setImageResource(R.drawable.p4);
                answer = "16";
                break;
            case 5:
                image.setImageResource(R.drawable.p5);
                answer = "2";
                break;
            case 6:
                image.setImageResource(R.drawable.p6);
                answer = "4";
                break;
            case 7:
                image.setImageResource(R.drawable.p7);
                answer = "8";
                break;
            case 8:
                image.setImageResource(R.drawable.p8);
                answer = "2";
                break;
            case 9:
                image.setImageResource(R.drawable.p9);
                answer = "4";
                break;
            case 10:
                image.setImageResource(R.drawable.p10);
                answer = "2";
                break;
        }

        str = Double.toString(roundAvoid(score, 1)) + "%";
        percent.setText(str);
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
