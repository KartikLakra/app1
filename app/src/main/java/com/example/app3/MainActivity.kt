package com.example.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceControl
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var  recyclerView: RecyclerView
    private lateinit var transactionList : ArrayList<SurfaceControl.Transaction>
    private lateinit var transactionAdapter: transactionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager( this)

        transactionList = ArrayList()


        transactionList.add(transaction(R.drawable.shopping_img , "shopping"))
        transactionList.add(transaction(R.drawable.education_img , "education"))
        transactionList.add(transaction(R.drawable.medicine_img , "medicine"))

        transactionAdapter = transactionAdapter(transactionList)
        recyclerView.adapter = transactionAdapter
    }
}