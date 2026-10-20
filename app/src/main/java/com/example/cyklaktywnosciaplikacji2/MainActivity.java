package com.example.cyklaktywnosciaplikacji2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
   Button buttonPlus, buttonMinus;
   TextView textView;
   int punkty = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buttonPlus =findViewById(R.id.button);
        buttonMinus =findViewById(R.id.button2);
        textView = findViewById(R.id.textviewPunkty);
buttonMinus.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punkty--;
                textView.setText(punkty+"");
            }
        }
);
        buttonPlus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        textView.setText(punkty+"");
                    }
                }
        );
        Log.i("CZAS","wywolana metoda onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CZAS","wywolana metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CZAS","wywolana metoda onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CZAS","wywolana metoda onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CZAS","wywolana metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CZAS","wywolana metoda onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CZAS","wywolana metoda onDestroy");
    }
    //nie wolno wywolywac metod cyklu zycia aktywnosci
    //https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pl
}