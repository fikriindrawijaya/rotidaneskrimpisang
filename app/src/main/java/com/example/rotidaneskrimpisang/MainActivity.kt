package com.example.rotidaneskrimpisang

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtnama = findViewById<EditText>(R.id.editnama)
        val edtalamat = findViewById<EditText>(R.id.editalamat)
        val edtnotelepon = findViewById<EditText>(R.id.editnotelepon)
        val edttanggallahir = findViewById<EditText>(R.id.edittanggallahir)
        val edtasaldaerah = findViewById<EditText>(R.id.editasaldaerah)
        val edtasalprovinsi = findViewById<EditText>(R.id.editasalprovinsi)
        val rblaki = findViewById<RadioButton>(R.id.rblaki)
        val rbperempuan = findViewById<RadioButton>(R.id.rbperempuan)
        val txtnama = findViewById<TextView>(R.id.txtnama)
        val txtalamat = findViewById<TextView>(R.id.txtalamat)
        val txtnotelepon = findViewById<TextView>(R.id.txtnotelepon)
        val txttanggallahir = findViewById<TextView>(R.id.txttanggallahir)
        val txtgender = findViewById<TextView>(R.id.txtgender)
        val txtasaldaerah = findViewById<TextView>(R.id.txtasaldaerah)
        val txtasalprovinsi = findViewById<TextView>(R.id.txtasalprovinsi)
        val btntampil = findViewById<Button>(R.id.btntampil)


        btntampil.setOnClickListener {

            val nama = edtnama.text.toString()
            txtnama.text = "Nama anda adalah " + nama
            val alamat = edtalamat.text.toString()
            txtalamat.text = "alamat anda adalah " + alamat
            val notelepon = edtnotelepon.text.toString()
            txtnotelepon.text = "notelepon anda adalah " + notelepon
            val tanggallahir= edttanggallahir.text.toString()
            txttanggallahir.text = "tanggallahir anda adalah " + tanggallahir
            val asaldaerah = edtasaldaerah.text.toString()
            txtasaldaerah.text = "asaldaerah anda adalah " + asaldaerah
            val asalprovinsi = edtasalprovinsi.text.toString()
            txtasalprovinsi.text = "asalprovinsi  anda adalah " + asalprovinsi

            if (rblaki.isChecked) {
                val gender = "laki laki"
                txtgender.text = "gender anda adalah " + gender
            } else {
                val gender = "perempuan"
                txtgender.text = "gender anda adalah " + gender
            }

        }




    }

}                                     