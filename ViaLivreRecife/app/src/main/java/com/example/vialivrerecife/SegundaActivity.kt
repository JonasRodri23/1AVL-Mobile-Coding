package com.example.vialivrerecife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vialivrerecife.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperaDados()

        binding.btnProximo.setOnClickListener { prosseguir() }
    }

    private fun recuperaDados() {
       val nome = intent.getStringExtra("nome")

        binding.user.setText(nome)
    }

    private fun prosseguir() {

        val intent = Intent(this, TerceiraActivity::class.java)

        startActivity(intent)
    }
}