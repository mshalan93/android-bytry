package com.example.bytar.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bytar.R
import com.example.bytar.ui.SettingActivity
import com.example.bytar.ui.homeScreen.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        //    bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

/*

        val navView=findViewById<BottomNavigationView>(R.id.nav_view)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration=AppBarConfiguration.Builder(
            R.id.homeFragment, R.id.shopFragment, R.id.datesFragment, R.id.messagesFragment,R.id.searchFragment
        )
            .build()
        val navController=Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(navView, navController)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            val id=destination.id
            when (id) {
                R.id.shopFragment -> Toast.makeText(
                    this,
                    "Dashboard",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
*/

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfigration = AppBarConfiguration(setOf(R.id.homeFragment,R.id.shopFragment,R.id.datesFragment,R.id.messagesFragment,R.id.searchFragment))
        setupActionBarWithNavController(navController,appBarConfigration)
        bottomNavigationView.setupWithNavController(navController)


    }


/*
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.myNavHostFragment)
        val appBarConfigration = AppBarConfiguration(setOf(R.id.homeFragment,R.id.shopFragment,R.id.datesFragment,R.id.messagesFragment,R.id.searchFragment))
        setupActionBarWithNavController(navController,appBarConfigration)
        bottomNavigationView.setupWithNavController(navController)
*/


    // create an action bar button
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.setting_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // setting button activities
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int=item.getItemId()
        if (id == R.id.mybutton) {
            // do something here
            val nextScreenIntent =Intent(this, SettingActivity::class.java)
            startActivity(nextScreenIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}
   /* private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId) {
            R.id.navigation_Home -> {
                val fragment =HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_Shop -> {
                val fragment = DatesFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_Dates -> {
                val fragment = ShopFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_Messages -> {
                val fragment = DatesFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_Search -> {
                val fragment = DatesFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
*/

