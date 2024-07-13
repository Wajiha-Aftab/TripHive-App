package com.example.triphive

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val Places: ArrayList<dataClass>) :
    RecyclerView.Adapter<Adapter.ContactViewHolder>() {

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView? = itemView.findViewById(R.id.places_images)
        val placesNameTextView: TextView? = itemView.findViewById(R.id.placesName_textView)
        val descriptionTextView: TextView? = itemView.findViewById(R.id.description_textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return Places.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val place = Places[position]
        holder.placesNameTextView?.text = place.placeName
        holder.descriptionTextView?.text = place.description
        holder.imageView?.setImageResource(place.imageResourceId)
    }
}