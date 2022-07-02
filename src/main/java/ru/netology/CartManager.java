package ru.netology;

public class CartManager {
    private CartRepository repository;


    public CartManager(CartRepository repository) {
        this.repository = repository;
    }

    public void add(PurchaseFilm film) {
        repository.save(film);
    }

    public PurchaseFilm[] getAll() {
        PurchaseFilm[] films = repository.findAll();
        PurchaseFilm[] result = new PurchaseFilm[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public PurchaseFilm[] findAll() {
        PurchaseFilm[] films = repository.findLast();
        PurchaseFilm[] result = new PurchaseFilm[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i + 1;
            result[i] = films[index];
        }
        return result;
    }

}

