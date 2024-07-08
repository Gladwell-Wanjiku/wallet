package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter(var walletList: List<Wallet>)
    :RecyclerView.Adapter<WalletViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet_details,parent,false)
        return  WalletViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val book = walletList[position]
        holder.tvOne.text = book.bill
        holder.tvTwo.text = book.amount
    }

    override fun getItemCount(): Int {
        return walletList.size
    }
}



class  WalletViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvOne = itemView.findViewById<TextView>(R.id.tvOne)
    var tvTwo = itemView.findViewById<TextView>(R.id.tvTwo)
    var tvThree = itemView.findViewById<TextView>(R.id.tvThree)
    var tvFour = itemView.findViewById<TextView>(R.id.tvFour)
}