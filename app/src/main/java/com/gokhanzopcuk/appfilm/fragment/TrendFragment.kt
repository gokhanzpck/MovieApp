package com.gokhanzopcuk.appfilm.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.gokhanzopcuk.appfilm.R
import com.gokhanzopcuk.appfilm.adapter.FilmlerAdapter
import com.gokhanzopcuk.appfilm.data.Filmler
import com.gokhanzopcuk.appfilm.databinding.FragmentHomePageBinding
import com.gokhanzopcuk.appfilm.databinding.FragmentTrendBinding

class TrendFragment : Fragment() {
    private lateinit var binding: FragmentTrendBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
       binding= FragmentTrendBinding.inflate(inflater, container, false)
       binding.rv.layoutManager=LinearLayoutManager(requireContext())

        val filmlerListesi=ArrayList<Filmler>()
        val f1=Filmler(1,"İnception","Dram",11,"Leonardo DiCaprio bu yapımda, çok yetenekli bir hırsız olan \"Dom Cobb \" ile karşımızda. Uzmanlık alanı, zihnin en karanlık ve savunmasız olduğu rüya görme anında, bilinçaltının derinliklerindeki değerli sırları çekip çıkarmak ve onları çalmaktır. Cobb'un bu nadir insanlarda görülebilecek yeteneği, bu ender rastgelinebilecek mahareti, onu kurumsal casusluğun tehlikeli yeni dünyasında aranan bir oyuncu yapmıştır. Aynı zamanda bu durum onu uluslararası bir kaçak yapmış ve sevdiği herşeye malolmuştur. Cobb'a içinde bulunduğu durumdan kurtulmasını sağlayacak bir fırsat sunulur. Ona hayatını geri verebilecek son bir iş; tabi eğer imkansız 'başlangıç'ı tamamlayabilirse. Mükemmel soygun yerine, Cobb ve takımındaki profesyoneller bu sefer tam tersini yapmak zorundadır; görevleri bir fikri çalmak değil onu yerleştirmektir. Eğer başarırlarsa, mükemmel suç bu olacaktır.",R.drawable.inception)
       val f2=Filmler(2,"Indiana Jones ve Kader Kadranı","Aksiyon,Macera",2024,"\n" +
               "Ünlü arkeolog Indiana Jones'un tarihin bütün akışını değiştirebilecek bir yapıyı geri almak için zamanla yarışması gerekiyordur. Harrison Ford'un Indiana Jones rolünü tekrarlayacağı bu filmde ona Phoebe Waller-Bridge ve Mads Mikkelsen eşlik etmekte.",R.drawable.india)
       val f3=Filmler(3,"Top Gun: Maverick","Aksiyon,Dram",2022,"\"Top Gun: Maverick\" 1986 yapımı \"Top Gun\" filminin devamı niteliğinde. Hikaye, usta pilot Maverick'in eğitmen olarak hava kuvvetlerine dönüşü sonrasına odaklanıyor.\n" +
               "\n" +
               "Donanmanın en iyi pilotlarından biri olan Pete “Maverick” Mitchell (Tom Cruise), 30 yıllık hizmetten sonra ait olduğu yerde, cesur bir test pilotu olarak sınırları zorlar ve kendisini yere bağlayacak olan terfiden kaçmaya çalışıyordur. Maverick, Top Gun mezunlarından oluşan bir müfrezeyi o güne kadar hiçbir pilotun görmediği özel bir görev için eğitmesi gerekince, belirsiz bir gelecekle ve geçmişinden gelen anılarla karşı karşıya kalır. En büyük korkularıyla yüzleşecek ve büyük bir fedakarlık yapmasını gerektiren bir göreve gidecektir.",R.drawable.topgun)
        val f4=Filmler(4,"The Batman","Aksiyon",2022,"Batman olarak geçirdiği iki yıl, Bruce Wayne’i (Robert Pattinson) Gotham Şehri’nin gölgelerine sürüklemiştir. Şehrin yozlaşmış yetkilileri ve yüksek profilli kişiler ağı arasında güvenilir müttefikleri Alfred Pennyworth (Andy Serkis) ve Teğmen James Gordon (Jeffrey Wright) ile Batman, kendisini şehir halkı arasında intikamın yegane örneği olarak kanıtlamıştır. Bir katil, bir dizi sadist entrikayla Gotham’ın seçkinlerini hedef aldığında, arkasında bıraktığı şifreli ipuçları, Batman'i yeraltı dünyasını soruşturmaya iter. Batman burada Kedi Kadın olarak da bilinen Selina Kyle (Zoë Kravitz), Penguen olarak da bilinen Oswald Cobblepot (Colin Farrell), Carmine Falcone (John Turturro) ve Riddler olarak da bilinen Edward Nashton (Paul Dano) gibi karakterlerle karşılaşır. Kanıtlar ve failin planlarının ölçeği netleşirken, Batman yeni ilişkiler kurmalı, suçlunun maskesini düşürmeli ve Gotham Şehri’ni uzun süredir rahatsız eden, gücün ve yolsuzluğun kötüye kullanılmasına adalet getirmelidir.",R.drawable.batman)
        val f5=Filmler(5,"Uncharted","Aksiyon,Macera",2022,"Uncharted\" isimli video oyunu serisinden esinlenmiş olan film, Drake karakterinin genç halini ve Sully ile nasıl tanıştıklarını anlatıyor.\n" +
                "\n" +
                "Nathan Drake (Tom Holland), deneyimli hazine avcısı Victor “Sully” Sullivan (Mark Wahlberg) tarafından Ferdinand Magellan'ın biriktirdiği ve 500 yıl önce Moncada Hanedanı tarafından kaybedilen bir serveti geri almak için işe alınır. İkili için bir soygun işi olarak başlayan şey, kendisinin ve ailesinin haklı varisler olduğuna inanan acımasız Santiago Moncada'nın (Antonio Banderas) ile bir yarışa dönüşür. Nate ve Sully ipuçlarını deşifre edebilir ve dünyanın en eski gizemlerinden birini çözebilirse, 5 milyar dolarlık hazineyi ve hatta belki Nate'in uzun süredir kayıp olan kardeşini bulabilirler...ama ancak birlikte çalışmayı öğrenebilirlerse.",R.drawable.uncharted)
        val f6=Filmler(6,"Fast & Furious 9","Aksiyon",2021,"Son zamanların popüler Hollywood serisi olan Hızlı ve Öfkeli, serinin 9. filmi ile tekrar izleyicileriyle buluşuyor. Vin Diesel'in canlandırdığı Dominic Toretto, Tyrese Gibson’ın canlandırdığı Roman Pearce ve Michelle Rodriguez’in canlandırdığı Letty gibi serinin önceki filmlerinden bildiğimiz karakterler ve filmin oyuncu kadrosuna, hemen hemen her Hızlı ve Öfkeli filminde gördüğümüz gibi, 9. filmde de bazı sürpriz isimler eklenmiş. Bu isimlerden belki de en popüler olanı, Amerikan güreşi izleyicilerinin de yakından tanıyacağı John Cena.\n" +
                "\n" +
                "Bununla birlikte onu, en son serinin 7. filminde gördüğümüz, geçtiğimiz senelerde hayatını kaybeden ünlü oyuncu Paul Walker’ın canlandırdığı Brian O'Conner'ın eşi olan, aynı zamanda Dominic'in de kız kardeşi, Jordana Brewster'ın canlandırdığı Mia da yeniden boy gösteren karakterler arasında bulunuyor.",R.drawable.indir)
        val f7=Filmler(7,"Matrix","Aksiyon",1999,"Post-apokaliptik bir evrende geçmekte olan Matrix, ana karakterimiz olan Neo'nun \"gerçeğe uyanmasıyla\" başlar. Ardında derin bir felsefi temel barındıran bu film, Jean Baudrillard'ın simülasyon teorisinden izler taşır. Bununla birlikte, kültleşmiş bir hikaye olan Alice Harikalar Diyarında'nın beyaz tavşanına da yer verilmiştir. Alice'in beyaz tavşanı takip edip kendisini bambaşka bir dünyada bulmasına benzer şekilde, Neo da kendisini gerçeğe götürecek olanın peşinden sürüklenmiştir.",R.drawable.indir1)
        val f8=Filmler(8,"Forrest Gump ","Komedi-Drama",1994,"önetmenliğini Robert Zemeckis'in yaptığı ve başrolünde Tom Hanks'ın yer aldığı Forrest Gump, düşük IQ'ya sahip genç bir adamın hikayesini anlatır. Forrest Gump karakteri, şans eseri Elvis Presley, Kennedy, Nixon'ın da aralarında bulunduğu tarihe adını yazdırmış bazı kişilikler ile tanışır. Olaylar 50'lerden 70'lere kadar süren bir zaman dilimi içerisinde gerçekleşir. Unutulmaz filmler listesinin başlarında yer alan bu filmi mutlaka izlemelisiniz.",R.drawable.indir2)

        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)
        filmlerListesi.add(f7)
        filmlerListesi.add(f8)



        val filmlerAdapter=FilmlerAdapter(requireContext(),filmlerListesi)
        binding.rv.adapter=filmlerAdapter




        return binding.root
    }

}