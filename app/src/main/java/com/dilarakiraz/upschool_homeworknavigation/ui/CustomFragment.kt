package com.dilarakiraz.upschool_homeworknavigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.dilarakiraz.upschool_homeworknavigation.R
import com.dilarakiraz.upschool_homeworknavigation.common.viewBinding
import com.dilarakiraz.upschool_homeworknavigation.data.Info
import com.dilarakiraz.upschool_homeworknavigation.databinding.FragmentCustomBinding


class CustomFragment : Fragment(R.layout.fragment_custom) {
    private val binding by viewBinding(FragmentCustomBinding::bind)
    private val args by navArgs<CustomFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name=args.name.name
        val email=args.name.email
        val phone=args.name.phone
        binding.customName.text="Ad Soyad: $name"

        binding.buttonNext.setOnClickListener {
            val question1 = binding.question1.text.toString()
            val question2 = binding.question2.text.toString()
            val question3 = binding.question3.text.toString()

            val updatedInfo = Info(name, email,phone , question1, question2, question3)
            val action = CustomFragmentDirections.customToResults(updatedInfo)
            findNavController().navigate(action)
        }
    }
}