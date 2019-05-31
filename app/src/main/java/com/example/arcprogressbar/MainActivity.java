package com.example.arcprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private  RoundProgressBar roundProgressBar;
    private Random random=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView=findViewById(R.id.textView);
        roundProgressBar=findViewById(R.id.roundProgressBar);

        roundProgressBar.setOnProgressChangeListner(new OnProgressChangeListner() {
            @Override
            public void onProgressChange(float progess) {

                int xx= (int) progess;
                Log.e("progess",xx+"");
                textView.setText(xx+"");
            }
        });
    }

    public void updateProgress(View view) {
        float progress=random.nextInt(100);
        roundProgressBar.setCurrentprogess(progress,true);
    }
}
