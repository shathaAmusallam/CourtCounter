package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int ScourA=0;
    int ScourB=0;
 public void displayA(int number) {

            TextView scourAtextview1 = (TextView) findViewById(
                    R.id.scourA_text_view);
            scourAtextview1.setText("" + number);

    }
   public void displayB(int number) {

        TextView scourAtextview2 = (TextView) findViewById(
                R.id.SCOURB_text_view);
        scourAtextview2.setText("" + number);
    }




    public void ThreePoint(View view)
    {
        displayA(ScourA+=3);
            }

    public void TwoPoint(View view)
    {
        displayA(ScourA+=2);

    }


    public void FreeThrow(View view) {


        displayA(ScourA+=1);
    }


    public void Three(View view)
    {
        displayB(ScourB += 3);

    }

    public void Two(View view)
    {

        displayB(ScourB += 2);
    }


    public void Free(View view) {

        displayB(ScourB += 1);}

}

