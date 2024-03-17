package com.gokhanzopcuk.appfilm.data

import java.io.Serializable

data class Filmler(
    var film_id:Int,
    var film_adi:String,
    var film_turu:String,
    var film_cikis:Int,
    var film_acıklama:String,
    var film_resim:Int

)
    :Serializable{

}