package com.akirachix.enwallet

import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter(var walletList: List<Wallet>)




class  WalletViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvOne = itemView.findViewById<TextView>(R.id.tvOne)
    var tvTwo = itemView.findViewById<TextView>(R.id.tvTwo)
    var tvThree = itemView.findViewById<TextView>(R.id.tvThree)
    var tvFour = itemView.findViewById<TextView>(R.id.tvFour)
}