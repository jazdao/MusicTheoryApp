package me.jasminedao.musictheoryapp;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
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

public class Practice1 extends AppCompatActivity {

    private ImageView image;
    private TextView percent;

    private SoundPool soundpool;

    private Button c4;
    private Button d4;
    private Button e4;
    private Button f4;
    private Button g4;
    private Button a4;
    private Button b4;
    private Button c5;
    private Button d5;
    private Button e5;
    private Button f5;
    private Button g5;

    private Button answer;

    Random random;

    private int question;
    private double questionNum = 0;
    private double correct = 0;
    private double score = 0.0;
    String str;

    private int sound1, sound2, sound3, sound4, sound5, sound6,
            sound7, sound8, sound9, sound10, sound11, sound12,
            sound13, sound14, sound15, sound16, sound17, sound18,
            sound19, sound20, sound21, sound22, sound23;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Practice1.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Practice1.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Practice1.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Practice1.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        image = (ImageView)findViewById(R.id.question);
        percent = (TextView)findViewById(R.id.score);
        c4 = (Button)findViewById(R.id.c4);
        d4 = (Button)findViewById(R.id.d4);
        e4 = (Button)findViewById(R.id.e4);
        f4 = (Button)findViewById(R.id.f4);
        g4 = (Button)findViewById(R.id.g4);
        a4 = (Button)findViewById(R.id.a4);
        b4 = (Button)findViewById(R.id.b4);
        c5 = (Button)findViewById(R.id.c5);
        d5 = (Button)findViewById(R.id.d5);
        e5 = (Button)findViewById(R.id.e5);
        f5 = (Button)findViewById(R.id.f5);
        g5 = (Button)findViewById(R.id.g5);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundpool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else {
            soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundpool.load(this, R.raw.c4, 1);
        sound2 = soundpool.load(this, R.raw.d4, 1);
        sound3 = soundpool.load(this, R.raw.e4, 1);
        sound4 = soundpool.load(this, R.raw.f4, 1);
        sound5 = soundpool.load(this, R.raw.g4, 1);
        sound6 = soundpool.load(this, R.raw.a4, 1);
        sound7 = soundpool.load(this, R.raw.b4, 1);
        sound8 = soundpool.load(this, R.raw.c5, 1);
        sound9 = soundpool.load(this, R.raw.d5, 1);
        sound10 = soundpool.load(this, R.raw.e5, 1);
        sound11 = soundpool.load(this, R.raw.f5, 1);
        sound12 = soundpool.load(this, R.raw.g5, 1);
        sound13 = soundpool.load(this, R.raw.b3, 1);
        sound14 = soundpool.load(this, R.raw.a3, 1);
        sound15 = soundpool.load(this, R.raw.g3, 1);
        sound16 = soundpool.load(this, R.raw.f3, 1);
        sound17 = soundpool.load(this, R.raw.e3, 1);
        sound18 = soundpool.load(this, R.raw.d3, 1);
        sound19 = soundpool.load(this, R.raw.c3, 1);
        sound20 = soundpool.load(this, R.raw.b2, 1);
        sound21 = soundpool.load(this, R.raw.a2, 1);
        sound22 = soundpool.load(this, R.raw.g2, 1);
        sound23 = soundpool.load(this, R.raw.f2, 1);

        random = new Random();
        updateQuestion();

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c4 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (d4 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e4 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f4 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g4 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a4 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c5 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (d5 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e5 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f5 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g5 == answer) {
                    Toast.makeText(Practice1.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice1.this, "Sorry, the correct answer is " + answer.getText() + ".", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });
    }

    public void updateQuestion() {
        questionNum++;
        question = random.nextInt((24)+1);

        if (question >= 1 && question <= 12) {
            c4.setText("C4");
            d4.setText("D4");
            e4.setText("E4");
            f4.setText("F4");
            g4.setText("G4");
            a4.setText("A4");
            b4.setText("B4");
            c5.setText("C5");
            d5.setText("D5");
            e5.setText("E5");
            f5.setText("F5");
            g5.setText("G5");
        }
        else if (question > 12 && question <= 24){
            c4.setText("C4");
            d4.setText("B3");
            e4.setText("A3");
            f4.setText("G3");
            g4.setText("F3");
            a4.setText("E3");
            b4.setText("D3");
            c5.setText("C3");
            d5.setText("B2");
            e5.setText("A2");
            f5.setText("G2");
            g5.setText("F2");
        }

        switch (question) {
            default:
                image.setImageResource(R.drawable.treblec);
                answer = findViewById(R.id.c4);
                soundpool.play(sound1, 1, 1, 0, 0, 1);
            case 1:
                image.setImageResource(R.drawable.treblec);
                answer = findViewById(R.id.c4);
                soundpool.play(sound1, 1, 1, 0, 0, 1);
                break;
            case 2:
                image.setImageResource(R.drawable.trebled);
                answer = findViewById(R.id.d4);
                soundpool.play(sound2, 1, 1, 0, 0, 1);
                break;
            case 3:
                image.setImageResource(R.drawable.treblee);
                answer = findViewById(R.id.e4);
                soundpool.play(sound3, 1, 1, 0, 0, 1);
                break;
            case 4:
                image.setImageResource(R.drawable.treblef);
                answer = findViewById(R.id.f4);
                soundpool.play(sound4, 1, 1, 0, 0, 1);
                break;
            case 5:
                image.setImageResource(R.drawable.trebleg);
                answer = findViewById(R.id.g4);
                soundpool.play(sound5, 1, 1, 0, 0, 1);
                break;
            case 6:
                image.setImageResource(R.drawable.treblea);
                answer = findViewById(R.id.a4);
                soundpool.play(sound6, 1, 1, 0, 0, 1);
                break;
            case 7:
                image.setImageResource(R.drawable.trebleb);
                answer = findViewById(R.id.b4);
                soundpool.play(sound7, 1, 1, 0, 0, 1);
                break;
            case 8:
                image.setImageResource(R.drawable.treblec5);
                answer = findViewById(R.id.c5);
                soundpool.play(sound8, 1, 1, 0, 0, 1);
                break;
            case 9:
                image.setImageResource(R.drawable.trebled5);
                answer = findViewById(R.id.d5);
                soundpool.play(sound9, 1, 1, 0, 0, 1);
                break;
            case 10:
                image.setImageResource(R.drawable.treblee5);
                answer = findViewById(R.id.e5);
                soundpool.play(sound10, 1, 1, 0, 0, 1);
                break;
            case 11:
                image.setImageResource(R.drawable.treblef5);
                answer = findViewById(R.id.f5);
                soundpool.play(sound11, 1, 1, 0, 0, 1);
                break;
            case 12:
                image.setImageResource(R.drawable.trebleg5);
                answer = findViewById(R.id.g5);
                soundpool.play(sound12, 1, 1, 0, 0, 1);
                break;
            case 13:
                image.setImageResource(R.drawable.bassc);
                answer = findViewById(R.id.c4);
                soundpool.play(sound1, 1, 1, 0, 0, 1);
                break;
            case 14:
                image.setImageResource(R.drawable.bassb);
                answer = findViewById(R.id.d4);
                soundpool.play(sound13, 1, 1, 0, 0, 1);
                break;
            case 15:
                image.setImageResource(R.drawable.bassa);
                answer = findViewById(R.id.e4);
                soundpool.play(sound14, 1, 1, 0, 0, 1);
                break;
            case 16:
                image.setImageResource(R.drawable.bassg);
                answer = findViewById(R.id.f4);
                soundpool.play(sound15, 1, 1, 0, 0, 1);
                break;
            case 17:
                image.setImageResource(R.drawable.bassf);
                answer = findViewById(R.id.g4);
                soundpool.play(sound16, 1, 1, 0, 0, 1);
                break;
            case 18:
                image.setImageResource(R.drawable.basse);
                answer = findViewById(R.id.a4);
                soundpool.play(sound17, 1, 1, 0, 0, 1);
                break;
            case 19:
                image.setImageResource(R.drawable.bassd);
                answer = findViewById(R.id.b4);
                soundpool.play(sound18, 1, 1, 0, 0, 1);
                break;
            case 20:
                image.setImageResource(R.drawable.bassc3);
                answer = findViewById(R.id.c5);
                soundpool.play(sound19, 1, 1, 0, 0, 1);
                break;
            case 21:
                image.setImageResource(R.drawable.bassb2);
                answer = findViewById(R.id.d5);
                soundpool.play(sound20, 1, 1, 0, 0, 1);
                break;
            case 22:
                image.setImageResource(R.drawable.bassa2);
                answer = findViewById(R.id.e5);
                soundpool.play(sound21, 1, 1, 0, 0, 1);
                break;
            case 23:
                image.setImageResource(R.drawable.bassg2);
                answer = findViewById(R.id.f5);
                soundpool.play(sound22, 1, 1, 0, 0, 1);
                break;
            case 24:
                image.setImageResource(R.drawable.bassf2);
                answer = findViewById(R.id.g5);
                soundpool.play(sound23, 1, 1, 0, 0, 1);
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
