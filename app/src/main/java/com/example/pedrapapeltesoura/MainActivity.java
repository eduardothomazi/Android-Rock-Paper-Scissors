package com.example.pedrapapeltesoura;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void stoneChosen(View view) {
        Random random = new Random();
        ImageView appChoice = findViewById(R.id.image_app_choice);
        TextView result = findViewById(R.id.textView2);
        setAllChoicesNotChosen();
        TextView stone = findViewById(R.id.text_my_choice_stone);
        stone.setText(R.string.stone);


        int[] imageViews = instantiateImages();
        int randomized = random.nextInt(imageViews.length);
        appChoice.setImageResource(imageViews[randomized]);


        if (randomized == 0) {
            result.setText("Empate!");
            TextView appChoiceType = findViewById(R.id.text_app_choice_type);
            appChoiceType.setText("Pedra");
        }
        if (randomized == 1) {
            result.setText("Você perdeu! =(");
            TextView appChoiceType = findViewById(R.id.text_app_choice_type);
            appChoiceType.setText("Papel");
        }
        if (randomized == 2) {
            result.setText("Você ganhou! =)");
            TextView appChoiceType = findViewById(R.id.text_app_choice_type);
            appChoiceType.setText("Tesoura");
        }
    }

    public void paperChosen(View view) {
        Random random = new Random();
        ImageView appChoice = findViewById(R.id.image_app_choice);
        TextView result = findViewById(R.id.textView2);
        setAllChoicesNotChosen();
        TextView paper = findViewById(R.id.text_my_choice_paper);
        paper.setText(R.string.paper);

        int[] imageViews = instantiateImages();
        int randomized = random.nextInt(imageViews.length);
        appChoice.setImageResource(imageViews[randomized]);

        if (randomized == 0) {
            result.setText("Você ganhou! =)");
            TextView appChoiceType = findViewById(R.id.text_app_choice_type);
            appChoiceType.setText("Pedra");
        }
        if (randomized == 1) {
            result.setText("Empate!");
            TextView appChoiceType = findViewById(R.id.text_app_choice_type);
            appChoiceType.setText("Papel");
        }
        if (randomized == 2) {
            result.setText("Você perdeu! =(");
            TextView appChoiceType = findViewById(R.id.text_app_choice_type);
            appChoiceType.setText("Tesoura");
        }

    }

    public void scissorsChosen(View view) {
        Random random = new Random();
        ImageView appChoice = findViewById(R.id.image_app_choice);
        TextView result = findViewById(R.id.textView2);
        setAllChoicesNotChosen();
        TextView scissors = findViewById(R.id.text_my_choice_scissors);
        scissors.setText(R.string.scissors);

        int[] imageViews = instantiateImages();
        int randomized = random.nextInt(imageViews.length);
        appChoice.setImageResource(imageViews[randomized]);

        if (randomized == 0) {
            result.setText("Você perdeu! =(");
            TextView appChoiceType = findViewById(R.id.text_app_choice_type);
            appChoiceType.setText("Pedra");

        }
        if (randomized == 1) {
            result.setText("Você ganhou! =)");
            TextView appChoiceType = findViewById(R.id.text_app_choice_type);
            appChoiceType.setText("Papel");
        }
        if (randomized == 2) {
            result.setText("Empate!");
            TextView appChoiceType = findViewById(R.id.text_app_choice_type);
            appChoiceType.setText("Tesoura");
        }

    }

    public int[] instantiateImages() {
        int stone = R.drawable.pedra;
        int paper = R.drawable.papel;
        int scissors = R.drawable.tesoura;
        int[] imageViews = {stone, paper, scissors};

        return imageViews;
    }
    public void setAllChoicesNotChosen(){
        TextView stone = findViewById(R.id.text_my_choice_stone);
        TextView paper = findViewById(R.id.text_my_choice_paper);
        TextView scissors = findViewById(R.id.text_my_choice_scissors);
        stone.setText("");
        paper.setText("");
        scissors.setText("");
    }

}