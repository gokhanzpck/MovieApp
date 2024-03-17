package com.gokhanzopcuk.appfilm.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.gokhanzopcuk.appfilm.R
import com.gokhanzopcuk.appfilm.databinding.ActivityMainBinding
import com.gokhanzopcuk.appfilm.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        binding= FragmentHomePageBinding.inflate(inflater, container, false)
binding.trendButton.setOnClickListener {
   Navigation.findNavController(it).navigate(R.id.trendGecis)
}

        binding.likedButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.likedGeciş)
        }




        return binding.root
    }

}