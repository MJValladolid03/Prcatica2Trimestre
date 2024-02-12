package com.marisma.prcatica2trimestre.adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marisma.prcatica2trimestre.R
import com.marisma.prcatica2trimestre.Series

class SeriesAdapter(private val listaSeries: List<Series>, private val onClickListener: (Series) -> Unit) : RecyclerView.Adapter<SeriesViewHolder>(),
    Parcelable {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.itemseries, parent, false)
        return SeriesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaSeries.size
    }

    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        holder.render(listaSeries[position], onClickListener)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SeriesAdapter> {
        val listaSeries: List<Series>
            get() {
                TODO()
            }

        override fun createFromParcel(parcel: Parcel): SeriesAdapter {
            return SeriesAdapter(parcel)
        }

        private fun SeriesAdapter(listaSeries: Parcel): SeriesAdapter {
            TODO("Not yet implemented")
        }

        override fun newArray(size: Int): Array<SeriesAdapter?> {
            return arrayOfNulls(size)
        }
    }
}

