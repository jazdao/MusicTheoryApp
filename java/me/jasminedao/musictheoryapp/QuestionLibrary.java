package me.jasminedao.musictheoryapp;

public class QuestionLibrary {

    private String mQuestions[] = {
            "How many spaces are on a staff?",
            "Compared to the Bass Clef, the Treble clef has _________ pitch.",
            "The _________ a note is on the staff, the lower its pitch.",
            "How many letters of the alphabet are used in musical notation?",
            "Where is a clef placed on a staff?",
            "What is the note in the middle of the Grand Staff?",
            "On a staff with the Treble Clef, what is the note above F?",
            "On a staff with the Bass Clef, what is the note below A?",
            "How many notes are in an octave?",
            "How many lines are on a Grand Staff?"
    };

    private String mChoices[][] = {
            {"2","3","4"},
            {"a higher","a lower","the same"},
            {"higher","lower","smaller"},
            {"6","7","8"},
            {"The beginning of the staff","The end of the staff","Before the staff"},
            {"The Middle A","The Middle B","The Middle C"},
            {"E","G","A"},
            {"G","B","C"},
            {"3","5","8"},
            {"5","10","15"},
    };

    private String mAnswers[] = {
            "4",
            "a higher",
            "lower",
            "7",
            "The beginning of the staff",
            "The Middle C",
            "G",
            "G",
            "8",
            "10"
    };

    private String mQuestions2[] = {
            "How many quarter notes make up a whole note?",
            "What do you call the length of time that a note is played?",
            "A half note is equivalent to _________ notes with two flags.",
            "An eighth note is equivalent to _________ of a whole note.",
            "How many 32nd notes are in a sixteenth note?",
            "Two notes with a flag can be attached to each other by a _________.",
            "The head of a note takes up _________ space(s).",
            "A note heads of a _________ note and a _________ note are filled in.",
            "What note is the equivalent of four eighth notes?",
            "How many half notes make up a whole note?"
    };

    private String mChoices2[][] = {
            {"2","3","4"},
            {"Beat","Duration","Speed"},
            {"4","6","8"},
            {"1/4","1/8","1/16"},
            {"2","3","4"},
            {"stem","tail","beam"},
            {"one","two","three"},
            {"whole; quarter", "half; 16th", "quarter; 8th"},
            {"A half note","A whole note","Neither"},
            {"2","4","6"}
    };

    private String mAnswers2[] = {
            "4",
            "Duration",
            "8",
            "1/8",
            "2",
            "beam",
            "one",
            "quarter; 8th",
            "A half note",
            "2"
    };

    private String mQuestions3[] = {
            "A rest indicates _________.",
            "A whole rest is equivalent to _________.",
            "A half rest is equivalent to a _________.",
            "Two sixteenth rests is equivalent to _________.",
            "Four quarter rests is equivalent to _________.",
            "Four half rests is equivalent to _________.",
            "Twelve quarter rests is equivalent to _________.",
            "Two half rests is equivalent to _________.",
            "Eight eighth rests is equivalent to _________.",
            "One 256th rest is equivalent to _________."
    };

    private String mChoices3[][] = {
            {"duration","silence","pitch"},
            {"2 quarter rests","3 quarter rests","4 quarter rests"},
            {"half note","quarter note","whole note"},
            {"1 quarter rest","4 32nd rests","1/2 half rest"},
            {"2 whole notes","2 half notes","2 quarter rests"},
            {"1 whole note","2 whole rests", "3 whole notes"},
            {"2 whole notes","4 whole rests","6 half notes"},
            {"2 quarter rests", "1/2 half rest","1 whole rest"},
            {"1 whole rest","1 half rest","6 quarter rests"},
            {"256 whole rests","1/256th of a quarter rest","1/256th of a whole rest"}
    };

    private String mAnswers3[] = {
            "silence",
            "4 quarter rests",
            "half note",
            "4 32nd rests",
            "2 half notes",
            "2 whole rests",
            "6 half notes",
            "1 whole rest",
            "1 whole rest",
            "1/256th of a whole rest"
    };

    private String mQuestions4[] = {
        "Staffs are divided into sections called _________.",
            "The duration of a measure is set by the _________.",
                "The top number in a time signature tells you _________.",
                    "If the bottom number in a time signature is 4, then a _________ is being counted.",
                        "In a time signature of 4/2, there can be _________ in a measure.",
                            "In a time signature of 6/8, there can be 3 _________ in a measure.",
                                "If the top number in a time signature is 3, then there can be _________ per measure.",
                                    "In a time signature of 4/4, there can be _________ in a measure.",
                                        "In a time signature of 4/16, there can be _________ in a measure.",
                                            "The duration of a measure in 6/8 time is the same as in _________."
    };

    private String mChoices4[][] = {
        {"barlines","sections","measures"},
            {"key signature","time signature","type of note"},
                {"the number of notes per measure","the type of note","the duration"},
                    {"whole note","half note","quarter note"},
                        {"2 half notes","4 half notes","2 quarter notes"},
                            {"half notes","quarter notes","eighth notes"},
                                {"3 quarter notes","3 half notes","It depends."},
                                    {"4 half notes","8 eighth notes","1 whole note"},
                                        {"4 half notes","8 eighth notes","4 sixteenth notes"},
                                            {"12/16 time","4/8 time","6/4 time"}
    };

    private String mAnswers4[] = {
        "measures",
            "time signature",
                "the number of notes per measure",
                    "quarter note",
                        "4 half notes",
                            "quarter notes",
                                "It depends",
                                    "8 eighth notes",
                                        "4 sixteenth notes",
                                            "12/16 time"
    };

    private String mQuestions5[] = {
        "A tie adds the _________ of notes together.",
            "What does a dot increase the duration of a note by?",
                "Notes tied together must have the same _________.",
                    "What is the duration of a quarter note and whole note tied together?",
                        "What is the duration of a dotted whole note?",
                            "What is the duration of a dotted quarter note and sixteenth note tied together?",
                        "What is the duration of two dotted half notes tied together?",
                    "In 4/4 time, it is more efficient to use a _________ when you need a note with 3 beats.",
                "In 3/4 time, you should use a _________ when you need a note with 4 beats.",
            "In 6/8 time, you should use a _________ when you need a note with 4 beats."
    };

    private String mChoices5[][] = {
        {"pitch","duration","beats"},
            {"A half","Double","It depends."},
                {"duration","symbol","pitch"},
                    {"A dotted whole note","A tied dotted half note and half note","A tied whole note and half note"},
                            {"6 beats","8 beats","10 beats"},
                                {"1.25 beats","1.75 beats","2 beats"},
                            {"3 beats","6 beats","8 beats"},
                        {"dot","tie","Either"},
                    {"dot","tie","Either"},
                {"dot","tie","Either"}
    };

    private String mAnswers5[] = {
        "duration",
            "A half",
                "pitch",
                    "A tied dotted half note and half note",
                        "6 beats",
                            "1.75 beats",
                        "6 beats",
                    "dot",
                "tie",
            "tie"
    };

    private String mQuestions6[] = {
            "Each line and space represents a _________ on a keyboard.",
            "The distance between two notes is called _________.",
            "What is a half step above an F key?",
            "What does a flat do?",
            "What is a whole step below a C key?",
            "What is the equivalent of a E# key?",
            "What key is on the second ledger line above a Treble Staff?",
            "Black keys on a piano are portrayed by _________.",
            "A whole step is _________ a half step.",
            "What is a half step below a C key?"
    };

    private String mChoices6[][] = {
            {"black key","duration","pitch"},
            {"an octave","an interval","a step"},
            {"E#","G","F#"},
            {"Elevate a key by half a step","Lower a key by half a step","Cancel out other accidentals"},
            {"Cb","B","Bb"},
            {"F","Fb","F#"},
            {"A","B","C"},
            {"lines and spaces on a staff","accidentals on notes","ledger lines"},
            {"half","whole","double"},
            {"B","Bb","A#"}
    };

    private String mAnswers6[] = {
            "pitch",
            "an interval",
            "F#",
            "Lower a key by half a step",
            "Bb",
            "F",
            "C",
            "accidentals",
            "double",
            "B"
    };

    private String mQuestions7[] = {
            "Key signatures are placed _________ at the beginning of a staff.",
            "The key signature determines the _________ played throughout a music piece.",
            "A major scale has half steps between the _________ and _________ steps.",
            "How many sharps or flats does the A major key signature have?",
            "A C major scale has _________ sharps.",
            "In a D major scale, there is a half step between _________ and _________.",
            "A scale is a set of _________ ascending notes.",
            "What flats are in the Bb major scale?",
            "What major scale has 4 sharps?",
            "In a Bb major scale, there is a whole step between _________ and _________."
    };

    private String mChoices7[][] = {
            {"before the clef","after the time signature","before the time signature"},
            {"steps","accidentals","scales"},
            {"third; fourth","fifth; sixth","sixth; seventh"},
            {"4 sharps","5 flats","3 sharps"},
            {"zero","one","two"},
            {"F#; G","A; B","E; F#"},
            {"5","8","10"},
            {"Bb; Gb","Bb; Db","Bb; Eb"},
            {"D major","E major","F# major"},
            {"Bb; C","D; Eb","Ab; B"}
    };

    private String mAnswers7[] = {
            "before the time signature",
            "accidentals",
            "third; fourth",
            "3 sharps",
            "zero",
            "F#; G",
            "8",
            "Bb; Eb",
            "E major",
            "Bb; C"
    };


    public String[] getQuestion(int i) {
        switch (i){
            case 1:
                return mQuestions;
            case 2:
                return mQuestions2;
            case 3:
                return mQuestions3;
            case 4:
                return mQuestions4;
            case 5:
                return mQuestions5;
            case 6:
                return mQuestions6;
            case 7:
                return mQuestions7;
        }
        return null;
    }

    public String[][] getChoices(int i) {
        switch (i) {
            case 1:
                return mChoices;
            case 2:
                return mChoices2;
            case 3:
                return mChoices3;
            case 4:
                return mChoices4;
            case 5:
                return mChoices5;
            case 6:
                return mChoices6;
            case 7:
                return mChoices7;
        }
        return null;
    }

    public String[] getAnswer(int i) {
        switch (i) {
            case 1:
                return mAnswers;
            case 2:
                return mAnswers2;
            case 3:
                return mAnswers3;
            case 4:
                return mAnswers4;
            case 5:
                return mAnswers5;
            case 6:
                return mAnswers6;
            case 7:
                return mAnswers7;
        }
        return null;
    }
}
