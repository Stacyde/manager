package ru.netology;


public class manager { // дата класс описывающий объект одной строчки в корзине покупок
    PurchaseFilm first = new PurchaseFilm(1, 1, "Bloodshot", "Action");
    PurchaseFilm second = new PurchaseFilm(2, 2, "Forward", "Cartoon");
    PurchaseFilm third = new PurchaseFilm(3, 3, "Hotel Belgrade", "Comedy");
    PurchaseFilm fourth = new PurchaseFilm(4, 4, "Invisible man", "Action");
    PurchaseFilm fifth = new PurchaseFilm(5, 5, "Trolls. World tour", "Cartoon");
    PurchaseFilm sixth = new PurchaseFilm(6, 6, "Number one", "Comedy");

    CartRepository repo = new CartRepository();
    repo.save(first);




    public class PurchaseFilm { // объект описывающий 1 строчку в афише фильма
        private int id;
        public int productId;
        private String filmsName;
        private String filmsGenre;

        public PurchaseFilm(int id, int productId, String filmsName, String filmsGenre) {

        }
    }

    public class CartRepository {
        private PurchaseFilm[] films = new PurchaseFilm[0];

        public void save(PurchaseFilm film) {
            int length = films.length + 1;
            PurchaseFilm[] tmp = new PurchaseFilm[length];
            System.arraycopy(films, 0, tmp, 0, films.length);
            int lastIndex = tmp.length - 1;
            tmp[lastIndex] = film;
            films = tmp;
        }

        public PurchaseFilm[] findAll() {
            return films;
        }

    }
}


//метод -добавить фильм в ленту (класс фильма)
//выдать последние 10 добавленных фильмов
// у менеджера два конструктора - один без параметров выставляющий 10, другой выставляющий лимит менеджера в 10







