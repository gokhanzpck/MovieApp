package com.gokhanzopcuk.appfilm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.gokhanzopcuk.appfilm.databinding.ActivityMainBinding
import com.gokhanzopcuk.appfilm.fragment.HomePageFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       val menuInflater=menuInflater
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.aa){
            val intent=Intent(this@MainActivity,MainActivity::class.java)
            startActivity(intent)

        }

        return super.onOptionsItemSelected(item)
    }
}