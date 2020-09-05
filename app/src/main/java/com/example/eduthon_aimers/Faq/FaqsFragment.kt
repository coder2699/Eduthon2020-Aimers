package com.example.eduthon_aimers.Faq

import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eduthon_aimers.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_faqs.*
import kotlinx.android.synthetic.main.fragment_faqs.view.*

class FaqsFragment : Fragment() {
    var QuestionAnswerList = mutableListOf(
        FaqQuesAns(//Done
            "How Do Students Interact in an Online Course?",
            "Students may otherwise communicate through discussion forums, social media and – particularly for group work – videoconferencing, as well as phone and email."

        ),
        FaqQuesAns( //Done
            "What Should Students Know Before Enrolling in an Online Course?",
            "Prospective students looking for how to start online college should visit the admissions page for the school. They should also understand the requirements for the degree program of interest to them, considering that there may be a higher threshold for certain majors compared with general admissions, experts recommend \n" +
                    "While the registration process for online and on-campus classes is often similar, prospective online students should review the course type and requirements before enrolling, experts say. They should also understand the requirements for dropping classes."
        ),
        FaqQuesAns( //Done
            "How Do Students Take Proctored Exams in Online Classes?",
            "Not all online classes have proctored exams. But if they do, online students may need to visit a local testing site with an on-site proctor. They may also take virtually monitored exams online, where a proctor watches via webcam or where computer software detects cheating by checking test-takers' screens.\n" +
                    "With more classes likely online in fall 2020, experts expect an uptick in online exam proctoring."
        ),
        FaqQuesAns(//Done
            "What Are Typical Assignments in Online Classes?",
            "Online course assignments depend largely on the discipline. But in general, students should expect assignments similar to those in on-ground programs, such as research papers and proctored exams in addition to online-specific assignments such as responding to professor-posed questions in a discussion board."
        ),
        FaqQuesAns(//Done
            "Do Online Classes Have In-Person Components?",
            "Some online classes may require students to attend a residency on the school's campus before or during the program. The lengths and details of these requirements vary.\n" +
                    "Students may complete team-building activities, network and attend informational sessions. Especially in health fields like nursing, certain online programs may require working in a clinical setting."
        ),
        FaqQuesAns(//Done
            "Do Students Need to Attend Classes at Specific Times?",
            "Online classes typically have an asynchronous, or self-paced, portion. Students complete coursework on their own time but still need to meet weekly deadlines, a format that offers flexibility for students.\n" +
                    "Some online courses may also have a synchronous component, where students view live lectures online and sometimes participate in discussions through videoconferencing platforms such as Zoom. "
        ),
        FaqQuesAns(//Done
            "How do I know if online education is right for me?",
            "Choosing the right degree program takes time and careful research no matter how one intends to study. Learning styles, goals, and programs always vary, but students considering online colleges must consider technical skills, ability to self-motivate, and other factors specific to the medium. A number of colleges and universities have developed assessments to help prospective students determine whether they are prepared for online learning. "
        ),
        FaqQuesAns(//Done
            "Is a Hybrid class the same as an online class?",
            "Hybrid classes are face-to-face classes that meet partially in the classroom and partially online. This generally means that you will meet less frequently on campus, and do a portion of your work in one of our online systems. Hybrid is not the same thing as an 'online class', because you have to actually come to an NWACC classroom at a scheduled time."
        )
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_faqs, container, false)
        view.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        return view
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menuForm -> {
                findNavController().navigate(R.id.action_faqsFragment_to_homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.don -> {
                findNavController().navigate(R.id.action_faqsFragment_to_donateFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter =
                contentAdapter(QuestionAnswerList)
        }
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
