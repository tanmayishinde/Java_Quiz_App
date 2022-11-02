/*
 * *
 *  * This is a Basic Android Project
 *  * QuizApp is an android based application, and enables the user to undertake a series of questions on Java language.
 *  * The app is user friendly, and the user shall find it extremely easy to answer the multiple-choice questions.
 *  * At the end of the quiz, a Toast displays the score.
 *  * @author (Tanmayi Shinde) Last modified: 02-11-2022
 *
 */

package com.microservice.cha4practicesetlayoutview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonYes;
    private Button buttonNo;
    private TextView qtstextView;

    private  String [] questions= {"Guido van Rossum introduced Java?","Java was introduced in year 1985?","Java programs are machine-independent"
    ,"JIT stands for Just-In-Time?"};

    private boolean[]  answers= {false,false,true,true};
      int score=0;
    private  int index=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonYes = findViewById(R.id.buttonYes);
        buttonNo = findViewById(R.id.buttonNo);
        qtstextView= findViewById(R.id.questionstext);
        qtstextView.setText(questions[0]);


        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length-1){
                    if(answers[index]==true){
                        //if given correct wrong
                        score++;
                }
                    qtstextView.setText(questions[index++]);
                }
                else{
                    Toast.makeText(MainActivity.this, "You score is"+score+"out of"+questions.length, Toast.LENGTH_SHORT).show();
                }

            }
        });
        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length-1){
                    //if given correct wrong
                    if(answers[index]==false){
                        score++;
                    }
                    qtstextView.setText(questions[index++]);
                }
                else{
                    Toast.makeText(MainActivity.this, "You score is"+score+"\n", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}