package br.com.campix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Options options = Options.init()
                .setRequestCode(1)
                .setFrontfacing(false)
                .setPath("pix/photo");
        //.setFileName("teste");

        Pix.start(MainActivity.this, options);
    }
}