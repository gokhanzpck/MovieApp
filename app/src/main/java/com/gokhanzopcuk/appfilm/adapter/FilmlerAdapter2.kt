package com.gokhanzopcuk.appfilm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.gokhanzopcuk.appfilm.adapter.FilmlerAdapter.CardTasarimTutucu
import com.gokhanzopcuk.appfilm.data.Filmler
import com.gokhanzopcuk.appfilm.databinding.CardTasarimBinding
import com.gokhanzopcuk.appfilm.fragment.LikedFragmentDirections
import com.gokhanzopcuk.appfilm.fragment.TrendFragmentDirections

 class FilmlerAdapter2 (var mContext: Context, var filmlerListesi:List<Filmler>):
    RecyclerView.Adapter<FilmlerAdapter2.CardTasarimTutucu2>() {
    inner class CardTasarimTutucu2(var tasarim: CardTasarimBinding) :
        RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmlerAdapter2.CardTasarimTutucu2 {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu2(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu2, position: Int) {
        val film = filmlerListesi.get(position)
        val t = holder.tasarim
        t.filmAA.text = film.film_adi
        t.cKAa.text = film.film_cikis.toString()
        t.tRaa.text = film.film_turu
        t.imageView.setImageResource(
            mContext.resources.getIdentifier(
                film.film_resim.toString(),
                "drawable",
                mContext.packageName
            )
        )

        t.cardViewSatir.setOnClickListener {
            val action = LikedFragmentDirections.likedDetayGecis(film = film)
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }
}