package com.example.bytar.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bytar.R
import com.example.bytar.ui.setting.SettingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		setSupportActionBar(toolbar)

		val bottomNavigationView=findViewById<BottomNavigationView>(R.id.nav_view)
		val navController=findNavController(R.id.nav_host_fragment)
		val appBarConfigration=AppBarConfiguration(
			setOf(
				R.id.homeFragment,
				R.id.shopFragment,
				R.id.datesFragment,
				R.id.messagesFragment,
				R.id.searchFragment
			)
		)
		setupActionBarWithNavController(navController, appBarConfigration)
		bottomNavigationView.setupWithNavController(navController)


	}


	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		menuInflater.inflate(R.menu.setting_menu, menu)
		return super.onCreateOptionsMenu(menu)
	}

	// setting button activities
	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		val id: Int=item.getItemId()
		if (id == R.id.settingBtn) {
			// do something here
			val nextScreenIntent=Intent(this, SettingActivity::class.java)
			startActivity(nextScreenIntent)
		}
		return super.onOptionsItemSelected(item)
	}
}

