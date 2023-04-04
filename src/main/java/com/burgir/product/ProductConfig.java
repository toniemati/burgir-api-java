package com.burgir.product;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner productRunner(ProductRepository repository) {
        return args -> {
            // ! BURGERY
            Product p1 = new Product(
                    "Burgir",
                    "https://c4.wallpaperflare.com/wallpaper/209/721/107/food-burger-wallpaper-preview.jpg",
                    "Nasza specjalność, nie jadłeś nigdy nic lepszego serio, po prostu go zamów i skosztuj, tylko ostrzegamy, że będziesz po niego wracał częściej niż Ci się wydaje",
                    29.99,
                    1l);

            Product p2 = new Product(
                    "Cheeser",
                    "https://besthqwallpapers.com/Uploads/23-8-2016/49/thumb2-hamburger-fast-food-cheeseburger-sandwich.jpg",
                    "Jak lubisz ser, to jest to burger dla Ciebie (zawiera dużą ilość sera)",
                    24.99,
                    1l);

            Product p3 = new Product(
                    "Hottuwa",
                    "https://wallpapershome.com/images/pages/pic_v/16604.jpg",
                    "Dla miłośników ostrych smaków, czeba podpisać oświadczenie 🌶",
                    24.99,
                    1l);

            Product p4 = new Product(
                    "Kurczaker",
                    "https://4.bp.blogspot.com/-Vgb44KN0fhs/WseEYrOyrzI/AAAAAAAAEOM/QcUYbVXrHp0MrEuMwjnH0ScMQ1716Y04QCLcBGAs/s1600/collage%2Bchicken_004.jpg",
                    "Jeśli potrzbujesz dostaczyć organizmowi sporą ilość białka to właśnie opcja dla Ciebię 🐔",
                    24.99,
                    1l);

            Product p5 = new Product(
                    "Veggie",
                    "https://szefsmaku.pl/wp-content/uploads/2021/04/wege-burger-1250x712.jpg",
                    "Pierwszej klasy burger wege, dla każdego się coś u nas znajdzie 😉",
                    24.99,
                    1l);

            // ! DODATKI
            Product p6 = new Product(
                    "Frytki",
                    "https://prostepesto.pl/wp-content/uploads/2021/03/frytki.jpg",
                    "Robione na miejscu, pyszne i chrupiące frytki",
                    4.99,
                    2l);

            Product p7 = new Product(
                    "Nuggetsy",
                    "https://bi.im-g.pl/im/1a/f3/19/z27211802V,Nuggetsy.jpg",
                    "Smakowite kawałki kurczaczka",
                    9.99,
                    2l);

            Product p8 = new Product(
                    "Frytki z batatów",
                    "https://static.fajnegotowanie.pl/media/uploads/media_image/original/przepis/1364/frytki-z-batatow.jpg",
                    "Słodziutkie i pyszniutkie fryteczki ze słodziutkich ziemniaczków",
                    9.99,
                    2l);

            Product p9 = new Product(
                    "Naczosy",
                    "https://wallpapercave.com/wp/wp3055375.jpg",
                    "Hiszpańska przekąska, trójkąciki z roztopionym serkiem",
                    9.99,
                    2l);

            // ! SOSY
            Product p10 = new Product(
                    "Sos czosnkowy",
                    "https://i.wpimg.pl/O/644x630/d.wpimg.pl/141691940-732325571/sos-czosnkowy.jpg",
                    "Nie radzę się po nim całować",
                    1.99,
                    3l);

            Product p11 = new Product(
                    "Sos pikantna salsa",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSCDyO82Fp10Nf5qbu4pa8rKRBQRCmrMUNHg&usqp=CAU",
                    "Następny poranek będzie ciężki",
                    1.99,
                    3l);

            Product p12 = new Product(
                    "Sos BBQ",
                    "https://www.mashed.com/img/gallery/the-biggest-mistakes-people-make-with-bbq-sauces/l-intro-1628008780.jpg",
                    "Kurcze pieczone jaki on jest pszyny 🤤",
                    1.99,
                    3l);

            Product p13 = new Product(
                    "Tortex",
                    "https://www.carrefour.pl/images/product/org/tortex-ketchup-pikantny-470-g-i2cci3.jpg",
                    "Keczup premium",
                    1.99,
                    3l);

            // ! NAPOJE
            Product p14 = new Product(
                    "Coca-cola",
                    "https://st.depositphotos.com/3594223/4990/i/600/depositphotos_49909665-stock-photo-splash-coke.jpg",
                    "Czarny napój, standard do każdego posiłku",
                    3.99,
                    4l);

            Product p15 = new Product(
                    "Sprite",
                    "https://i.pinimg.com/originals/fc/d3/8e/fcd38e7ee690829fb8a7e9d39e1f3d80.jpg",
                    "Pyszny napój cytrynowo-limonkowym 🍋",
                    3.99,
                    4l);

            Product p16 = new Product(
                    "Fanta",
                    "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/0877aee5-82b0-4ffb-bd37-51429a176805/d60eut3-1011575a-2fee-466e-8ecd-02c7505e490d.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzA4NzdhZWU1LTgyYjAtNGZmYi1iZDM3LTUxNDI5YTE3NjgwNVwvZDYwZXV0My0xMDExNTc1YS0yZmVlLTQ2NmUtOGVjZC0wMmM3NTA1ZTQ5MGQuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.X22yDiR3VzVEuTdxj-kdq8y1Hubt61BRKBzd44ykrkk",
                    "Napój gazowany o smaku owocowym produkowany",
                    3.99,
                    4l);

            Product p17 = new Product(
                    "Woda",
                    "https://tvn24.pl/najnowsze/cdn-zdjecie708b2cdc6df566f24f02734188364a28-prokuratura-umorzyla-sledztwo-ws-wody-zywiec-4306202/alternates/LANDSCAPE_1280",
                    "Związek chemiczny o wzorze H₂O",
                    1.99,
                    4l);

            Product p18 = new Product(
                    "Piwo henken",
                    "https://wallpaperaccess.com/full/1952089.jpg",
                    "Jak pywko to tylko i wyłącznie henken 🍺",
                    4.99,
                    4l);

            repository.saveAll(List.of(
                    p1,
                    p2,
                    p3,
                    p4,
                    p5,
                    p6,
                    p7,
                    p8,
                    p9,
                    p10,
                    p11,
                    p12,
                    p13,
                    p14,
                    p15,
                    p16,
                    p17,
                    p18));
        };
    }
}
