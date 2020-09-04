package com.example.eduthon_aimers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        view.buttonFAQ.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_faqsFragment)
        }
        view.buttonHealth.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_healthFragment)
        }
        view.buttonRef.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_referenceFragment)
        }
        view.buttonArticle.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_articleFragment)
        }
        view.buttonCyber.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_cyberFragment)
        }

        return view
    }

}