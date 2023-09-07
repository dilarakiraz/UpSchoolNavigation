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
import com.dilarakiraz.upschool_homeworknavigation.databinding.FragmentResultsBinding

class ResultsFragment : Fragment(R.layout.fragment_results) {

    private val binding by viewBinding (FragmentResultsBinding::bind)
    private val args by navArgs<ResultsFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val info = args.name

        val resultText = "Ad-Soyad: ${info.name}\n"+
                "Email: ${info.email ?: "Bilgi Yok"}\n" +
                "Telefon: ${info.phone ?: "Bilgi Yok"}\n" +
                "Soru 1: ${info.question1 ?: "Bilgi Yok"}\n" +
                "Soru 2: ${info.question2 ?: "Bilgi Yok"}\n" +
                "Soru 3: ${info.question3 ?: "Bilgi Yok"}"

        binding.resultTextView.text = resultText

        // Geri dönüş butonuna tıklama işlevi ekleyin
        binding.goBackButton.setOnClickListener {
            // 1. sayfaya dönün ve geri tuşuna bastığınızda uygulamanın kapanmasını sağlayın
            findNavController().popBackStack(R.id.inputFragment, false)
        }
    }
}