package es.cursojava.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class practica_permisos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lista de permisos
        String[] permisos = {
                Manifest.permission.INTERNET,
                Manifest.permission.READ_CONTACTS,
                Manifest.permission.WRITE_CONTACTS,
                Manifest.permission.SEND_SMS,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.BLUETOOTH,
                Manifest.permission.CAMERA
        };

        // Solicitar permisos
        ActivityCompat.requestPermissions(this, permisos, 100);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100) {
            for (int i = 0; i < permissions.length; i++) {
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    // Permiso aceptado
                    if (permissions[i].equals(Manifest.permission.CAMERA)) {
                        System.out.println("✅ Cámara aceptada");
                    }
                    if (permissions[i].equals(Manifest.permission.READ_CONTACTS)) {
                        System.out.println("✅ Lectura de contactos aceptada");
                    }
                    if (permissions[i].equals(Manifest.permission.WRITE_CONTACTS)) {
                        System.out.println("✅ Escritura de contactos aceptada");
                    }
                    if (permissions[i].equals(Manifest.permission.SEND_SMS)) {
                        System.out.println("✅ SMS aceptado");
                    }
                    if (permissions[i].equals(Manifest.permission.ACCESS_COARSE_LOCATION)) {
                        System.out.println("✅ Localización aproximada aceptada");
                    }
                    if (permissions[i].equals(Manifest.permission.ACCESS_FINE_LOCATION)) {
                        System.out.println("✅ Localización precisa aceptada");
                    }
                    if (permissions[i].equals(Manifest.permission.BLUETOOTH)) {
                        System.out.println("✅ Bluetooth aceptado");
                    }
                    if (permissions[i].equals(Manifest.permission.INTERNET)) {
                        System.out.println("✅ Internet aceptado");
                    }
                } else {
                    // Permiso denegado
                    System.out.println("❌ Permiso denegado: " + permissions[i]);
                }
            }
        }
    }

}
