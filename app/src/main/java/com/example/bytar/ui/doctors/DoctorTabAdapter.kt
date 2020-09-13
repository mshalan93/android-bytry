package com.example.bytar.ui.doctors

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.bytar.ui.doctors.doctor_specilication.AllSpecilizationFragment
import com.example.bytar.ui.doctors.doctor_specilication.DogsFragment
import com.example.bytar.ui.hyper_market.departs.AllDepartmentsFragment
import com.example.bytar.ui.hyper_market.departs.DepartmentFragment
import com.example.bytar.ui.stores.storetabs.ServiceInHomeFragment
import com.example.bytar.ui.stores.storetabs.StoresFragment

@Suppress("DEPRECATION")
internal class DoctorTabAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                DogsFragment()
            }
            1 -> {
                AllSpecilizationFragment()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}