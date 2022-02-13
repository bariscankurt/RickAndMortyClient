package com.bck.rickandmortyclient

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.buttonNavigate)
        button.setOnClickListener {
            view.findNavController().navigate(HomeScreenFragmentDirections.actionHomeScreenFragmentToCharacterDetailFragment2())
        }
    }
}