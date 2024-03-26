package org.example;

public class Camisa {

    private Manga manga;
    private Gola gola;

    public Camisa (FabricaAbstrata fabrica) {
        this.manga = fabrica.createManga();
        this.gola = fabrica.createGola();
    }

    public String adicionarManga() {
        return this.manga.adicionar();
    }

    public String adicionarGola() {
        return this.gola.adicionar();
    }
}
