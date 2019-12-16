package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onHairSelection(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Get the hair asset
        ImageView hair_image = findViewById(R.id.hairImageView);


        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.spiky_button:
                if (checked)
                    hair_image.setImageResource(R.drawable.hair0);
                    break;
            case R.id.curly_button:
                if (checked)
                    hair_image.setImageResource(R.drawable.hair1);
                    break;
        }
    }

    public void onEyeSelection(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Get the eye asset
        ImageView eye_image = findViewById(R.id.eyeImageView);


        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.brown_eye_button:
                if (checked)
                    eye_image.setImageResource(R.drawable.eye0);
                break;
            case R.id.blue_eye_button:
                if (checked)
                    eye_image.setImageResource(R.drawable.eye1);
                break;
        }
    }

    public void onMouthSelection(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Get the mouth asset
        ImageView mouth_image = findViewById(R.id.mouthImageView);


        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.smile_button:
                if (checked)
                    mouth_image.setImageResource(R.drawable.mouth0);
                break;
            case R.id.frown_button:
                if (checked)
                    mouth_image.setImageResource(R.drawable.mouth1);
                break;

        }
    }

    public void randomizeFace(View view) {
        // This function is called when the "Randomize!" button is clicked.

        // Get the image assets
        ImageView hair_image = findViewById(R.id.hairImageView);
        ImageView eye_image = findViewById(R.id.eyeImageView);
        ImageView mouth_image = findViewById(R.id.mouthImageView);

        RadioGroup hair_group = findViewById(R.id.hair_group);
        RadioGroup eye_group = findViewById(R.id.eye_group);
        RadioGroup mouth_group = findViewById(R.id.mouth_group);

        //// Randomly roll a face
        Random rand = new Random();

        boolean hair_choice = rand.nextBoolean();
        boolean eye_choice = rand.nextBoolean();
        boolean mouth_choice = rand.nextBoolean();

        // Based on the outcome of the random rolls, set the image resources.
        if (!hair_choice){
            hair_image.setImageResource(R.drawable.hair0);
            hair_group.check(R.id.spiky_button);
        }
        else {
            hair_image.setImageResource(R.drawable.hair1);
            hair_group.check(R.id.curly_button);
        }

        if (!eye_choice){
            eye_image.setImageResource(R.drawable.eye0);
            eye_group.check(R.id.brown_eye_button);
        }
        else {
            eye_image.setImageResource(R.drawable.eye1);
            eye_group.check(R.id.blue_eye_button);
        }
        if (!mouth_choice){
            mouth_image.setImageResource(R.drawable.mouth0);
            mouth_group.check(R.id.smile_button);
        }
        else {
            mouth_image.setImageResource(R.drawable.mouth1);
            mouth_group.check(R.id.frown_button);
        }



    }
}
