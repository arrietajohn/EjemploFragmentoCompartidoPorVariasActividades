package co.gov.mintic.misiontic.ciclo4.usa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }


}