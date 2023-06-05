package com.ritikcoder.project8ofandroiddev_intentdataparsingscreentoscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //creation key
    companion object{
        const val KEY= "com.ritikcoder.project8ofandroiddev_intentdataparsingscreentoscreen.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPlaceOrder: Button = findViewById(R.id.buttonForPlaceOrder)
        val editText1: EditText = findViewById(R.id.editTextTextForOrder1)
        val editText2: EditText = findViewById(R.id.editTextTextForOrder2)
        val editText3: EditText = findViewById(R.id.editTextTextForOrder3)
        val editText4: EditText = findViewById(R.id.editTextTextForOrder4)

        buttonPlaceOrder.setOnClickListener(){
            Toast.makeText(this, "Order Placed successfully.", Toast.LENGTH_SHORT).show()
            val orderList= editText1.text.toString()+ "\n2 :- "+ editText2.text.toString()+ "\n3 :- "+
                    editText3.text.toString()+ "\n4 :- "+ editText4.text.toString()

            intent= Intent(this, ActivityShowOrder::class.java)
            intent.putExtra(KEY, orderList)
            startActivity(intent)
        }

    }
}