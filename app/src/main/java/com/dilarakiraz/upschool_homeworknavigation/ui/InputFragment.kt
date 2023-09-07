package com.dilarakiraz.upschool_homeworknavigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dilarakiraz.upschool_homeworknavigation.R
import com.dilarakiraz.upschool_homeworknavigation.common.viewBinding
import com.dilarakiraz.upschool_homeworknavigation.data.Info
import com.dilarakiraz.upschool_homeworknavigation.databinding.FragmentInputBinding

class InputFragment : Fragment(R.layout.fragment_input) {

    private val binding by viewBinding (FragmentInputBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonStart.setOnClickListener{
            val name = binding.editTextName.text.toString()
            val info = Info(name,null,null, "", "", "")
            val action = InputFragmentDirections.inputToPersonal(info)
            findNavController().navigate(action)
        }
    }
}