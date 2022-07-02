package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartRepositoryTest {
    @Test
    public void test (){
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

        repo.findAll();

        PurchaseFilm[] expected = {fifth,second,third,fourth,fifth,sixth};
        PurchaseFilm[]actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }

}