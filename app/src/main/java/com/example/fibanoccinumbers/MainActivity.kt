package com.example.fibanoccinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fibanocciAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: fibanocciAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.tvnumber)
        adapter = fibanocciAdapter(getFibonacciNumbers())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun getFibonacciNumbers(): List<Int> {
        val fibonacciNumbers = mutableListOf(0, 1)
        for (i in 2 until 100) {
            val nextNumber = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2]
            fibonacciNumbers.add(nextNumber)
        }
        return fibonacciNumbers
    }
}