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

public class Practice6 extends AppCompatActivity {

    private ImageView image;
    private TextView percent;

    private SoundPool soundpool;

    private Button cs;
    private Button ds;
    private Button e;
    private Button f;
    private Button fs;
    private Button gs;
    private Button as;
    private Button b;
    private Button bs;

    private Button answer;

    Random random;

    private int question;
    private double questionNum = 0;
    private double correct = 0;
    private double score = 0.0;
    String str;

    private int sound1, sound2, sound3, sound4, sound5, sound6,
            sound7, sound8, sound9, sound10, sound11, sound12,
            sound13, sound14, sound15, sound16;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice6);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Practice6.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Practice6.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Practice6.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Practice6.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        image = (ImageView)findViewById(R.id.question);
        percent = (TextView)findViewById(R.id.score);

        cs = (Button)findViewById(R.id.cs);
        ds = (Button)findViewById(R.id.ds);
        e = (Button)findViewById(R.id.e);
        f = (Button)findViewById(R.id.f);
        fs = (Button)findViewById(R.id.fs);
        gs = (Button)findViewById(R.id.gs);
        as = (Button)findViewById(R.id.as);
        b = (Button)findViewById(R.id.b);
        bs = (Button)findViewById(R.id.bs);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundpool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else {
            soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundpool.load(this, R.raw.db3, 1);
        sound2 = soundpool.load(this, R.raw.eb3, 1);
        sound3 = soundpool.load(this, R.raw.e3, 1);
        sound4 = soundpool.load(this, R.raw.f3, 1);
        sound5 = soundpool.load(this, R.raw.gb3, 1);
        sound6 = soundpool.load(this, R.raw.ab3, 1);
        sound7 = soundpool.load(this, R.raw.bb3, 1);
        sound8 = soundpool.load(this, R.raw.b3, 1);
        sound9 = soundpool.load(this, R.raw.c4, 1);
        sound10 = soundpool.load(this, R.raw.db4, 1);
        sound11 = soundpool.load(this, R.raw.eb4, 1);
        sound12 = soundpool.load(this, R.raw.e4, 1);
        sound13 = soundpool.load(this, R.raw.f4, 1);
        sound14 = soundpool.load(this, R.raw.gb4, 1);
        sound15 = soundpool.load(this, R.raw.ab4, 1);
        sound16 = soundpool.load(this, R.raw.bb4, 1);

        random = new Random();
        updateQuestion();

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cs == answer) {
                    Toast.makeText(Practice6.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice6.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ds == answer) {
                    Toast.makeText(Practice6.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice6.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == answer) {
                    Toast.makeText(Practice6.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice6.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f == answer) {
                    Toast.makeText(Practice6.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice6.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        fs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fs == answer) {
                    Toast.makeText(Practice6.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice6.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gs == answer) {
                    Toast.makeText(Practice6.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice6.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (as == answer) {
                    Toast.makeText(Practice6.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice6.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b == answer) {
                    Toast.makeText(Practice6.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice6.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bs == answer) {
                    Toast.makeText(Practice6.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice6.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });
    }

    public void updateQuestion() {
        questionNum++;
        question = random.nextInt((15)+1);

        switch (question) {
            case 1:
                image.setImageResource(R.drawable.k1);
                answer = findViewById(R.id.cs);
                soundpool.play(sound1, 1, 1, 0, 0, 1);
                break;
            case 2:
                image.setImageResource(R.drawable.k2);
                answer = findViewById(R.id.ds);
                soundpool.play(sound2, 1, 1, 0, 0, 1);
                break;
            case 3:
                image.setImageResource(R.drawable.k3);
                answer = findViewById(R.id.e);
                soundpool.play(sound3, 1, 1, 0, 0, 1);
                break;
            case 4:
                image.setImageResource(R.drawable.k4);
                answer = findViewById(R.id.f);
                soundpool.play(sound4, 1, 1, 0, 0, 1);
                break;
            case 5:
                image.setImageResource(R.drawable.k5);
                answer = findViewById(R.id.fs);
                soundpool.play(sound5, 1, 1, 0, 0, 1);
                break;
            case 6:
                image.setImageResource(R.drawable.k6);
                answer = findViewById(R.id.gs);
                soundpool.play(sound6, 1, 1, 0, 0, 1);
                break;
            case 7:
                image.setImageResource(R.drawable.k7);
                answer = findViewById(R.id.as);
                soundpool.play(sound7, 1, 1, 0, 0, 1);
                break;
            case 8:
                image.setImageResource(R.drawable.k8);
                answer = findViewById(R.id.b);
                soundpool.play(sound8, 1, 1, 0, 0, 1);
                break;
            case 9:
                image.setImageResource(R.drawable.k9);
                answer = findViewById(R.id.bs);
                soundpool.play(sound9, 1, 1, 0, 0, 1);
                break;
            case 10:
                image.setImageResource(R.drawable.k10);
                answer = findViewById(R.id.cs);
                soundpool.play(sound10, 1, 1, 0, 0, 1);
                break;
            case 11:
                image.setImageResource(R.drawable.k11);
                answer = findViewById(R.id.ds);
                soundpool.play(sound11, 1, 1, 0, 0, 1);
                break;
            case 12:
                image.setImageResource(R.drawable.k12);
                answer = findViewById(R.id.e);
                soundpool.play(sound12, 1, 1, 0, 0, 1);
                break;
            case 13:
                image.setImageResource(R.drawable.k13);
                answer = findViewById(R.id.f);
                soundpool.play(sound13, 1, 1, 0, 0, 1);
                break;
            case 14:
                image.setImageResource(R.drawable.k14);
                answer = findViewById(R.id.fs);
                soundpool.play(sound14, 1, 1, 0, 0, 1);
                break;
            case 15:
                image.setImageResource(R.drawable.k15);
                answer = findViewById(R.id.gs);
                soundpool.play(sound15, 1, 1, 0, 0, 1);
                break;
            case 16:
                image.setImageResource(R.drawable.k16);
                answer = findViewById(R.id.as);
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
