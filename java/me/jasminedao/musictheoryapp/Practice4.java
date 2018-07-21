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

public class Practice4 extends AppCompatActivity {

    private ImageView image;
    private TextView percent;

    private Button right;
    private Button wrong;

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
        setContentView(R.layout.activity_practice4);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Practice4.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Practice4.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Practice4.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Practice4.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        image = (ImageView)findViewById(R.id.question);
        percent = (TextView)findViewById(R.id.score);
        right = (Button)findViewById(R.id.right);
        wrong = (Button)findViewById(R.id.wrong);

        random = new Random();
        updateQuestion();

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right.getText().equals(answer)) {
                    Toast.makeText(Practice4.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice4.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });

        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong.getText().equals(answer)) {
                    Toast.makeText(Practice4.this, "That's correct!", Toast.LENGTH_SHORT).show();
                    correct++;
                    score = (correct / questionNum) * 100;
                }
                else {
                    Toast.makeText(Practice4.this, "Oops, wrong answer.", Toast.LENGTH_SHORT).show();
                    score = (correct / questionNum) * 100;
                }
                updateQuestion();
            }
        });
    }

    public void updateQuestion() {
        questionNum++;
        question = random.nextInt((87)+1);

        switch (question) {
            case 1:
                image.setImageResource(R.drawable.m1);
                answer = "Right";
                break;
            case 2:
                image.setImageResource(R.drawable.m2);
                answer = "Right";
                break;
            case 3:
                image.setImageResource(R.drawable.m3);
                answer = "Right";
                break;
            case 4:
                image.setImageResource(R.drawable.m4);
                answer = "Right";
                break;
            case 5:
                image.setImageResource(R.drawable.m5);
                answer = "Right";
                break;
            case 6:
                image.setImageResource(R.drawable.m6);
                answer = "Right";
                break;
            case 7:
                image.setImageResource(R.drawable.m7);
                answer = "Right";
                break;
            case 8:
                image.setImageResource(R.drawable.m8);
                answer = "Right";
                break;
            case 9:
                image.setImageResource(R.drawable.m9);
                answer = "Right";
                break;
            case 10:
                image.setImageResource(R.drawable.m10);
                answer = "Right";
                break;
            case 11:
                image.setImageResource(R.drawable.m11);
                answer = "Right";
                break;

            case 12:
                image.setImageResource(R.drawable.m12);
                answer = "Right";
                break;

            case 13:
                image.setImageResource(R.drawable.m13);
                answer = "Right";
                break;

            case 14:
                image.setImageResource(R.drawable.m14);
                answer = "Right";
                break;

            case 15:
                image.setImageResource(R.drawable.m15);
                answer = "Right";
                break;

            case 16:
                image.setImageResource(R.drawable.m16);
                answer = "Right";
                break;

            case 17:
                image.setImageResource(R.drawable.m17);
                answer = "Right";
                break;

            case 18:
                image.setImageResource(R.drawable.m18);
                answer = "Right";
                break;

            case 19:
                image.setImageResource(R.drawable.m19);
                answer = "Right";
                break;

            case 20:
                image.setImageResource(R.drawable.m20);
                answer = "Right";
                break;

            case 21:
                image.setImageResource(R.drawable.m21);
                answer = "Right";
                break;

            case 22:
                image.setImageResource(R.drawable.m22);
                answer = "Right";
                break;

            case 23:
                image.setImageResource(R.drawable.m23);
                answer = "Right";
                break;

            case 24:
                image.setImageResource(R.drawable.m24);
                answer = "Right";
                break;

            case 25:
                image.setImageResource(R.drawable.m25);
                answer = "Right";
                break;

            case 26:
                image.setImageResource(R.drawable.m26);
                answer = "Right";
                break;

            case 27:
                image.setImageResource(R.drawable.m27);
                answer = "Right";
                break;

            case 28:
                image.setImageResource(R.drawable.m28);
                answer = "Right";
                break;

            case 29:
                image.setImageResource(R.drawable.m29);
                answer = "Right";
                break;

            case 30:
                image.setImageResource(R.drawable.m30);
                answer = "Right";
                break;

            case 31:
                image.setImageResource(R.drawable.m31);
                answer = "Right";
                break;

            case 32:
                image.setImageResource(R.drawable.m32);
                answer = "Right";
                break;

            case 33:
                image.setImageResource(R.drawable.m33);
                answer = "Right";
                break;

            case 34:
                image.setImageResource(R.drawable.m34);
                answer = "Right";
                break;

            case 35:
                image.setImageResource(R.drawable.m35);
                answer = "Right";
                break;

            case 36:
                image.setImageResource(R.drawable.m36);
                answer = "Right";
                break;

            case 37:
                image.setImageResource(R.drawable.m37);
                answer = "Right";
                break;

            case 38:
                image.setImageResource(R.drawable.m38);
                answer = "Right";
                break;

            case 39:
                image.setImageResource(R.drawable.m39);
                answer = "Right";
                break;

            case 40:
                image.setImageResource(R.drawable.m40);
                answer = "Right";
                break;

            case 41:
                image.setImageResource(R.drawable.m41);
                answer = "Right";
                break;

            case 42:
                image.setImageResource(R.drawable.m42);
                answer = "Right";
                break;

            case 43:
                image.setImageResource(R.drawable.m43);
                answer = "Right";
                break;

            case 44:
                image.setImageResource(R.drawable.m44);
                answer = "Right";
                break;

            case 45:
                image.setImageResource(R.drawable.b1);
                answer = "Wrong";
                break;

            case 46:
                image.setImageResource(R.drawable.b2);
                answer = "Wrong";
                break;

            case 47:
                image.setImageResource(R.drawable.b3);
                answer = "Wrong";
                break;

            case 48:
                image.setImageResource(R.drawable.b4);
                answer = "Wrong";
                break;

            case 49:
                image.setImageResource(R.drawable.b5);
                answer = "Wrong";
                break;

            case 50:
                image.setImageResource(R.drawable.b6);
                answer = "Wrong";
                break;

            case 51:
                image.setImageResource(R.drawable.b7);
                answer = "Wrong";
                break;

            case 52:
                image.setImageResource(R.drawable.b8);
                answer = "Wrong";
                break;

            case 53:
                image.setImageResource(R.drawable.b9);
                answer = "Wrong";
                break;

            case 54:
                image.setImageResource(R.drawable.b10);
                answer = "Wrong";
                break;

            case 55:
                image.setImageResource(R.drawable.b11);
                answer = "Wrong";
                break;

            case 56:
                image.setImageResource(R.drawable.b12);
                answer = "Wrong";
                break;

            case 57:
                image.setImageResource(R.drawable.b13);
                answer = "Wrong";
                break;

            case 58:
                image.setImageResource(R.drawable.b14);
                answer = "Wrong";
                break;

            case 59:
                image.setImageResource(R.drawable.b15);
                answer = "Wrong";
                break;

            case 60:
                image.setImageResource(R.drawable.b16);
                answer = "Wrong";
                break;

            case 61:
                image.setImageResource(R.drawable.b17);
                answer = "Wrong";
                break;

            case 62:
                image.setImageResource(R.drawable.b18);
                answer = "Wrong";
                break;

            case 63:
                image.setImageResource(R.drawable.b19);
                answer = "Wrong";
                break;

            case 64:
                image.setImageResource(R.drawable.b20);
                answer = "Wrong";
                break;

            case 65:
                image.setImageResource(R.drawable.b21);
                answer = "Wrong";
                break;

            case 66:
                image.setImageResource(R.drawable.b22);
                answer = "Wrong";
                break;

            case 67:
                image.setImageResource(R.drawable.b23);
                answer = "Wrong";
                break;

            case 68:
                image.setImageResource(R.drawable.b24);
                answer = "Wrong";
                break;

            case 69:
                image.setImageResource(R.drawable.b25);
                answer = "Wrong";
                break;

            case 70:
                image.setImageResource(R.drawable.b26);
                answer = "Wrong";
                break;

            case 71:
                image.setImageResource(R.drawable.b27);
                answer = "Wrong";
                break;

            case 72:
                image.setImageResource(R.drawable.b28);
                answer = "Wrong";
                break;

            case 73:
                image.setImageResource(R.drawable.b29);
                answer = "Wrong";
                break;

            case 74:
                image.setImageResource(R.drawable.b30);
                answer = "Wrong";
                break;

            case 75:
                image.setImageResource(R.drawable.b31);
                answer = "Wrong";
                break;

            case 76:
                image.setImageResource(R.drawable.b32);
                answer = "Wrong";
                break;

            case 77:
                image.setImageResource(R.drawable.b33);
                answer = "Wrong";
                break;

            case 78:
                image.setImageResource(R.drawable.b34);
                answer = "Wrong";
                break;

            case 79:
                image.setImageResource(R.drawable.b35);
                answer = "Wrong";
                break;

            case 80:
                image.setImageResource(R.drawable.b36);
                answer = "Wrong";
                break;

            case 81:
                image.setImageResource(R.drawable.b37);
                answer = "Wrong";
                break;

            case 82:
                image.setImageResource(R.drawable.b38);
                answer = "Wrong";
                break;

            case 83:
                image.setImageResource(R.drawable.b39);
                answer = "Wrong";
                break;

            case 84:
                image.setImageResource(R.drawable.b40);
                answer = "Wrong";
                break;

            case 85:
                image.setImageResource(R.drawable.b41);
                answer = "Wrong";
                break;

            case 86:
                image.setImageResource(R.drawable.b42);
                answer = "Wrong";
                break;

            case 87:
                image.setImageResource(R.drawable.b43);
                answer = "Wrong";
                break;

            case 88:
                image.setImageResource(R.drawable.b44);
                answer = "Wrong";
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
