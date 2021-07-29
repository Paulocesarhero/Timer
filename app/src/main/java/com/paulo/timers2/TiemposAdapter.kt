package com.paulo.stoptimer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paulo.timers2.R
import kotlinx.android.synthetic.main.item_timer.view.*

class TiemposAdapter(private val listaTiempos: List<Tiempo>) : RecyclerView.Adapter<TiemposAdapter.TiemposHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TiemposHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return TiemposHolder(layoutInflater.inflate(R.layout.item_timer,parent,false))

    }

    override fun onBindViewHolder(holder: TiemposHolder, position: Int) {
        holder.render(listaTiempos[position])
    }

    override fun getItemCount(): Int = listaTiempos.size
    class TiemposHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(tiempo: Tiempo){
            val minutos = tiempo.minutos.toString()
            val segundos = tiempo.segundos.toString()
            view.tiempo.text = "$minutos $segundos"

        }

    }


}
