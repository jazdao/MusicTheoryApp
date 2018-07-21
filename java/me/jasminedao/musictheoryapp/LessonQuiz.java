package me.jasminedao.musictheoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LessonQuiz extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;

    private int mScore = 0;
    private int mQuestionNumber = 1;

    private String[] mQuestions;
    private String[][] mChoices;
    private String[] mAnswers;

    private int value;
    private int q;

    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_quiz);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(LessonQuiz.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(LessonQuiz.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(LessonQuiz.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(LessonQuiz.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        Intent intent = getIntent();
        value = intent.getIntExtra("quiz",0);

        // Get set of questions, choices, and answers depending on intent received
        mQuestions = mQuestionLibrary.getQuestion(value);
        mChoices = mQuestionLibrary.getChoices(value);
        mAnswers = mQuestionLibrary.getAnswer(value);

        mScoreView = findViewById(R.id.score);
        mQuestionView = findViewById(R.id.question);
        mChoice1 = findViewById(R.id.answer1);
        mChoice2 = findViewById(R.id.answer2);
        mChoice3 = findViewById(R.id.answer3);

        q = 0;

        mQuestionView.setText(mQuestions[q]);
        mChoice1.setText(mChoices[q][0]);
        mChoice2.setText(mChoices[q][1]);
        mChoice3.setText(mChoices[q][2]);

        mChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mChoice1.getText() == mAnswers[q]) {
                    mScore += 10;
                    updateScore();
                    if (mQuestionNumber < 10) {
                        updateQuestion();
                    }
                    else {
                        startActivity(new Intent(LessonQuiz.this, QuizResult.class)
                                .putExtra("Score", mScore));
                        finish();
                    }

                    Toast.makeText(LessonQuiz.this, "That's correct!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LessonQuiz.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber < 10) {
                        updateQuestion();
                    }
                    else {
                        startActivity(new Intent(LessonQuiz.this, QuizResult.class)
                                .putExtra("Score", mScore));
                        finish();
                    }
                }
            }
        });

        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mChoice2.getText() == mAnswers[q]) {
                    mScore += 10;
                    updateScore();
                    if (mQuestionNumber < 10) {
                        updateQuestion();
                    }
                    else {
                        startActivity(new Intent(LessonQuiz.this, QuizResult.class)
                                .putExtra("Score", mScore));
                        finish();
                    }

                    Toast.makeText(LessonQuiz.this, "That's correct!", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(LessonQuiz.this, "Oops, wrong answer.", Toast.LENGTH_LONG).show();
                    if (mQuestionNumber < 10) {
                    }
                    else {
                        startActivity(new Intent(LessonQuiz.this, QuizResult.class)
                                .putExtra("Score", mScore));
                        finish();
                    }
                }
            }
        });

        mChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mChoice3.getText() == mAnswers[q]) {
                    mScore += 10;
                    updateScore();
                    if (mQuestionNumber < 10) {
                        updateQuestion();
                    }
                    else {
                        startActivity(new Intent(LessonQuiz.this, QuizResult.class)
                                .putExtra("Score", mScore));
                        finish();
                    }

                    Toast.makeText(LessonQuiz.this, "That's correct!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LessonQuiz.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber < 10) {
                        updateQuestion();
                    }
                    else {
                        startActivity(new Intent(LessonQuiz.this, QuizResult.class)
                                .putExtra("Score", mScore));
                        finish();
                    }
                }
            }
        });
    }

    private void updateScore() {
        mScoreView.setText(String.valueOf(mScore));
    }

    private void updateQuestion() {
        q++;
        mQuestionView.setText(mQuestions[q]);
        mChoice1.setText(mChoices[q][0]);
        mChoice2.setText(mChoices[q][1]);
        mChoice3.setText(mChoices[q][2]);
        mQuestionNumber++;
    }
}


