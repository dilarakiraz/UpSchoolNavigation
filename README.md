# UpSchoolNavigationComponentHomework

Navigation Component Homework

## 1.Sayfa - Giriş

•Bir EditText ve bir Button'dan oluşacak.

•EditText kullanıcıdan Ad-Soyad isteyecek.

•Button ile kullanıcı sonraki sayfaya gidip ankete başlayacak.

•2.Sayfaya giderken bu Ad-Soyad args ile gönderilecek.

•Cihazın geri tuşuna bastığımda app kapanmalı ve bunu dersteki kod kullanımıyla yazalım.

## 2.Sayfa - Kişisel Bilgiler

•1.Sayfadan gelen Ad-Soyad kullanılarak sayfanın üstünde belirtilecek.

•Bu sayfada kullanıcıdan EditText ile kişisel bilgileri alınacak (email, phone gibi size kalmış)

•En altta bulunacak Button ile bir sonraki sayfaya geçiş yapılacak.

•3.Sayfaya geçerken bu sayfada alınan veriler için içerisinde ismi de barındıracak bir data class oluşturulacak ve 3.sayfaya data class olarak aktarılacak.

## 3.Sayfa - Custom

•2.Sayfadan gelen Ad-Soyad kullanılarak sayfanın üstünde belirtilecek.

•Bu sayfada en az 3 EditText kullanarak kullanıcıya sorular yöneltebilir ve input alabilirsiniz. İster hobilerini sorun, ister farklı sorular yöneltin Evet, Hayır şeklinde cevap isteyin. Tamamen size kalmış kategorisi.

•En altta bulunan Button ile 4.Sayfaya yönlendireceğiz.

•Yönlendirirken şu ana kadar aldığımız tüm veriler için bir data class açacağız ve bu data class'ı son sayfaya aktaracağız.


## 4.Sayfa - Sonuçlar

•Bu sayfaya alınan data class kullanılarak, kullanıcıdan aldığımız tüm bilgiler bir tasarım oluşturularak ekrana bastırılacak.

•Burada ConstraintLayout yapısıyla birlikte kullandığımız constraints, chains mantıklarını kullanalım.

•En altta bulunan Button veya cihazın geri tuşuna basıldığında 1.Sayfaya gidilmeli ve 2.3.4.sayfalar backstack'ten temizlenmeli. Yani 1.Sayfaya gittiğimde cihazın geri tuşuna bastığımda app kapanmalı.

Dikkat Edilmesi Gerekenler
- 1.2 ve 3.Sayfalarda LinearLayout, 4.Sayfada ConstraintLayout kullanılmalı
- data classlar Parcelable olarak taşınmalı

  https://github.com/dilarakiraz/UpSchoolNavigation/assets/76565172/bf021ddc-b16c-4676-adad-1a258c1bdf47

