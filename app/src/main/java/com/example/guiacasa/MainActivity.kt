 package com.example.guiacasa

 import androidx.appcompat.app.AppCompatActivity
 import android.os.Bundle
 import android.widget.Button
 import android.widget.EditText

 class MainActivity : AppCompatActivity() {

     private lateinit var txtNombre : EditText
     private lateinit var btnAceptar : Button

     override fun onCreate(savedInstanceState: Bundle?) {

         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         //Obtenemos una referencia a los controles de la interfaz

         txtNombre = findViewById(R.id.txtNombre)
         btnAceptar = findViewById(R.id.btnAceptar)
     }
 }