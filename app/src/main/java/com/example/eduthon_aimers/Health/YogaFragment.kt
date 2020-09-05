package com.example.eduthon_aimers.Health

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eduthon_aimers.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_reference.view.*

class YogaFragment : Fragment() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menuForm -> {
                findNavController().navigate(R.id.action_yogaFragment_to_homeFragment)

                return@OnNavigationItemSelectedListener true
            }
            R.id.don -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_yoga, container, false)
        view.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        return view
    }
    override fun onResume() {
        super.onResume()
        activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
    override fun onPause() {
        super.onPause()
        activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR
    }
}