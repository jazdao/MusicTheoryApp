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

public class Lesson7 extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;
    TextView text10;

    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    String str10;

    Button btn;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson7);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Lesson7.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Lesson7.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Lesson7.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Lesson7.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        str1 = getResources().getString(R.string.lesson7_1);
        str2 = getResources().getString(R.string.lesson7_2);
        str3 = getResources().getString(R.string.lesson7_3);
        str4 = getResources().getString(R.string.lesson7_4);
        str5 = getResources().getString(R.string.lesson7_5);
        str6 = getResources().getString(R.string.lesson7_6);
        str7 = getResources().getString(R.string.lesson7_7);
        str8 = getResources().getString(R.string.lesson7_8);
        str9 = getResources().getString(R.string.lesson7_9);
        str10 = getResources().getString(R.string.lesson7_10);

        text1 = findViewById(R.id.lesson7_1);
        text2 = findViewById(R.id.lesson7_2);
        text3 = findViewById(R.id.lesson7_3);
        text4 = findViewById(R.id.lesson7_4);
        text5 = findViewById(R.id.lesson7_5);
        text6 = findViewById(R.id.lesson7_6);
        text7 = findViewById(R.id.lesson7_7);
        text8 = findViewById(R.id.lesson7_8);
        text9 = findViewById(R.id.lesson7_9);
        text10 = findViewById(R.id.lesson7_10);

        text1.setText(Html.fromHtml(str1), TextView.BufferType.SPANNABLE);
        text2.setText(Html.fromHtml(str2), TextView.BufferType.SPANNABLE);
        text3.setText(Html.fromHtml(str3), TextView.BufferType.SPANNABLE);
        text4.setText(Html.fromHtml(str4), TextView.BufferType.SPANNABLE);
        text5.setText(Html.fromHtml(str5), TextView.BufferType.SPANNABLE);
        text6.setText(Html.fromHtml(str6), TextView.BufferType.SPANNABLE);
        text7.setText(Html.fromHtml(str7), TextView.BufferType.SPANNABLE);
        text8.setText(Html.fromHtml(str8), TextView.BufferType.SPANNABLE);
        text9.setText(Html.fromHtml(str9), TextView.BufferType.SPANNABLE);
        text10.setText(Html.fromHtml(str10), TextView.BufferType.SPANNABLE);

        btn = (Button)findViewById(R.id.next1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lesson7.this, Lesson7Summary.class));
            }
        });
    }
}
