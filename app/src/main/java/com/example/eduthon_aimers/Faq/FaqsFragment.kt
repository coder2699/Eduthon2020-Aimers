package com.example.eduthon_aimers.Faq

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eduthon_aimers.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_faqs.view.*

class FaqsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_faqs, container, false)
        view.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        return view
    }private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menuForm -> {
                findNavController().navigate(R.id.action_faqsFragment_to_homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.don -> {
//                findNavController().navigate(R.id.)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}