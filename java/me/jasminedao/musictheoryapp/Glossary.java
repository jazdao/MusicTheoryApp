package me.jasminedao.musictheoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class Glossary extends AppCompatActivity {

    ExpandableTextView expandableTextView;
    ExpandableTextView expandableTextView2;
    ExpandableTextView expandableTextView3;
    ExpandableTextView expandableTextView4;
    ExpandableTextView expandableTextView5;
    ExpandableTextView expandableTextView6;
    ExpandableTextView expandableTextView7;
    ExpandableTextView expandableTextView8;
    ExpandableTextView expandableTextView9;
    ExpandableTextView expandableTextView10;
    ExpandableTextView expandableTextView11;
    ExpandableTextView expandableTextView12;
    ExpandableTextView expandableTextView13;
    ExpandableTextView expandableTextView14;
    ExpandableTextView expandableTextView15;
    ExpandableTextView expandableTextView16;
    ExpandableTextView expandableTextView17;
    ExpandableTextView expandableTextView18;
    ExpandableTextView expandableTextView19;
    ExpandableTextView expandableTextView20;
    ExpandableTextView expandableTextView21;
    ExpandableTextView expandableTextView22;
    ExpandableTextView expandableTextView23;
    ExpandableTextView expandableTextView24;
    ExpandableTextView expandableTextView25;
    ExpandableTextView expandableTextView26;
    ExpandableTextView expandableTextView27;
    ExpandableTextView expandableTextView28;
    ExpandableTextView expandableTextView29;
    ExpandableTextView expandableTextView30;
    ExpandableTextView expandableTextView31;
    ExpandableTextView expandableTextView32;
    ExpandableTextView expandableTextView33;
    ExpandableTextView expandableTextView34;
    ExpandableTextView expandableTextView35;
    ExpandableTextView expandableTextView36;
    ExpandableTextView expandableTextView37;
    ExpandableTextView expandableTextView38;
    ExpandableTextView expandableTextView39;

    String scale;
    String staff;
    String clef;
    String grand;
    String middle;
    String octave;
    String ledger;
    String duration;
    String beat;
    String wholenote;
    String halfnote;
    String quarternote;
    String eighthnote;
    String sixteenthnote;
    String rest;
    String wholerest;
    String halfrest;
    String quarterrest;
    String eighthrest;
    String sixteenthrest;
    String measure;
    String barline;
    String timesignature;
    String commontime;
    String waltztime;
    String marchtime;
    String tempo;
    String tie;
    String dot;
    String interval;
    String accidental;
    String halfstep;
    String sharp;
    String flat;
    String natural;
    String wholestep;
    String keysignature;
    String majorscale;
    String circleoffifths;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glossary);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.inflateMenu(R.menu.action);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_main:
                        startActivity(new Intent(Glossary.this, MainActivity.class));
                        return true;

                    case R.id.menu_lessons:
                        startActivity(new Intent(Glossary.this, Lessons.class));
                        return true;

                    case R.id.menu_practice:
                        startActivity(new Intent(Glossary.this, Practice.class));
                        return true;

                    case R.id.menu_glossary:
                        startActivity(new Intent(Glossary.this, Glossary.class));
                        return true;

                    default:
                        return false;
                }
            }
        });

        barline = getResources().getString(R.string.barline);
        clef = getResources().getString(R.string.clef);
        grand = getResources().getString(R.string.grand);
        ledger = getResources().getString(R.string.ledger);
        middle = getResources().getString(R.string.middle);
        octave = getResources().getString(R.string.octave);
        scale = getResources().getString(R.string.scale);
        staff = getResources().getString(R.string.staff);
        duration = getResources().getString(R.string.duration);
        beat = getResources().getString(R.string.beat);
        wholenote = getResources().getString(R.string.wholenote);
        halfnote = getResources().getString(R.string.halfnote);
        quarternote = getResources().getString(R.string.quarternote);
        eighthnote = getResources().getString(R.string.eighthnote);
        sixteenthnote = getResources().getString(R.string.sixteenthnote);
        rest = getResources().getString(R.string.rest);
        wholerest = getResources().getString(R.string.wholerest);
        halfrest = getResources().getString(R.string.halfrest);
        quarterrest = getResources().getString(R.string.quarterrest);
        eighthrest = getResources().getString(R.string.eighthrest);
        sixteenthrest = getResources().getString(R.string.sixteenthrest);
        measure = getResources().getString(R.string.measure);
        timesignature = getResources().getString(R.string.timesignature);
        commontime = getResources().getString(R.string.commontime);
        waltztime = getResources().getString(R.string.waltztime);
        marchtime = getResources().getString(R.string.marchtime);
        tempo = getResources().getString(R.string.tempo);
        tie = getResources().getString(R.string.tie);
        dot = getResources().getString(R.string.dot);
        interval = getResources().getString(R.string.interval);
        accidental = getResources().getString(R.string.accidental);
        halfstep = getResources().getString(R.string.halfstep);
        sharp = getResources().getString(R.string.sharp);
        flat = getResources().getString(R.string.flat);
        natural = getResources().getString(R.string.natural);
        wholestep = getResources().getString(R.string.wholestep);
        keysignature = getResources().getString(R.string.keysignature);
        majorscale = getResources().getString(R.string.majorscale);
        circleoffifths = getResources().getString(R.string.circleoffifths);

        expandableTextView = (ExpandableTextView)findViewById(R.id.expand_text_view);
        expandableTextView2 = (ExpandableTextView)findViewById(R.id.expand_text_view2);
        expandableTextView3 = (ExpandableTextView)findViewById(R.id.expand_text_view3);
        expandableTextView4 = (ExpandableTextView)findViewById(R.id.expand_text_view4);
        expandableTextView5 = (ExpandableTextView)findViewById(R.id.expand_text_view5);
        expandableTextView6 = (ExpandableTextView)findViewById(R.id.expand_text_view6);
        expandableTextView7 = (ExpandableTextView)findViewById(R.id.expand_text_view7);
        expandableTextView8 = (ExpandableTextView)findViewById(R.id.expand_text_view8);
        expandableTextView9 = (ExpandableTextView)findViewById(R.id.expand_text_view9);
        expandableTextView10 = (ExpandableTextView)findViewById(R.id.expand_text_view10);
        expandableTextView11 = (ExpandableTextView)findViewById(R.id.expand_text_view11);
        expandableTextView12 = (ExpandableTextView)findViewById(R.id.expand_text_view12);
        expandableTextView13 = (ExpandableTextView)findViewById(R.id.expand_text_view13);
        expandableTextView14 = (ExpandableTextView)findViewById(R.id.expand_text_view14);
        expandableTextView15 = (ExpandableTextView)findViewById(R.id.expand_text_view15);
        expandableTextView16 = (ExpandableTextView)findViewById(R.id.expand_text_view16);
        expandableTextView17 = (ExpandableTextView)findViewById(R.id.expand_text_view17);
        expandableTextView18 = (ExpandableTextView)findViewById(R.id.expand_text_view18);
        expandableTextView19 = (ExpandableTextView)findViewById(R.id.expand_text_view19);
        expandableTextView20 = (ExpandableTextView)findViewById(R.id.expand_text_view20);
        expandableTextView21 = (ExpandableTextView)findViewById(R.id.expand_text_view21);
        expandableTextView22 = (ExpandableTextView)findViewById(R.id.expand_text_view22);
        expandableTextView23 = (ExpandableTextView)findViewById(R.id.expand_text_view23);
        expandableTextView24 = (ExpandableTextView)findViewById(R.id.expand_text_view24);
        expandableTextView25 = (ExpandableTextView)findViewById(R.id.expand_text_view25);
        expandableTextView26 = (ExpandableTextView)findViewById(R.id.expand_text_view26);
        expandableTextView27 = (ExpandableTextView)findViewById(R.id.expand_text_view27);
        expandableTextView28 = (ExpandableTextView)findViewById(R.id.expand_text_view28);
        expandableTextView29 = (ExpandableTextView)findViewById(R.id.expand_text_view29);
        expandableTextView30 = (ExpandableTextView)findViewById(R.id.expand_text_view30);
        expandableTextView31 = (ExpandableTextView)findViewById(R.id.expand_text_view31);
        expandableTextView32 = (ExpandableTextView)findViewById(R.id.expand_text_view32);
        expandableTextView33 = (ExpandableTextView)findViewById(R.id.expand_text_view33);
        expandableTextView34 = (ExpandableTextView)findViewById(R.id.expand_text_view34);
        expandableTextView35 = (ExpandableTextView)findViewById(R.id.expand_text_view35);
        expandableTextView36 = (ExpandableTextView)findViewById(R.id.expand_text_view36);
        expandableTextView37 = (ExpandableTextView)findViewById(R.id.expand_text_view37);
        expandableTextView38 = (ExpandableTextView)findViewById(R.id.expand_text_view38);
        expandableTextView39 = (ExpandableTextView)findViewById(R.id.expand_text_view39);

        expandableTextView.setText(Html.fromHtml(accidental));
        expandableTextView2.setText(Html.fromHtml(barline));
        expandableTextView3.setText(Html.fromHtml(beat));
        expandableTextView4.setText(Html.fromHtml(circleoffifths));
        expandableTextView5.setText(Html.fromHtml(clef));
        expandableTextView6.setText(Html.fromHtml(commontime));
        expandableTextView7.setText(Html.fromHtml(dot));
        expandableTextView8.setText(Html.fromHtml(duration));
        expandableTextView9.setText(Html.fromHtml(eighthnote));
        expandableTextView10.setText(Html.fromHtml(eighthrest));
        expandableTextView11.setText(Html.fromHtml(flat));
        expandableTextView12.setText(Html.fromHtml(grand));
        expandableTextView13.setText(Html.fromHtml(halfnote));
        expandableTextView14.setText(Html.fromHtml(halfrest));
        expandableTextView15.setText(Html.fromHtml(halfstep));
        expandableTextView16.setText(Html.fromHtml(interval));
        expandableTextView17.setText(Html.fromHtml(keysignature));
        expandableTextView18.setText(Html.fromHtml(ledger));
        expandableTextView19.setText(Html.fromHtml(majorscale));
        expandableTextView20.setText(Html.fromHtml(marchtime));
        expandableTextView21.setText(Html.fromHtml(measure));
        expandableTextView22.setText(Html.fromHtml(middle));
        expandableTextView23.setText(Html.fromHtml(natural));
        expandableTextView24.setText(Html.fromHtml(octave));
        expandableTextView25.setText(Html.fromHtml(quarternote));
        expandableTextView26.setText(Html.fromHtml(quarterrest));
        expandableTextView27.setText(Html.fromHtml(rest));
        expandableTextView28.setText(Html.fromHtml(scale));
        expandableTextView29.setText(Html.fromHtml(sharp));
        expandableTextView30.setText(Html.fromHtml(staff));
        expandableTextView31.setText(Html.fromHtml(sixteenthnote));
        expandableTextView32.setText(Html.fromHtml(sixteenthrest));
        expandableTextView33.setText(Html.fromHtml(tempo));
        expandableTextView34.setText(Html.fromHtml(tie));
        expandableTextView35.setText(Html.fromHtml(timesignature));
        expandableTextView36.setText(Html.fromHtml(waltztime));
        expandableTextView37.setText(Html.fromHtml(wholenote));
        expandableTextView38.setText(Html.fromHtml(wholerest));
        expandableTextView39.setText(Html.fromHtml(wholestep));;
    }
}
