package com.example.app3

import android.view.LayoutInflater
import android.view.SurfaceControl
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class transactionAdapter(private val transactionList: ArrayList<SurfaceControl.Transaction>)
    : RecyclerView.Adapter<transactionAdapter.TransactionViewHolder>(){

    class TransactionViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item , parent ,false)
        return TransactionViewHolder(view)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction = transactionList[position]
        holder.imageView.setImageResource(transaction.image)
        holder.textView.text = transaction.name
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }
}