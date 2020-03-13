package com.example.stackapp.ui.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.stackapp.R
import com.example.stackapp.api.models.Item
import com.squareup.picasso.Picasso

class QuestionsRecyclerAdapter(private val questions: List<Item>) :
    RecyclerView.Adapter<QuestionsRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val textQuestion = itemView.findViewById<TextView>(R.id.textTitle)
        private val textTags = itemView.findViewById<TextView>(R.id.textTags)
        private val textScore = itemView.findViewById<TextView>(R.id.textScore)
        private val imgProfil = itemView.findViewById<ImageView>(R.id.imgProfil)

        fun bind(question: Item){
            textQuestion.text = question.title
            textTags.text = question.tags.joinToString("/")
            textScore.text = "${question.owner.reputation} pt"
            Picasso.get().load(question.owner.profileImage).placeholder(R.drawable.ic_profil).into(imgProfil)

            itemView.setOnClickListener {
                val intentBrowser = Intent(Intent.ACTION_VIEW, Uri.parse(question.link))
                itemView.context.startActivity(intentBrowser)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_question, parent, false)
        return MyViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) = holder.bind(questions[position])

    override fun getItemCount() = questions.size
}