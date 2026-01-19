package es.cursojava.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Solo inflamos el layout activity_main
        setContentView(R.layout.botones_radio);

        TextView miTexto = findViewById(R.id.textoMuestraDia);
        RadioGroup grupoDeDiasSemana = findViewById(R.id.DiasSemana);

        Log.d("Texto: ", miTexto.getText().toString());


        grupoDeDiasSemana.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton seleccionado = findViewById(checkedId);
                String dia = seleccionado.getText().toString();
                miTexto.setText("Pulsado " + dia);
                miTexto.setTextColor(getResources().getColor(R.color.rojo));
            }
        });




    }


}
