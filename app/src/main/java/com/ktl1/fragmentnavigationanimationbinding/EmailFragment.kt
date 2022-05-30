package com.ktl1.fragmentnavigationanimationbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.ktl1.fragmentnavigationanimationbinding.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEmailBinding.inflate(inflater, container, false)

        val email = binding.emailEdit.text.toString()

        binding.submitBtn.setOnClickListener {
            if (binding.emailEdit.text.isNotEmpty()) {
                val bundle = bundleOf("email" to email)
                it.findNavController()
                    .navigate(R.id.action_emailFragment_to_welcomeFragment, bundle)
            } else {
                Toast.makeText(activity, "Fill the Field!", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }
}