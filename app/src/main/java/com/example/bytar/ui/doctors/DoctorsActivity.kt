package com.example.bytar.ui.doctors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.example.bytar.R
import com.example.bytar.databinding.ActivityDoctorsBinding
import com.example.bytar.ui.home.MainActivity
import com.example.bytar.ui.stores.MyAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class DoctorsActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    private lateinit var binding : ActivityDoctorsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = DataBindingUtil.setContentView(this , R.layout.activity_doctors)

        setSupportActionBar(toolbar)
        getSupportActionBar()?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar()?.setCustomView(R.layout.stores_toolbar);



        tabLayout = binding.tabLayout
        viewPager = binding.viewPager

        tabLayout.addTab(tabLayout.newTab().setText("كلاب"))
        tabLayout.addTab(tabLayout.newTab().setText("كل الاقسام"))

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


        /*      binding.homeIc.setOnClickListener {
                  val nextScreenIntent =Intent(this, MainActivity::class.java)
                  startActivity(nextScreenIntent)
              }*/
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
            val nextScreenIntent =Intent(this, MainActivity::class.java)
            startActivity(nextScreenIntent)

        }
        return super.onOptionsItemSelected(item)
    }
}