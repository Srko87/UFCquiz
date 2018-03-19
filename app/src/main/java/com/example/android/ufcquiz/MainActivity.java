package com.example.android.ufcquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

// Score counter is a global variable

    public static final String SCORE = "SCORE_KEY";

    // Checkbox counter is a global variable
    int score = 0;
    int numberCheckedCheckbox = 0;

    // Declaration of variables
    RadioGroup Rgroup1;
    RadioButton Lorenzo;
    RadioButton Dana;
    RadioButton Joe;
    RadioButton Donald;
    CheckBox Conor;
    CheckBox Rhonda;
    CheckBox Rose;
    CheckBox Cain;
    CheckBox Hunt;
    EditText editAnswer;
    RadioGroup Rgroup2;
    RadioButton Stephens;
    RadioButton Garbrandt;
    RadioButton Miocic;
    RadioButton Weidman;
    RadioGroup Rgroup3;
    RadioButton Whitaker;
    RadioButton Johnson;
    RadioButton Romero;
    RadioButton Rockhold;
    RadioGroup Rgroup4;
    RadioButton Cormier;
    RadioButton Gustafsson;
    RadioButton Oezdemir;
    RadioButton Jones;
    RadioGroup Rgroup5;
    RadioButton Holloway;
    RadioButton Woodley;
    RadioButton Nurmagomedov;
    RadioButton Dillishaw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Assigns RadioButtons, CheckBoxes and EditTexts to corresponding variables

        Rgroup1 = findViewById(R.id.RGroup1);
        Lorenzo = findViewById(R.id.lorenzo_radiobutton);
        Dana = findViewById(R.id.dana_radiobutton);
        Joe = findViewById(R.id.joe_radiobutton);
        Donald = findViewById(R.id.donald_radiobutton);
        Conor = findViewById(R.id.conor_checkbox);
        Rhonda = findViewById(R.id.rhonda_checkbox);
        Rose = findViewById(R.id.rose_checkbox);
        Cain = findViewById(R.id.cain_checkbox);
        Hunt = findViewById(R.id.hunt_checkbox);
        editAnswer = findViewById(R.id.q7_answer);
        Rgroup2 = findViewById(R.id.RGroup2);
        Stephens = findViewById(R.id.stephens_radiobutton);
        Garbrandt = findViewById(R.id.garbrandt_radiobutton);
        Miocic = findViewById(R.id.miocic_radiobutton);
        Weidman = findViewById(R.id.weidman_radiobutton);
        Rgroup3 = findViewById(R.id.RGroup3);
        Whitaker = findViewById(R.id.whitaker_radiobutton);
        Johnson = findViewById(R.id.johnson_radiobutton);
        Romero = findViewById(R.id.romero_radiobutton);
        Rockhold = findViewById(R.id.rockhold_radiobutton);
        Rgroup4 = findViewById(R.id.RGroup4);
        Cormier = findViewById(R.id.cormier_radiobutton);
        Gustafsson = findViewById(R.id.gustafsson_radiobutton);
        Oezdemir = findViewById(R.id.oezdemir_radiobutton);
        Jones = findViewById(R.id.jones_radiobutton);
        Rgroup5 = findViewById(R.id.RGroup5);
        Holloway = findViewById(R.id.holloway_radiobutton);
        Woodley = findViewById(R.id.woodley_radiobutton);
        Nurmagomedov = findViewById(R.id.nurmagomedov_radiobutton);
        Dillishaw = findViewById(R.id.dillishaw_radiobutton);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt(SCORE, score);
    }

// Saves scores if screen is rewritten

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

// Restore UI state from the savedInstanceState.

        score = savedInstanceState.getInt(SCORE);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus();
        if (view != null && (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass().getName().startsWith("android.webkit.")) {
            int scrcoords[] = new int[2];
            view.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + view.getLeft() - scrcoords[0];
            float y = ev.getRawY() + view.getTop() - scrcoords[1];
            if (x < view.getLeft() || x > view.getRight() || y < view.getTop() || y > view.getBottom())
                ((InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow((this.getWindow().getDecorView().getApplicationWindowToken()), 0);
        }
        return super.dispatchTouchEvent(ev);
    }

// Checks which Radio Group 1 button is clicked

    public void radioGroup1Clicked(View view) {
        // is  button  checked?
        boolean checked = ((RadioButton) view).isChecked();

        // which radio button is clicked
        switch (view.getId()) {
            case R.id.lorenzo_radiobutton:
                if (checked)
                    // lorenzo is checked
                    break;
            case R.id.dana_radiobutton:
                if (checked)
                    // dana is checked
                    break;

            case R.id.joe_radiobutton:
                if (checked)
                    //joe is checked
                    break;
            case R.id.donald_radiobutton:
                if (checked)
                    //donald is checked
                    break;

        }
    }

// Conor checkbox click handler

    public void conorClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        if (checked && (numberCheckedCheckbox >= 2))
            Conor.setChecked(false);
        else if (checked)
            numberCheckedCheckbox++;
        else if (!checked)
            numberCheckedCheckbox--;
        if (numberCheckedCheckbox >= 2) {
            Toast.makeText(this, "You can check a maximum of two boxes", Toast.LENGTH_SHORT).show();
        }
    }

// Rhonda checkbox click handler

    public void rhondaClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        if (checked && (numberCheckedCheckbox >= 2))
            Rhonda.setChecked(false);
        else if (checked)
            numberCheckedCheckbox++;
        else if (!checked)
            numberCheckedCheckbox--;
        if (numberCheckedCheckbox >= 2) {
            Toast.makeText(this, "You can check a maximum of two boxes", Toast.LENGTH_SHORT).show();
        }
    }

// Rose checkbox click handler

    public void roseClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        if (checked && (numberCheckedCheckbox >= 2))
            Rose.setChecked(false);
        else if (checked)
            numberCheckedCheckbox++;
        else if (!checked)
            numberCheckedCheckbox--;
        if (numberCheckedCheckbox >= 2) {
            Toast.makeText(this, "You can check a maximum of two boxes", Toast.LENGTH_SHORT).show();
        }
    }

// Cain checkbox click handler

    public void cainClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        if (checked && (numberCheckedCheckbox >= 2))
            Cain.setChecked(false);
        else if (checked)
            numberCheckedCheckbox++;
        else if (!checked)
            numberCheckedCheckbox--;
        if (numberCheckedCheckbox >= 2) {
            Toast.makeText(this, "You can check a maximum of two boxes", Toast.LENGTH_SHORT).show();
        }
    }

// Hunt checkbox click handler

    public void huntClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        if (checked && (numberCheckedCheckbox >= 2))
            Hunt.setChecked(false);
        else if (checked)
            numberCheckedCheckbox++;
        else if (!checked)
            numberCheckedCheckbox--;
        if (numberCheckedCheckbox >= 2) {
            Toast.makeText(this, "You can check a maximum of two boxes", Toast.LENGTH_SHORT).show();
        }
    }

// Checks which Radio Group 2 button is clicked

    public void radioGroup2Clicked(View view) {
        // Is button checked?
        boolean checked = ((RadioButton) view).isChecked();

        // which radio button is clicked
        switch (view.getId()) {
            case R.id.stephens_radiobutton:
                if (checked)
                    // stephens checked
                    break;
            case R.id.garbrandt_radiobutton:
                if (checked)
                    // garbrandt checked
                    break;

            case R.id.miocic_radiobutton:
                if (checked)
                    // miocic checked
                    break;
            case R.id.weidman_radiobutton:
                if (checked)
                    //weidman checked
                    break;

        }
    }

// Checks which Radio Group 3 button is clicked

    public void radioGroup3Clicked(View view) {
        // Is button checked?
        boolean checked = ((RadioButton) view).isChecked();

        // which radio button is clicked
        switch (view.getId()) {
            case R.id.whitaker_radiobutton:
                if (checked)
                    // whitaker checked
                    break;
            case R.id.johnson_radiobutton:
                if (checked)
                    // johnson checked
                    break;

            case R.id.romero_radiobutton:
                if (checked)
                    // romero checked
                    break;
            case R.id.rockhold_radiobutton:
                if (checked)
                    //rockhold checked
                    break;

        }
    }

    // Checks which Radio Group 4 button is clicked

    public void radioGroup4Clicked(View view) {
        // Is button checked?
        boolean checked = ((RadioButton) view).isChecked();

        // which radio button is clicked
        switch (view.getId()) {
            case R.id.cormier_radiobutton:
                if (checked)
                    // cormier checked
                    break;
            case R.id.gustafsson_radiobutton:
                if (checked)
                    // gustafsson checked
                    break;

            case R.id.oezdemir_radiobutton:
                if (checked)
                    // oezdemir checked
                    break;
            case R.id.jones_radiobutton:
                if (checked)
                    //jones checked
                    break;

        }
    }

    // Checks which Radio Group 5 button is clicked

    public void radioGroup5Clicked(View view) {
        // Is button checked?
        boolean checked = ((RadioButton) view).isChecked();

        // which radio button is clicked
        switch (view.getId()) {
            case R.id.holloway_radiobutton:
                if (checked)
                    // holloway checked
                    break;
            case R.id.woodley_radiobutton:
                if (checked)
                    // woodley checked
                    break;

            case R.id.nurmagomedov_radiobutton:
                if (checked)
                    // nurmagomedov checked
                    break;
            case R.id.dillishaw_radiobutton:
                if (checked)
                    //dillishaw checked
                    break;

        }
    }

    // Checks correct answers and adds scores
    public void showResult(View view) {
        if (Dana.isChecked()) {
            score += 1;
        }
        if (Rhonda.isChecked()) {
            score += 1;
        }
        if (Conor.isChecked()) {
            score += 1;
        }
        if (Miocic.isChecked()) {
            score += 1;
        }
        if (Johnson.isChecked()) {
            score += 1;
        }
        if (Jones.isChecked()) {
            score += 1;
        }
        if (Nurmagomedov.isChecked()) {
            score += 1;
        }
        // get the contents of edit text
        EditText editAnswer = findViewById(R.id.q7_answer);
        String inputAnswer = editAnswer.getText().toString();

        if (inputAnswer.equals("UFC")) {
            score += 2;
        }

        // Toast message with result
        if (score == 9) {
            Toast.makeText(this, "Congratulations you scored a maximum of 9 points!", Toast.LENGTH_LONG).show();
            score = 0; // Set score to 0 so that extra presses don't multiply the score
        } else {
            Toast.makeText(this, "You scored " + score + " out of 9 maximum points!", Toast.LENGTH_LONG).show();
            score = 0; // Set score to 0 so that extra presses don't multiply the score

        }

    }

    // Resets all Check boxes, Radio Buttons and Text input answers and resets integer variables.
    public void reset_score(View view) {
        score = 0;
        //sets score to zero
        numberCheckedCheckbox = 0;
        //sets number of check boxes clicked variable to zero

        //clears radiobuttons
        Rgroup1.clearCheck();
        Rgroup2.clearCheck();
        Rgroup3.clearCheck();
        Rgroup4.clearCheck();
        Rgroup5.clearCheck();

        //clears checkbox
        if (Conor.isChecked()) {
            Conor.setChecked(false);
        }
        if (Rhonda.isChecked()) {
            Rhonda.setChecked(false);
        }
        if (Rose.isChecked()) {
            Rose.setChecked(false);
        }
        if (Cain.isChecked()) {
            Cain.setChecked(false);
        }
        if (Hunt.isChecked()) {
            Hunt.setChecked(false);
        }
        // clears edit text fields
        editAnswer.setText("");
    }
}