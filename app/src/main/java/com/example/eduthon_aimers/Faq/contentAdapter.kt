package com.example.eduthon_aimers.Faq

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.eduthon_aimers.R
import kotlinx.android.synthetic.main.faqs_list_item.view.*

class contentAdapter(
    var QuesAns : List<FaqQuesAns>
): RecyclerView.Adapter<contentAdapter.contentAdaterViewHolder>() {
    inner class contentAdaterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contentAdaterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.faqs_list_item, parent, false)
        return contentAdaterViewHolder(view)
    }
    override fun getItemCount(): Int =  QuesAns.size

    override fun onBindViewHolder(holder: contentAdaterViewHolder, position: Int) {
        holder.itemView.apply {
            faqQuestion.text = QuesAns[position].Questions
            ansFaqs.text = QuesAns[position].Answer
            showHideAnsImg.setOnClickListener {
                //Toast.makeText(it.context, "Clicked", Toast.LENGTH_LONG).show()
                ansCardView.visibility = if (ansCardView.visibility == View.VISIBLE){
                    View.GONE
                } else{
                    View.VISIBLE
                }
                //ansCardView.visibility = View.VISIBLE
            }
        }
    }
}