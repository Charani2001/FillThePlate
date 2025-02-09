package com.example.FillThePlate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class DonateFoods : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.donate_foods, container, false)

        // Find the submit button in the layout
        val submitButton: Button = view.findViewById(R.id.submitButton)  // Use the correct ID of your submit button

        // Set up the button click listener
        submitButton.setOnClickListener {
            // Show the toast message when the button is clicked
            Toast.makeText(requireContext(), "Donation submitted successfully!", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
