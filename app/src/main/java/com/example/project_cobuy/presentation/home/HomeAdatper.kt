package com.example.project_cobuy.presentation.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.project_cobuy.R
import com.example.project_cobuy.data.entity.ProductEntity
import com.example.project_cobuy.databinding.ItemHomeBinding

class HomeAdatper(
    val onClick: (ProductEntity) -> Unit
) : ListAdapter<ProductEntity, HomeAdatper.ViewHolder>(diffUtil) {


    inner class ViewHolder(var binding: ItemHomeBinding) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("ResourceAsColor")
        fun bind(product: ProductEntity) {

            binding.categoryTextView.text = product.category
            binding.titleTextView.text = product.name
            binding.priceTextView.text = product.price


            when (product.category) {
                "음료" -> {
                    binding.categoryTextView.setTextColor(R.color.green)
                    binding.imageView.setImageResource(R.drawable.ic_baseline_emoji_food_beverage_24)
                }
                "식품" -> {
                    binding.categoryTextView.setTextColor(R.color.red)
                    binding.imageView.setImageResource(R.drawable.ic_baseline_fastfood_24)
                }
                "디지털/가전" -> {
                    binding.categoryTextView.setTextColor(com.facebook.R.color.com_facebook_button_background_color)
                    binding.imageView.setImageResource(R.drawable.ic_baseline_computer_24)
                }

            }

            binding.root.setOnClickListener {

                onClick(product)
            }
        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdatper.ViewHolder {

        val binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeAdatper.ViewHolder, position: Int) {


        holder.bind(currentList[position])
    }


    companion object {

        val diffUtil = object : DiffUtil.ItemCallback<ProductEntity>() {
            override fun areItemsTheSame(oldItem: ProductEntity, newItem: ProductEntity): Boolean {

                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: ProductEntity,
                newItem: ProductEntity
            ): Boolean {


                return oldItem == newItem
            }

        }

    }
}