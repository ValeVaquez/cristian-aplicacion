package com.example.ejercicio_intento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class Estudiante : AppCompatActivity() {

    var documento:String?=null
    var nombre:String?=null
    var edad:Int?=null
    var telefono:String?=null
    var direccion:String?=null

    var nombreMateria1: String?=null
    var notaMateria1: Double?=null
        set(value) {
            if (value != null) {
                if (value>=0){
                    field=value
                }else{
                    field=0.0
                }
            }else{
                field=0.0
            }
        }
    var nombreMateria2: String?=null
    var notaMateria2: Double?=null
        set(value) {
            if (value != null) {
                if (value>=0){
                    field=value
                }else{
                    field=0.0
                }
            }else{
                field=0.0
            }
        }
    var nombreMateria3: String?=null
    var notaMateria3: Double?=null
        set(value) {
            if (value != null) {
                if (value>=0){
                    field=value
                }else{
                    field=0.0
                }
            }else{
                field=0.0
            }
        }
    var nombreMateria4: String?=null
    var notaMateria4: Double?=null
        set(value) {
            if (value != null) {
                if (value>=0){
                    field=value
                }else{
                    field=0.0
                }
            }else{
                field=0.0
            }
        }
    var nombreMateria5: String?=null
    var notaMateria5: Double?=null
        set(value) {
            if (value != null) {
                if (value>=0){
                    field=value
                }else{
                    field=0.0
                }
            }else{
                field=0.0
            }
        }

    var resultado: String?=null
    var promedioFinal: Double?=null
        set(value) {
            if (value != null) {
                if (value<=3.5) {
                    var recuperacion: Boolean? = null
                    if (value<=2.5){
                        recuperacion=false
                    }else{
                        recuperacion=true
                    }
                }
            }
            field = value
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}