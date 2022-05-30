package com.ktl1.fragmentnavigationanimationbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.ktl1.fragmentnavigationanimationbinding.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.signUp.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_nameFragment )
        }

        binding.terms.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_termsFragment)
        }
        return binding.root
    }


}