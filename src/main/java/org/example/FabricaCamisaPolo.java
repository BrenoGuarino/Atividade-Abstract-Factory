package org.example;

public class FabricaCamisaPolo implements FabricaAbstrata {

    @Override
    public Manga createManga() {
        return new MangaLonga();
    }

    @Override
    public Gola createGola() {
        return new GolaPolo();
    }
}