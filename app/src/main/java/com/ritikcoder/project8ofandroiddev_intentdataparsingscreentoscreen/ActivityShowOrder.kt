package com.ritikcoder.project8ofandroiddev_intentdataparsingscreentoscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityShowOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_order)

        val ordersOfCustomers= intent.getStringExtra(MainActivity.KEY)
        val textViewShowOrder: TextView = findViewById(R.id.textViewForShowOrder)
        val additionInformation: String= "Order Placed : "

        textViewShowOrder.text= "\tOrder Placed\n\n1 :- "+ ordersOfCustomers.toString()

    }
}