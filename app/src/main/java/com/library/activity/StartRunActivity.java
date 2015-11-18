package com.library.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by joseph on 15/11/14.
 */
public class StartRunActivity extends Activity{

    Button pauseButton,cameraButton,exitButton;
    int change=0; //0=開始 1=暫停
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startrun);

        pauseButton=(Button)findViewById(R.id.pauseButton);
        cameraButton=(Button)findViewById(R.id.cameraButton);
        exitButton=(Button)findViewById(R.id.exitButton);

        cameraButton.setVisibility(cameraButton.INVISIBLE);
        exitButton.setVisibility(exitButton.INVISIBLE);
    }
    public void toPause(View v){

        if(change==0) {
            cameraButton.setVisibility(cameraButton.VISIBLE);
            exitButton.setVisibility(exitButton.VISIBLE);
            exitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("KK","++");
                    Intent it =new Intent(StartRunActivity.this,ExitActivity.class);
                    startActivity(it);
                }
            });
            pauseButton.setText("開始按鈕");
            change=1;
        }else if(change==1){

            cameraButton.setVisibility(cameraButton.INVISIBLE);
            exitButton.setVisibility(exitButton.INVISIBLE);
            pauseButton.setText("暫停按鈕");
            change=0;

        }


    }
    private void exit(){



    }
}
