package com.example.eduthon_aimers.Cyber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eduthon_aimers.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_cyber.view.*


class CyberFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_cyber, container, false)
        view.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        view.btnReport.setOnClickListener {
            findNavController().navigate(R.id.action_cyberFragment_to_complaintFragment)
        }
        view.btnSol.setOnClickListener {
            findNavController().navigate(R.id.action_cyberFragment_to_solutionFragment)
        }
        return view
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menuForm -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.don -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}