package com.example.ejercicio_intento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val resultado = findViewById<TextView>(R.id.resultado)
        val promedio = findViewById<TextView>(R.id.promedio)
        var documento = findViewById<TextView>(R.id.documento)
        var nombre = findViewById<TextView>(R.id.nombre)
        var edad = findViewById<TextView>(R.id.edad)
        var telefono = findViewById<TextView>(R.id.telefono)
        var direccion = findViewById<TextView>(R.id.direccion)

        var btnSalir=findViewById<Button>(R.id.btnSalir)
        btnSalir.setOnClickListener { onClicksalir() }

        var nombreMateria1 = findViewById<TextView>(R.id.nombreMateria1)
        var notaMateria1 = findViewById<TextView>(R.id.notaMateria1)
        var nombreMateria2 = findViewById<TextView>(R.id.nombreMateria2)
        var notaMateria2 = findViewById<TextView>(R.id.notaMateria2)
        var nombreMateria3 = findViewById<TextView>(R.id.nombreMateria3)
        var notaMateria3 = findViewById<TextView>(R.id.notaMateria3)
        var nombreMateria4 = findViewById<TextView>(R.id.nombreMateria4)
        var notaMateria4 = findViewById<TextView>(R.id.notaMateria4)
        var nombreMateria5 = findViewById<TextView>(R.id.nombreMateria5)
        var notaMateria5 = findViewById<TextView>(R.id.notaMateria5)

        var bundle: Bundle? = this.intent.extras

        resultado.text="${bundle?.getString("resultado")}"
        promedio.text="${bundle?.getDouble("promedioF")}"
        documento.text="${bundle?.getString("documento")}"
        nombre.text="${bundle?.getString("nombre")}"
        edad.text="${bundle?.getInt("edad")}"
        telefono.text="${bundle?.getString("telefono")}"
        direccion.text="${bundle?.getString("direccion")}"
        nombreMateria1.text="${bundle?.getString("nombreMateria1")}"
        notaMateria1.text="${bundle?.getDouble("notaMateria1")}"
        nombreMateria2.text="${bundle?.getString("nombreMateria2")}"
        notaMateria2.text="${bundle?.getDouble("notaMateria2")}"
        nombreMateria3.text="${bundle?.getString("nombreMateria3")}"
        notaMateria3.text="${bundle?.getDouble("notaMateria3")}"
        nombreMateria4.text="${bundle?.getString("nombreMateria4")}"
        notaMateria4.text="${bundle?.getDouble("notaMateria4")}"
        nombreMateria5.text="${bundle?.getString("nombreMateria5")}"
        notaMateria5.text="${bundle?.getDouble("notaMateria5")}"


    }

    private fun onClicksalir() {
        var intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}