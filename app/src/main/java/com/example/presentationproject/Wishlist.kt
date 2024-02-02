package com.example.presentationproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import com.example.presentationproject.databinding.FragmentWishlistBinding

class Wishlist : Fragment() {
    private lateinit var binding:FragmentWishlistBinding
    private lateinit var toolbar: Toolbar
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentWishlistBinding.inflate(layoutInflater, container, false)





        return binding.root
    }
}