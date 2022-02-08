package com.raqueveque.doglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raqueveque.doglist.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogAdapter(private val images: List<String>): RecyclerView.Adapter<DogAdapter.DogViewHolder>() {
    class DogViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val binding = ItemDogBinding.bind(view)
        fun bind(image: String){
            Picasso.get().load(image).into(binding.ivDog)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}