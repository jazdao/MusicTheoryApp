package me.jasminedao.musictheoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lesson8 extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;

    String str1;
    String str2;
    String str3;
    String str4;

    Button btn;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson8);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Lesson8.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Lesson8.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Lesson8.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Lesson8.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        str1 = getResources().getString(R.string.lesson8_1);
        str2 = getResources().getString(R.string.lesson8_2);
        str3 = getResources().getString(R.string.lesson8_3);
        str4 = getResources().getString(R.string.lesson8_4);

        text1 = findViewById(R.id.lesson8_1);
        text2 = findViewById(R.id.lesson8_2);
        text3 = findViewById(R.id.lesson8_3);
        text4 = findViewById(R.id.lesson8_4);

        text1.setText(Html.fromHtml(str1), TextView.BufferType.SPANNABLE);
        text2.setText(Html.fromHtml(str2), TextView.BufferType.SPANNABLE);
        text3.setText(Html.fromHtml(str3), TextView.BufferType.SPANNABLE);
        text4.setText(Html.fromHtml(str4), TextView.BufferType.SPANNABLE);

        btn = (Button)findViewById(R.id.home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lesson8.this, MainActivity.class));
            }
        });
    }
}
