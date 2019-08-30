package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //algo como o sout, imprime no logcat
        Log.i("cicloDeVida", "Método onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("cicloDeVida", "Método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("cicloDeVida", "Método onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("cicloDeVida", "Método onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("cicloDeVida", "Método onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("cicloDeVida", "Método onDestroy");
    }
}
