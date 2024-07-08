package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        displayWallet()

    }

    fun displayWallet(){
        val wallet1 = Wallet("Salary", "KES 40,000")
        var wallet2 = Wallet("Rent", "KES 7,000")
        var wallet3 = Wallet("Dividends", "KES 5,000")
        var wallet4 = Wallet("Electricity", "KES 16,000")
        var wallet5 = Wallet("Internet", "KES 1,000")
        var wallet6 = Wallet("Shopping", "KES 3,000")
        var wallet7 = Wallet("Bus fare", "KES 500")
        var wallet8 = Wallet("Water bill", "KES 35,000")
        var myWallet = listOf(wallet1, wallet2, wallet3, wallet4, wallet5, wallet6, wallet7, wallet8)
        val walletAdapter = WalletAdapter(myWallet)
        binding.rvWallet.adapter = walletAdapter
    }
}