package me.jasminedao.musictheoryapp;

import android.content.Intent;
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

public class Practice7 extends AppCompatActivity {

    private ImageView image;
    private TextView percent;

    private Button c;
    private Button d;
    private Button e;
    private Button fs;
    private Button g;
    private Button a;
    private Button b;
    private Button cs;

    private SoundPool soundpool;

    private int sound1, sound2, sound3, sound4, sound5, sound6,
            sound7, sound8, sound9, sound10, sound11, sound12,
            sound13, sound14, sound15, sound16;

    private Button answer;

    Random random;

    private int question;
    private double questionNum = 0;
    private double correct = 0;
    private double score = 0.0;
    String str;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice7);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Practice7.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Practice7.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Practice7.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Practice7.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        image = (ImageView)findViewById(R.id.question);
        percent = (TextView)findViewById(R.id.score);
        c = (Button)findViewById(R.id.c);
        d = (Button)findViewById(R.id.d);
        e = (Button)findViewById(R.id.e);
        fs = (Button)findViewById(R.id.fs);
        g = (Button)findViewById(R.id.g);
        a = (Button)findViewById(R.id.a);
        b = (Button)findViewById(R.id.b);
        cs = (Button)findViewById(R.id.cs);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundpool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else {
            soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundpool.load(this, R.raw.c4, 1);
        sound2 = soundpool.load(this, R.raw.d4, 1);
        sound3 = soundpool.load(this, R.raw.e4, 1);
        sound4 = soundpool.load(this, R.raw.gb4, 1);
        sound5 = soundpool.load(this, R.raw.g4, 1);
        sound6 = soundpool.load(this, R.raw.a4, 1);
        sound7 = soundpool.load(this, R.raw.b4, 1);
        sound8 = soundpool.load(this, R.raw.db4, 1);
        sound9 = soundpool.load(this, R.raw.c4, 1);
        sound10 = soundpool.load(this, R.raw.bb4, 1);
        sound11 = soundpool.load(this, R.raw.ab4, 1);
        sound12 = soundpool.load(this, R.raw.gb4, 1);
        sound13 = soundpool.load(this, R.raw.f4, 1);
        sound14 = soundpool.load(this, R.raw.eb4, 1);
        sound15 = soundpool.load(this, R.raw.db4, 1);
        sound16 = soundpool.load(this, R.raw.b4, 1);

        random = new Random();
        updateQuestion();

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c == answer) {
                    Toast.makeText(Practice7.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice7.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (d == answer) {
                    Toast.makeText(Practice7.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice7.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == answer) {
                    Toast.makeText(Practice7.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice7.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        fs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fs == answer) {
                    Toast.makeText(Practice7.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice7.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g == answer) {
                    Toast.makeText(Practice7.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice7.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == answer) {
                    Toast.makeText(Practice7.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice7.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b == answer) {
                    Toast.makeText(Practice7.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice7.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cs == answer) {
                    Toast.makeText(Practice7.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice7.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });
    }

    public void updateQuestion() {
        questionNum++;
        question = random.nextInt((14) + 1);

        if (question >= 1 && question <= 8) {
            c.setText("C Major");
            d.setText("D Major");
            e.setText("E Major");
            fs.setText("F# Major");
            g.setText("G Major");
            a.setText("A Major");
            b.setText("B Major");
            cs.setText("C# Major");
        }
        else {
            c.setText("C Major");
            d.setText("Bb Major");
            e.setText("Ab Major");
            fs.setText("Gb Major");
            g.setText("F Major");
            a.setText("Eb Major");
            b.setText("Db Major");
            cs.setText("Cb Major");
        }


        switch (question) {
            case 1:
                image.setImageResource(R.drawable.keyc);
                answer = findViewById(R.id.c);
                soundpool.play(sound1, 1, 1, 0, 0, 1);
                break;
            case 2:
                image.setImageResource(R.drawable.keyd);
                answer = findViewById(R.id.d);
                soundpool.play(sound2, 1, 1, 0, 0, 1);
                break;
            case 3:
                image.setImageResource(R.drawable.keye);
                answer = findViewById(R.id.e);
                soundpool.play(sound3, 1, 1, 0, 0, 1);
                break;
            case 4:
                image.setImageResource(R.drawable.keyfs);
                answer = findViewById(R.id.fs);
                soundpool.play(sound4, 1, 1, 0, 0, 1);
                break;
            case 5:
                image.setImageResource(R.drawable.keyg);
                answer = findViewById(R.id.g);
                soundpool.play(sound5, 1, 1, 0, 0, 1);
                break;
            case 6:
                image.setImageResource(R.drawable.keya);
                answer = findViewById(R.id.a);
                soundpool.play(sound6, 1, 1, 0, 0, 1);
                break;
            case 7:
                image.setImageResource(R.drawable.keyb);
                answer = findViewById(R.id.b);
                soundpool.play(sound7, 1, 1, 0, 0, 1);
                break;
            case 8:
                image.setImageResource(R.drawable.keycs);
                answer = findViewById(R.id.cs);
                soundpool.play(sound9, 1, 1, 0, 0, 1);
                break;
            case 9:
                image.setImageResource(R.drawable.keybb);
                answer = findViewById(R.id.d);
                soundpool.play(sound10, 1, 1, 0, 0, 1);
                break;
            case 10:
                image.setImageResource(R.drawable.keyab);
                answer = findViewById(R.id.e);
                soundpool.play(sound11, 1, 1, 0, 0, 1);
                break;
            case 11:
                image.setImageResource(R.drawable.keygb);
                answer = findViewById(R.id.fs);
                soundpool.play(sound12, 1, 1, 0, 0, 1);
                break;
            case 12:
                image.setImageResource(R.drawable.keyf);
                answer = findViewById(R.id.g);
                soundpool.play(sound13, 1, 1, 0, 0, 1);
                break;
            case 13:
                image.setImageResource(R.drawable.keyeb);
                answer = findViewById(R.id.a);
                soundpool.play(sound14, 1, 1, 0, 0, 1);
                break;
            case 14:
                image.setImageResource(R.drawable.keydb);
                answer = findViewById(R.id.b);
                soundpool.play(sound15, 1, 1, 0, 0, 1);
                break;
            case 15:
                image.setImageResource(R.drawable.keycb);
                answer = findViewById(R.id.cs);
                soundpool.play(sound16, 1, 1, 0, 0, 1);
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
