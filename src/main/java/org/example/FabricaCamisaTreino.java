package org.example;

public class FabricaCamisaTreino implements FabricaAbstrata {

    @Override
    public Manga createManga() {
        return new MangaRegata();
    }

    @Override
    public Gola createGola() {
        return new GolaV();
    }
}