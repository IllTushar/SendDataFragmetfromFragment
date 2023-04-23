package com.example.datasendtofragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class firstFrag : Fragment() {
    lateinit var firstName: EditText
    lateinit var lastName: EditText
    lateinit var click: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_first, container, false)
        firstName = view.findViewById(R.id.name)
        lastName = view.findViewById(R.id.lastname)
        click = view.findViewById(R.id.click)

        click.setOnClickListener {
            val FirstName = firstName.text.toString()
            val LastName = lastName.text.toString()
            val bundel = Bundle()
            val fragment = dataShow()
            fragment.arguments = bundel
            bundel.putString("firstName",FirstName)
            bundel.putString("lastName",LastName)

            val fragmentManger: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManger.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout,fragment).addToBackStack(null).commit()
        }
       return view
    }

}