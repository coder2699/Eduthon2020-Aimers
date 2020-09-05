package com.example.eduthon_aimers

import android.content.Intent
import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_reference.view.*

class ReferenceFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_reference, container, false)
        view.btnzoom.setOnClickListener{
            var intent =  Intent (Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=us.zoom.videomeetings"))
            startActivity(intent)
        }
        view.btnsoft.setOnClickListener{
            var intent =  Intent (Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.microsoft.teams"))
            startActivity(intent)
        }
        view.btnGmeet.setOnClickListener{
            var intent =  Intent (Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.meetings"))
            startActivity(intent)
        }
        view.btnClass.setOnClickListener{
            var intent =  Intent (Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.classroom"))
            startActivity(intent)
        }
        view.btnJmeet.setOnClickListener{
            var intent =  Intent (Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.jio.rilconferences"))
            startActivity(intent)
        }
        view.btnCisco.setOnClickListener{
            var intent =  Intent (Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.cisco.webex.meetings"))
            startActivity(intent)
        }
        view.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        return view
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menuForm -> {
                findNavController().navigate(R.id.action_referenceFragment_to_homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.don -> {
                findNavController().navigate(R.id.action_referenceFragment_to_donateFragment)
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