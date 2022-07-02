package ru.netology;

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

    public PurchaseFilm[] findLast() {
        return films;
    }
}

