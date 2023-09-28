package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Aplicación que muestra el típico ejemplo de Hola Mundo
 * @version 1.0
 * <ol>
 *     <li>Hemos visto como se crean los recursos en XML</li>
 *     <li>Hemos instanciado en Java un ojbeto TextView</li>
 *     <li>Se ha personalizado la imagen de la aplicación</li>
 *     <li>Comprobando que funciona nuestro control de versiones</li>
 * </ol>
 */

// el / con dos ** es para el javadoct, la documentacion de muestra aplicacion
public class MainActivity extends AppCompatActivity {
    private TextView tvMessageStart;
    private TextView tvMessageEnd;

    // TODO esto es un comentario para ver como se genera el comentario todo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessageStart=findViewById(R.id.tvMessageStart);
        tvMessageStart.setTextColor(getColor(R.color.white));   // esto equivale a android:text="@string/tvMessageStartText"
        //tvMessageEnd.setText();
    }
}
// ctrl+q : seleccionar un método o algo para ver ayuda