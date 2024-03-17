package com.gokhanzopcuk.appfilm.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.gokhanzopcuk.appfilm.R
import com.gokhanzopcuk.appfilm.databinding.FragmentDetayBinding
import com.gokhanzopcuk.appfilm.databinding.FragmentTrendBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        binding=FragmentDetayBinding.inflate(inflater, container, false)
       val bundle:DetayFragmentArgs by navArgs()
        var gelenFilm=bundle.film

        binding.textViewAd.setText(gelenFilm.film_adi)
        binding.textViewTR.setText(gelenFilm.film_turu)
        binding.textViewTarih.setText(gelenFilm.film_cikis.toString())

       binding.imageView2.setImageResource(gelenFilm.film_resim).toString()
        binding.textView5.setText(gelenFilm.film_acıklama)



        return binding.root
    }

}