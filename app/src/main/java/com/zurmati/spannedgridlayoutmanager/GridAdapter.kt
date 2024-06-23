package com.zurmati.spannedgridlayoutmanager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zurmati.spannedgridlayoutmanager.databinding.LayoutGridItemBinding

class GridAdapter(private val grids: ArrayList<Any>) :
    RecyclerView.Adapter<GridAdapter.GridViewHolder>() {
    class GridViewHolder(binding: LayoutGridItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        return GridViewHolder(
            LayoutGridItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = grids.size

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {

    }
}