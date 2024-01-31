package com.example.presentationproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.presentationproject.databinding.FragmentTableBookingBinding

class TableBooking : Fragment() {
    private lateinit var binding:FragmentTableBookingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTableBookingBinding.inflate(layoutInflater, container, false)







        return binding.root
    }
}