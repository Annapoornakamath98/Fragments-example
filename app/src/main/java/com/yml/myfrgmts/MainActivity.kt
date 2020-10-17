package com.yml.myfrgmts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var button1:Button
private lateinit var button2:Button
private lateinit var button3:Button
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.btnFragment1)
        button2=findViewById(R.id.btnFragment2)
        button3=findViewById(R.id.allSongs)
        val firstFragment=FirstFragment()
        val secondFragment= SearchUpdateFragment()
        val thirdFragment= DisplayFragment()
        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        button2.setOnClickListener {
            supportFragmentManager
                    .beginTransaction()
                    .apply {
                        replace(R.id.flFragment,secondFragment)
                        addToBackStack(null)
                        commit()
                    }
        }
        button3.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .apply {
                    replace(R.id.flFragment,thirdFragment)
                    addToBackStack(null)
                    commit()
                }
        }

    }
}