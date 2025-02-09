package com.example.FillThePlate

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Find the logout button
        val logoutButton: Button = view.findViewById(R.id.btn_logout)

        // Set up the click listener for the logout button
        logoutButton.setOnClickListener {
            // Start the LoginActivity when the user clicks the logout button
            val intent = Intent(requireActivity(), LoginActivity::class.java)

            // Optional: Clear the activity stack to prevent returning to the profile screen
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

            // Start the login activity
            startActivity(intent)

            // Optionally, you can finish the current activity (if in Activity context)
            requireActivity().finish()
        }

        return view
    }
}
