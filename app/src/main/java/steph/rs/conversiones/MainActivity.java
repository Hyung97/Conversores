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

    public void Longitd(View view) {
        Intent intento3 = new Intent(this, Longitud.class);
        startActivity(intento3);
    }

    public void Volumn(View view) {
        Intent intento2 = new Intent(this, Volumen.class);
        startActivity(intento2);
    }

    public void Masita(View view) {
        Intent intento1 = new Intent(this, Masa.class);
        startActivity(intento1);
    }

    public void transparenciadate(View view) {
        Intent intento6 = new Intent(this, Monedas.class);
        startActivity(intento6);
    }
}