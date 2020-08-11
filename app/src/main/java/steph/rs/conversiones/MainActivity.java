package steph.rs.conversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Monedas(View view) {
        Intent intento = new Intent(this, Monedas.class);
        startActivity(intento);
    }

    public void Time(View view) {
        Intent intento5 = new Intent(this, Tiempo.class);
        startActivity(intento5);
    }

    public void Almace(View view) {
        Intent intento4 = new Intent(this, Almacenamiento.class);
        startActivity(intento4);
    }
}