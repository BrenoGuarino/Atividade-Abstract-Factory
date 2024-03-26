package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamisaTest {

    @Test
    void deveAdicionarGolaPolo() {
        FabricaAbstrata fabrica = new FabricaCamisaPolo();
        Camisa camisa = new Camisa(fabrica);
        assertEquals("Gola Polo adicionada", camisa.adicionarGola());
    }

    @Test
    void deveAdicionarGolaV() {
        FabricaAbstrata fabrica = new FabricaCamisaTreino();
        Camisa camisa = new Camisa(fabrica);
        assertEquals("Gola em V adicionada", camisa.adicionarGola());
    }

    @Test
    void deveAdicionarMangaRegata() {
        FabricaAbstrata fabrica = new FabricaCamisaPolo();
        Camisa camisa = new Camisa(fabrica);
        assertEquals("Manga Longa adicionada", camisa.adicionarManga());
    }

    @Test
    void deveAdicionarMangaLonga() {
        FabricaAbstrata fabrica = new FabricaCamisaTreino();
        Camisa camisa = new Camisa(fabrica);
        assertEquals("Manga Regata Adicionada", camisa.adicionarManga());
    }

}