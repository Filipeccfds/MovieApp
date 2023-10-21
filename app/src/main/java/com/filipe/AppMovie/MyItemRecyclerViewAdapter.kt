package com.filipe.AppMovie

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import com.filipe.AppMovie.placeholder.PlaceholderContent.PlaceholderItem
import com.filipe.AppMovie.databinding.FragmentItemBinding

interface MovieListener{
    fun onItemSelected(position: Int)
}

class MyItemRecyclerViewAdapter(
    private val values: List<PlaceholderItem>,
    private val listener: MovieListener
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]

        holder.btn.setOnClickListener {
            listener.onItemSelected(position)
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val view: View = binding.root
        val btn: Button = binding.buttonDetails


    }

}