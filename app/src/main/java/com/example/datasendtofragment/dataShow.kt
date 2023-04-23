package com.example.datasendtofragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class dataShow : Fragment() {
 lateinit var firstName:TextView
 lateinit var lastName: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_data_show, container, false)
        firstName = view.findViewById(R.id.text1)
        lastName = view.findViewById(R.id.text2)
        firstName.text =arguments?.getString("firstName")
        lastName.text = arguments?.getString("lastName")

        return view
    }

}