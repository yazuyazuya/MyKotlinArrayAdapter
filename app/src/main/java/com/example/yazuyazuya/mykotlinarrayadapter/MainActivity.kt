package com.example.yazuyazuya.mykotlinarrayadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private val texts = arrayOf("abc ", "bcd", "cde", "def", "efg",
            "fgh", "ghi", "hij", "ijk", "jkl", "klm", "lmn", "mno",
            "nop", "opq", "pqr", "qrs", "rst", "stu", "tuv", "uvw",
            "vwx", "wxy", "xyz")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val listView = ListView(this)
        setContentView(listView)

        // simple_list_item_1 は、 もともと用意されている定義済みのレイアウトファイルのID
        val arrayAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, texts)

        listView.setAdapter(arrayAdapter)

    }
}
