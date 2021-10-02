package com.example.motionlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.databinding.CardViewDesignBinding

class CardAdapter(private val mList: List<PostModel>) :RecyclerView.Adapter<CardAdapter.CardViewHolder>() {



    inner class CardViewHolder(val binding: CardViewDesignBinding) :RecyclerView.ViewHolder(binding.root){



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {

        val binding = CardViewDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        with(holder   ){
            with(mList[position]){
                holder.binding.itemImage.setImageResource(this.image)
                holder.binding.itemName.text=this.name
            }
        }
     }

    override fun getItemCount(): Int {
        return mList.size
     }
}