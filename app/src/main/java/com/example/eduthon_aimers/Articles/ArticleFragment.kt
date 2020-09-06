package com.example.eduthon_aimers.Articles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eduthon_aimers.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_article.view.*

class ArticleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_article, container, false)
        view.ah1.setOnClickListener {
            //val transaction = requireActivity().supportFragmentManager.beginTransaction()
            // Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
            //fragwebView?.loadUrl("https://www.youtube.com/")
            val bundle = Bundle()
            bundle.putString("URL","https://www.techrepublic.com/article/zoom-vs-microsoft-teams-google-meet-cisco-webex-and-skype-choosing-the-right-video-conferencing-apps-for-you/" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view.ah2.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://www.gooverseas.com/blog/teaching-english-online" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view.ah3.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://elearningindustry.com/10-best-practices-effective-online-teacher" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view.ah4.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://blog.wiziq.com/tech-tools-for-online-teaching/" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view.ah5.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://www.teachaway.com/blog/increase-engagement-in-online-classroom" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view.ah6.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://elearningindustry.com/7-tips-prepare-for-teaching-online" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view.ah7.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://www.geteducated.com/elearning-education-blog/5-best-mobile-apps-that-help-you-teach-online/" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view.ah8.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://www.socialsciencespace.com/2020/03/16-answers-to-your-questions-about-teaching-online/" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view?.ah?.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://elearningindustry.com/5-strategies-improve-your-online-teaching" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view?.ah9?.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://www.caiteelizabeth.com/equipment-online-teaching/" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view?.ah10?.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://www.3plearning.com/blog/7-essential-online-teaching-strategies-teachers-new-distance-learning/" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view?.ah11?.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("URL","https://www.oxfordtefl.com/blog/teaching-online-what-hardware-and-software-do-you-need" )
            val mainFragment : WebViewFragment =
                WebViewFragment()
            mainFragment.arguments = bundle
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.artfrag, mainFragment)?.addToBackStack(null)
                ?.commit()
        }
        view.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        return view
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menuForm -> {
                findNavController().navigate(R.id.action_articleFragment_to_homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.don -> {
                findNavController().navigate(R.id.action_articleFragment_to_donateFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}