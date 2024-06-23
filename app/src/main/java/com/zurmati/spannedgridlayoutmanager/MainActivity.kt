package com.zurmati.spannedgridlayoutmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zurmati.spannedgridlayoutmanager.SpannedGridLayoutManager.SpanInfo
import com.zurmati.spannedgridlayoutmanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val allItems = getAllItems()
        val adapter = GridAdapter(allItems)
        val manager =
            SpannedGridLayoutManager({ position ->
                if (allItems[position] is String)
                    SpanInfo(2, 3)
                else
                    SpanInfo(4, 6)
            }, 8, 1f)


        binding.recyclerItems.layoutManager = manager
        binding.recyclerItems.adapter = adapter
    }

    private fun getAllItems(): ArrayList<Any> {
        return arrayListOf(
            2,
            "2",
            "2",
            "2",
            "2",
            "2",
            "2",
            "2",
            "2",
            2,
            2,
            "2",
            "2",
            "2",
            2,
            "2",
            "2",
            "2",
            "2"
        )
    }
}