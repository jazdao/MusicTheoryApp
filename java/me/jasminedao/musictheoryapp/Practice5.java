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

public class Practice5 extends AppCompatActivity {

    private TextView q;
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
    private String str;

    private String[] questions = {
            "How many beats is a whole note tied to a half note?",
            "How many beats is a whole note tied to a quarter note?",
            "How many beats is a whole note tied to an eighth note?",
            "How many beats is a whole note tied to a sixteenth note?",
            "How many beats is a half note tied to a quarter note?",
            "How many beats is a half note tied to an eighth note?",
            "How many beats is a half note tied to a sixteenth note?",
            "How many beats is a quarter note tied to an eighth note?",
            "How many beats is a quarter note tied to a sixteenth note?",
            "How many beats is an eighth note tied to a sixteenth note?",
            "How many beats is a dotted whole note?",
            "How many beats is a dotted half note?",
            "How many beats is a dotted quarter note?",
            "How many beats is a dotted eighth note?",
            "How many beats is a dotted whole note tied to a whole note?",
            "How many beats is a dotted whole note tied to a half note?",
            "How many beats is a dotted whole note tied to a quarter note?",
            "How many beats is a dotted whole note tied to an eighth note?",
            "How many beats is a dotted whole note tied to a sixteenth note?",
            "How many beats is a dotted half note tied to a whole note?",
            "How many beats is a dotted half note tied to a half note?",
            "How many beats is a dotted half note tied to a quarter note?",
            "How many beats is a dotted half note tied to an eighth note?",
            "How many beats is a dotted half note tied to a sixteenth note?",
            "How many beats is a dotted quarter note tied to a whole note?",
            "How many beats is a dotted quarter note tied to a half note?",
            "How many beats is a dotted quarter note tied to a quarter note?",
            "How many beats is a dotted quarter note tied to an eighth note?",
            "How many beats is a dotted quarter note tied to a sixteenth note?",
            "How many beats is a dotted eighth note tied to a whole note?",
            "How many beats is a dotted eighth note tied to a half note?",
            "How many beats is a dotted eighth note tied to a quarter note?",
            "How many beats is a dotted eighth note tied to an eighth note?",
            "How many beats is a dotted eighth note tied to a sixteenth note?",
            "How many beats is a dotted whole note tied to a dotted whole note?",
            "How many beats is a dotted whole note tied to a dotted half note?",
            "How many beats is a dotted whole note tied to a dotted quarter note?",
            "How many beats is a dotted whole note tied to an dotted eighth note?",
            "How many beats is a dotted half note tied to a dotted half note?",
            "How many beats is a dotted half note tied to a dotted quarter note?",
            "How many beats is a dotted half note tied to an dotted eighth note?",
            "How many beats is a dotted quarter note tied to a dotted quarter note?",
            "How many beats is a dotted quarter note tied to an dotted eighth note?",
            "How many beats is a dotted eighth note tied to an dotted eighth note?"
    };

    private String[] answers = {
            "6", "5", "4.5", "4.25",
            "3", "2.5", "2.25", "1.5",
            "1.25", "0.75", "6", "3",
            "1.5", "0.75", "10", "8",
            "7", "6.5", "6.25", "7",
            "5", "4", "3.5", "3.25",
            "5.5", "3.5", "2.5", "2",
            "1.75", "4.75", "2.75", "1.75",
            "2.25", "1", "12", "9",
            "7.5", "6.75", "6", "4.5",
            "3.75", "3", "2.25", "1.5"
    };

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice5);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Practice5.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Practice5.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Practice5.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Practice5.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        q = (TextView)findViewById(R.id.question);
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
                if (choice1.getText().equals(answers[question])) {
                    Toast.makeText(Practice5.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice5.this, "Sorry, the correct answer is " + answers[question] + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice2.getText().equals(answers[question])) {
                    Toast.makeText(Practice5.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice5.this, "Sorry, the correct answer is " + answers[question] + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice3.getText().equals(answers[question])) {
                    Toast.makeText(Practice5.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice5.this, "Sorry, the correct answer is " + answers[question] + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice4.getText().equals(answers[question])) {
                    Toast.makeText(Practice5.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice5.this, "Sorry, the correct answer is " + answers[question] + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });
    }

    public void updateQuestion() {
        questionNum++;
        question = random.nextInt(43);

        q.setText(questions[question]);

        if (question >= 0 && question <= 15) {
            choice1.setText(answers[question]);
            choice2.setText(answers[question+1]);
            choice3.setText(answers[question+2]);
            choice4.setText(answers[question+3]);
        }
        else if (question > 15 && question <= 31) {
            choice2.setText(answers[question]);
            choice1.setText(answers[question-1]);
            choice3.setText(answers[question+1]);
            choice4.setText(answers[question+2]);
        }
        else if (question > 32 && question <= 47) {
            choice3.setText(answers[question]);
            choice1.setText(answers[question-1]);
            choice2.setText(answers[question+1]);
            choice4.setText(answers[question-2]);
        }
        else {
            choice4.setText(answers[question]);
            choice1.setText(answers[question-1]);
            choice2.setText(answers[question-2]);
            choice3.setText(answers[question-3]);
        }

        str = Double.toString(roundAvoid(score, 1)) + "%";
        percent.setText(str);
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
