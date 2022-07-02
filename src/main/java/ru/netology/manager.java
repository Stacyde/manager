package ru.netology;


public class manager { // дата класс описывающий объект одной строчки в корзине покупок
    public static void manager(String[] args) {
        PurchaseFilm first = new PurchaseFilm(1, 1, "Bloodshot", "Action");
        PurchaseFilm second = new PurchaseFilm(2, 2, "Forward", "Cartoon");
        PurchaseFilm third = new PurchaseFilm(3, 3, "Hotel Belgrade", "Comedy");
        PurchaseFilm fourth = new PurchaseFilm(4, 4, "Invisible man", "Action");
        PurchaseFilm fifth = new PurchaseFilm(5, 5, "Trolls. World tour", "Cartoon");
        PurchaseFilm sixth = new PurchaseFilm(6, 6, "Number one", "Comedy");

        CartRepository repo = new CartRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);
        repo.save(sixth);



    }

    }





//метод -добавить фильм в ленту (класс фильма)
//выдать последние 10 добавленных фильмов
// у менеджера два конструктора - один без параметров выставляющий 10, другой выставляющий лимит менеджера в 10







