package com.gokhanzopcuk.appfilm.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.gokhanzopcuk.appfilm.R
import com.gokhanzopcuk.appfilm.adapter.FilmlerAdapter
import com.gokhanzopcuk.appfilm.adapter.FilmlerAdapter2
import com.gokhanzopcuk.appfilm.data.Filmler
import com.gokhanzopcuk.appfilm.databinding.FragmentLikedBinding
import com.gokhanzopcuk.appfilm.databinding.FragmentTrendBinding


class LikedFragment : Fragment() {

    private lateinit var binding: FragmentLikedBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
      binding= FragmentLikedBinding.inflate(inflater, container, false)
        binding.rvLiked.layoutManager= LinearLayoutManager(requireContext())
        val filmlerListesi=ArrayList<Filmler>()
        val f1= Filmler(1,"Dikkat Şehvet","Romantik, Gerilim, Savaş Filmi",2007,"Savaşın her yeri talan ettiği bir dönemde bir ülkenin hali duman olsa da kişisel boyutta duygusal dünyaların da ayrı ayrı hırpalanması göz ardı edilemez. Mr Yee, Şangay’da önemli bir politikacıdır ve İkinci Dünya Savaşı sürerken zor zamanlar yaşamaktadır. Öte yanda duygusal dünyası da buna paralel iniş çıkışlar ...",R.drawable.indir3)
        val f2=Filmler(2,"Akıl Oyunları","Romantik-Dram",2002,"John Forbes Nash Jr., genç yaşında geliştirdiği kuramlarla matematik dünyasının bir numaralı ismi haline gelir. Fakat kısa süre içerisinde bencilliği ve kendine olan aşırı güveni sonucunda oluşan kişisel problemleri ile baş edemez duruma düşer. Dahilik ile delilik arasındaki ince çizgide, delilik tarafına doğru sürüklenir.",R.drawable.beatiful)
        val f3=Filmler(3,"Beni Unutma","Dram-Romantik",2010,"Tyler, kaderin bir oyunu sonucu Ally ile tanıştığı güne kadar kendisini kimsenin anlayamadığını düşünmektedir. Aşk aklına gelen en son şey olmasına rağmen, Ally’nin beklenmedik şekilde kendine çok iyi gelmesi ve ondan ilham alıyor olmasıyla ona yavaş yavaş aşık olmaya başlar. Bu aşkla beraber mutluluğu ve hayatındaki anlamı da keşfeder.",R.drawable.beniunutma)


        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)


        val filmlerAdapter= FilmlerAdapter2(requireContext(),filmlerListesi)
        binding.rvLiked.adapter=filmlerAdapter


        return binding.root
    }

}