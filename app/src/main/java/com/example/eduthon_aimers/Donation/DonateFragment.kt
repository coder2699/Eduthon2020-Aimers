package com.example.eduthon_aimers.Donation

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.example.eduthon_aimers.R
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.dialog_donor.view.*
import kotlinx.android.synthetic.main.fragment_donate.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import java.lang.Exception

class DonateFragment : Fragment() {

    private val donorCollectionRef = Firebase.firestore.collection("Donor")
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_donate, container, false)
        // Inflate the layout for this fragment
//        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()

        view.make.setOnClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_donor, null)
            val mBuilder = AlertDialog.Builder(requireContext())
                .setView(mDialogView)
                .setTitle("Make Donation Form")
            val  mAlertDialog = mBuilder.show()

            mDialogView.dialogCancelBtn.setOnClickListener {

                mAlertDialog.dismiss()
            }

            mDialogView.dialogLoginBtn.setOnClickListener {
                val name= mDialogView.dialogNameEt.text.toString()
                val email = mDialogView.dialogEmailEt.text.toString()
                val phone= mDialogView.abc2.text.toString().toLong()
                val address= mDialogView.abc.text.toString()
                val city =mDialogView.abc4.text.toString()
                val state= mDialogView.abc5.text.toString()
                val pincode= mDialogView.abc1.text.toString().toInt()
                val item = mDialogView.abc3.text.toString()
                if(name != null && email != null && phone != null &&address != null && city != null && state != null && pincode != null && item != null) {
                    val donor = Donor(
                        name,
                        email,
                        phone,
                        address,
                        city,
                        state,
                        pincode,
                        item
                    )
                    Donate(donor)
                    mAlertDialog.dismiss()
                }
            }
        }
        view.seek.setOnClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_acceptor, null)
            val mBuilder = AlertDialog.Builder(requireContext())
                .setView(mDialogView)
                .setTitle("Seek Donation Form")
            val  mAlertDialog = mBuilder.show()

            mDialogView.dialogCancelBtn.setOnClickListener {

                mAlertDialog.dismiss()
            }
            mDialogView.dialogLoginBtn.setOnClickListener {
                val name= mDialogView.dialogNameEt.text.toString()
                val email = mDialogView.dialogEmailEt.text.toString()
                val phone= mDialogView.abc2.text.toString().toLong()
                val address= mDialogView.abc.text.toString()
                val city =mDialogView.abc4.text.toString()
                val state= mDialogView.abc5.text.toString()
                val pincode= mDialogView.abc1.text.toString().toInt()

                val seeker = Seeker(
                    name,
                    email,
                    phone,
                    pincode,
                    city,
                    state,
                    address
                )
                saveSeeker(seeker)
                mAlertDialog.dismiss()
            }

        }
        return view
    }
    private fun Donate(donor: Donor) = CoroutineScope(Dispatchers.IO).launch{
        try{
            donorCollectionRef.add(donor).await()
            withContext(Dispatchers.Main){

            }
        }catch (e: Exception){
            withContext(Dispatchers.Main){

            }
        }

    }
    private fun saveSeeker(seeker: Seeker) = CoroutineScope(Dispatchers.IO).launch{
        try{
            donorCollectionRef.add(seeker).await()
            withContext(Dispatchers.Main){

            }
        }catch (e: Exception){
            withContext(Dispatchers.Main){

            }
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