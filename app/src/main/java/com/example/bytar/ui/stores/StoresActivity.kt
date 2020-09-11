package com.example.bytar.ui.stores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.viewpager.widget.ViewPager
import com.example.bytar.R
import com.example.bytar.ui.home.MainActivity
import com.example.bytar.ui.setting.SettingActivity
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class StoresActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stores)

        setSupportActionBar(toolbar)



        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        tabLayout.addTab(tabLayout.newTab().setText("متجر بيطري"))
        tabLayout.addTab(tabLayout.newTab().setText("تقديم الخدمة في مكان الحيوان"))

        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = MyAdapter(this, supportFragmentManager,
            tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {
            }
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // setting button activities
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int=item.getItemId()
        if (id == R.id.homeBtn) {
            // do something here
            val homeIntent=Intent(this, MainActivity::class.java)
            startActivity(homeIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}