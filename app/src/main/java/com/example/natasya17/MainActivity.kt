package com.example.natasya17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tab = findViewById<TabLayout>(R.id.tablayout)
        var fragment : Fragment = BlankFragment()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()

        tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab!!.position) {
                    0 -> fragment = BlankFragment()
                    1 -> fragment = teknikotomotif()
                    2 -> fragment = kuliner()
                    3 -> fragment = perangkatlunak()
                    4 -> fragment = teknikpengelasan()
                }

                val fT = supportFragmentManager.beginTransaction()
                fT.replace(R.id.framelayout, fragment)
                fT.commit()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

        })
    }
}