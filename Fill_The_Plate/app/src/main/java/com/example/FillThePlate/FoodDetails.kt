package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.FillThePlate.R

class FoodDetailsFragment : Fragment() {

    // Declare button variables
    private lateinit var getFoodButton1: Button
    private lateinit var getFoodButton2: Button
    private lateinit var getFoodButton3: Button
    private lateinit var getFoodButton4: Button
    private lateinit var getFoodButton5: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.food_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize buttons using findViewById
        getFoodButton1 = view.findViewById(R.id.getFoodButton1)
        getFoodButton2 = view.findViewById(R.id.getFoodButton2)
        getFoodButton3 = view.findViewById(R.id.getFoodButton3)
        getFoodButton4 = view.findViewById(R.id.getFoodButton4)
        getFoodButton5 = view.findViewById(R.id.getFoodButton5)

        // Add all buttons to a list for easy iteration
        val buttons = listOf(getFoodButton1, getFoodButton2, getFoodButton3, getFoodButton4, getFoodButton5)

        // Set click listener for each button
        buttons.forEach { button ->
            button.setOnClickListener {
                loadGetFoodFragment()
            }
        }
    }

    // Function to load the GetFoodFragment
    private fun loadGetFoodFragment() {
        val fragment = GetFoodFragment()
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment) // Replace fragment_container with GetFoodFragment
            .addToBackStack(null) // Add the transaction to the back stack
            .commit() // Commit the transaction
    }
}