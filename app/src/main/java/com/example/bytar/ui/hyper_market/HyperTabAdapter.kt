package com.example.bytar.ui.hyper_market

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.bytar.ui.hyper_market.departs.AllDepartmentsFragment
import com.example.bytar.ui.hyper_market.departs.DepartmentFragment
import com.example.bytar.ui.stores.storetabs.ServiceInHomeFragment
import com.example.bytar.ui.stores.storetabs.StoresFragment

@Suppress("DEPRECATION")
internal class HyperTabAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                DepartmentFragment()
            }
            1 -> {
                AllDepartmentsFragment()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}