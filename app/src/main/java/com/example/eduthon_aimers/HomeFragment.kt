package com.example.eduthon_aimers

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        view.healthFragmentLaunch.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_healthFragment)


        }
        view.imageView6.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_cyberFragment)
        }
        view.imageView5.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_videoActivity)
        }
        view?.AimageView?.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_articleFragment)

        }
        view.yoga1.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_yogaFragment)
        }
        view.resFragmentLaunch.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_referenceFragment)
        }

        view.faqFragmentLaunch.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_faqsFragment)

        }
        //val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)
        view.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        return view
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menuForm -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.don -> {
                findNavController().navigate(R.id.action_homeFragment_to_donateFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
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