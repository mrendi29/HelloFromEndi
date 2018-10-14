package com.example.caushie.hellofromendi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)  findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
                // Changes Text color to Light Blue.
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.RootView).setBackgroundColor(
                        getResources().getColor(R.color.orange));
                // Changes Background Color to orange.
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Grabs the text that the user inputed
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello From Endi!");
                    // If user does not type it resets to default text.
                }
                else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                    // If newText is  not empty it displays user input.

                }

            }
        });

        findViewById(R.id.RootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)  findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
                // Resets Text Color back to Black

                findViewById(R.id.RootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
                // Resets Background color back to collorAccent

                ((TextView)  findViewById(R.id.textView)).setText("Hello From Endi!");

                // Resets Text back to "Hello From Endi!"

            }



        });


    }


}
