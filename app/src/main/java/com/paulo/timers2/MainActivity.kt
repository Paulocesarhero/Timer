package com.paulo.timers2

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.wear.widget.WearableLinearLayoutManager
import androidx.wear.widget.WearableRecyclerView
import com.paulo.stoptimer.Tiempo
import com.paulo.stoptimer.TiemposAdapter
import com.paulo.timers2.databinding.ActivityMainBinding

class MainActivity : Activity() {

    var tiempos:List<Tiempo> = listOf(
        Tiempo(10,1),
        Tiempo(5,3),    Tiempo(10,1),
        Tiempo(5,3),    Tiempo(10,1),
        Tiempo(5,3),    Tiempo(10,1),
        Tiempo(5,3),    Tiempo(10,1),
        Tiempo(5,3),    Tiempo(10,1),
        Tiempo(5,3),    Tiempo(10,1),
        Tiempo(5,3),    Tiempo(10,1),
        Tiempo(5,3),    Tiempo(10,1),
        Tiempo(5,3)
    )
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        initRecyclerView()
        binding.lista.apply {
            layoutManager = WearableLinearLayoutManager(this@MainActivity)
            val adapter = TiemposAdapter(tiempos)
            binding.lista.adapter = adapter
        }

    }


}


