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
import com.dilarakiraz.upschool_homeworknavigation.databinding.FragmentPersonalInfoBinding


class PersonalInfoFragment : Fragment(R.layout.fragment_personal_info) {
    private val binding by viewBinding (FragmentPersonalInfoBinding::bind)
    private val args by navArgs<PersonalInfoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name=args.name.name
        binding.tvName.text = "Ad-Soyad: $name"

        // Telefon numarası girişi için sadece sayıların kabul edilmesi
        val editTextPhone = binding.phone
        editTextPhone.inputType = android.text.InputType.TYPE_CLASS_PHONE

        binding.buttonNext.setOnClickListener {
           val email = binding.email.text.toString()
            val phone = binding.phone.text.toString()
            val updatedInfo = Info(name, email,phone , "", "", "")
            val action = PersonalInfoFragmentDirections.personalToCustom(updatedInfo)
            findNavController().navigate(action)
        }

        binding.ivBack.setOnClickListener{
            findNavController().navigateUp()
        }
    }
}