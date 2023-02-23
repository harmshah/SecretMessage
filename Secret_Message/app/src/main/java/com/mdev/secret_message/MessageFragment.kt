package com.mdev.secret_message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentContainer
import androidx.navigation.findNavController

class MessageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //inflate the layout in this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val backButton = view.findViewById<Button>(R.id.back)

        backButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_messageFragment_to_welcomefragment)
        }

        return view
    }

}