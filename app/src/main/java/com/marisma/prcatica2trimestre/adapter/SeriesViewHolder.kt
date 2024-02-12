package com.marisma.prcatica2trimestre.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.marisma.prcatica2trimestre.Series
import com.marisma.prcatica2trimestre.databinding.ItemseriesBinding

class SeriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemseriesBinding.bind(view)

    fun render(serieModel: Series, onClickListener: (Series) -> Unit) {
        binding.tvSeriesName.text = serieModel.titulo
        binding.tvSeriesGenero.text = serieModel.genero

        // Assuming you have a library called Glide for image loading
        // You can replace null with the actual Glide instance
        // Also, make sure to add the necessary Glide dependencies to your build.gradle file

       // val glide = Glide.with(binding.ivSeries.context)
        //glide.load(serieModel.foto).into(binding.ivSeries)


        // Assuming you have a click listener for the image view
         //binding.ivSeries.setOnClickListener {
        //     // Your onClick logic here
         }

        // Assuming you have a click listener for the entire item view
         //itemView.setOnClickListener {
        //     // Your onClick logic here
         //}
    //}
}


