package com.example.memorygamefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import android.graphics.Color; 

public class gameScreen extends AppCompatActivity {
    private Button topLeft;
    private Button topMid;
    private Button topRight;
    private Button midLeft;
    private Button midMid;
    private Button midRight;
    private Button botLeft;
    private Button botMid;
    private Button botRight;

    private Button playGame;

    private int gameCode;
    private HashMap<Integer, Button> ButtonIntegerMap;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        playGame = findViewById(R.id.btn_gamescreen_playgame);

        topLeft = findViewById(R.id.btn_gamescreen_topleft);
        topMid = findViewById(R.id.btn_gamescreen_topmid);
        topRight = findViewById(R.id.btn_gamescreen_topright);
        midLeft = findViewById(R.id.btn_gamescreen_midleft);
        midMid = findViewById(R.id.btn_gamescreen_midmid);
        midRight = findViewById(R.id.btn_gamescreen_midright);
        botLeft = findViewById(R.id.btn_gamescreen_botleft);
        botMid = findViewById(R.id.btn_gamescreen_botmid);
        botRight = findViewById(R.id.btn_gamescreen_botright);

        HashMap<Integer, Button> butIntMap = new HashMap<Integer, Button>();
        butIntMap.put(1,topLeft);
        butIntMap.put(2,topMid);
        butIntMap.put(3,topRight);
        butIntMap.put(4,midLeft);
        butIntMap.put(5,midMid);
        butIntMap.put(6,midRight);
        butIntMap.put(7,botLeft);
        butIntMap.put(8,botMid);
        butIntMap.put(9,botRight);
		ButtonIntegerMap = butIntMap; 

        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                gameCode = currNum;
                playSequence();
            }
        }
		
		

        );

        
    }

    private void playSequence() {
		int num = (int) (Math.random()*100)+10;
        while(num>0){
            int currDig = num%10;
            Button currButton = ButtonIntegerMap.get(currDig);
            currButton.setBackgroundColor(Color.BLUE);
			currButton.setBackgroundColor(Color.RED); 
				
        }
    }


}