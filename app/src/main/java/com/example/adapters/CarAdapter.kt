package com.example.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.manuelexample.R
import com.example.models.Car

class CarAdapter(private val contextAdapter: Context, private val cars: List<Car>) :
    ArrayAdapter<Car>(contextAdapter, R.layout.item_car, cars) {

    override fun getCount(): Int = cars.size

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val currentCar = cars[position]
        val itemView = if (convertView == null) {
            // crear una nueva vista
            val inflater = LayoutInflater.from(contextAdapter)
            inflater.inflate(R.layout.item_car, parent, false)
        } else {
            convertView
        }

        val carImage = itemView.findViewById<ImageView>(R.id.imageCar)
        carImage.setImageResource(currentCar.image)

        val carName = itemView.findViewById<TextView>(R.id.nameCar)
        carName.text = currentCar.name

        val carBrand = itemView.findViewById<TextView>(R.id.brandCar)
        carBrand.text = contextAdapter.getString(R.string.brand_car, currentCar.brand)

        val carModel = itemView.findViewById<TextView>(R.id.modelCar)
        carModel.text = contextAdapter.getString(R.string.model_car, currentCar.model)

        return itemView
    }
}