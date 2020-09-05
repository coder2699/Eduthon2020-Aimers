package com.example.eduthon_aimers

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eduthon_aimers.Health.BackFragment
import com.example.eduthon_aimers.Health.EyesFragment
import com.example.eduthon_aimers.Health.WaterFragment
import com.example.eduthon_aimers.Health.YogaFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_health.view.*

class HealthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_health, container, false)
        view.EyesStrainView.setOnClickListener {

            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.healthContainer, EyesFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        view.BackStrainView.setOnClickListener {
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.healthContainer, BackFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        view.waterConsumptionView.setOnClickListener {
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.healthContainer, WaterFragment())
            transaction.addToBackStack(null)
            transaction.commit()

        }
        view.yogaView.setOnClickListener {

            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.healthContainer, YogaFragment())
            transaction.addToBackStack(null)
            transaction.commit()

        }

        view.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        return view
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menuForm -> {
                findNavController().navigate(R.id.action_healthFragment_to_homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.don -> {
//                findNavController().navigate(R.id.)
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