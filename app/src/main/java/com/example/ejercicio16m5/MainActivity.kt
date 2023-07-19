package com.example.ejercicio16m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.ejercicio16m5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val List1= binding.List1
        val arrayAdapter: ArrayAdapter<String>
        val Country = mutableListOf("Argentina", "Chile","Paraguay", "Bolivia", "Peru","Ecuador","Brasil", "Colombia","Venezuela","Uruguay")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,Country)
        List1.adapter = arrayAdapter

        List1.setOnItemClickListener() { parent, view, position, id ->
            val item = Country[position]

            if (item == "Argentina"){    binding.TV1.text = getText(R.string.Argentina)}
            if (item == "Chile"){        binding.TV1.text =     getText(R.string.Chile)}
            if (item == "Paraguay"){     binding.TV1.text =  getText(R.string.Paraguay)}
            if (item == "Bolivia"){      binding.TV1.text =   getText(R.string.Bolivia)}
            if (item == "Peru"){         binding.TV1.text =      getText(R.string.Peru)}
            if (item == "Ecuador"){      binding.TV1.text =   getText(R.string.Ecuador)}
            if (item == "Brasil"){       binding.TV1.text =    getText(R.string.Brasil)}
            if (item == "Colombia"){     binding.TV1.text =  getText(R.string.Colombia)}
            if (item == "Venezuela"){    binding.TV1.text = getText(R.string.Venezuela)}
            if (item == "Uruguay"){      binding.TV1.text =   getText(R.string.Uruguay)}
        }

    }
}