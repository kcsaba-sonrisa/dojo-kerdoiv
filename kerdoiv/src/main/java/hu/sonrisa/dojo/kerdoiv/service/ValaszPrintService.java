/*
 *
 *  Copyright (c) 2019 Sonrisa Informatikai Kft. All Rights Reserved.
 *
 *  This software is the confidential and proprietary information of
 *  Sonrisa Informatikai Kft. ("Confidential Information").
 *  You shall not disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Sonrisa.
 *
 *  SONRISA MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 *  THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 *  TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 *  PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SONRISA SHALL NOT BE LIABLE FOR
 *  ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 *  DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */
package hu.sonrisa.dojo.kerdoiv.service;

import hu.sonrisa.dojo.kerdoiv.model.KerdoivSor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author denyiel
 */
public class ValaszPrintService {

    /**
     * Visszadaja KerdoivSor formájában egy adott Szabadszavas Kérdésre egy adott Felhasználó által válaszolt Válaszok listáját
     * @return
     */
    public static List<KerdoivSor> getSzabadszavasSorok(){
        List<KerdoivSor> result = new ArrayList<>();
        /**
         * Második feladat: Implementáljuk ezt a metódust úgy, hogy kigyüjtse a szabadszavas kérdéseket
         * és a hozzá tartozó válaszokat rendezze felhasználó szerint
         *
         * Kívánt eredmény:
         *
         *
         * Megy a biznic?
         * =========================
         * Dzsoki: Megy?
         * Szamanta: Mit főzzek Dzsok?
         * Bobi: Menne?
         * Elli: Nem értek hozzá?
         *
         * Hány részes a Dallas?
         * =========================
         * Dzsoki: 23131
         * Szamanta: Innák inkább
         * Elli: Mit főzzek Dzsok?
         *
         * Van elég olaj?
         * =========================
         * Dzsoki: Fúj ez tea., Egyébként van
         * Szamanta: Whiskey
         * Bobi: Akad
         */
        return result;
    }

    /**
     * Visszadaja KerdoivSor formájában egy adott Feleletválasztós Kérdésre egy adott Felhasználó által válaszolt Válaszok listáját
     * @return
     */
    public static List<KerdoivSor> getFeleletvalasztoSorok() {
        List<KerdoivSor> result = new ArrayList<>();
        /**
         * Harmadik feladat: Implementáljuk ezt a metódust úgy, hogy kigyüjtse a feleletválasztós kérdéseket
         * és a hozzá tartozó válaszokat rendezze felhasználó szerint
         *
         * Kívánt eredmény:
         *
         *
         * Hol veszünk idén olajmezőket?
         * =========================
         * Dzsoki: Arkansas
         * Szamanta: Dallas, Alaszka
         * Bobi: Alaszka
         * Elli: Somogy megye
         *
         * Dzsok milyen söröket szeret?
         * =========================
         * Dzsoki: Duff
         * Szamanta: Ászok, Pilsner
         * Bobi: Pilsner
         * Elli: Swvinjan
         *
         * Lucy-nek milyen színű táskái vannak?
         * =========================
         * Dzsoki: Kék
         * Szamanta: Zöld, Sárga
         * Bobi: Sárga
         * Elli: Piros
         */
        return result;
    }

    /**
     * Visszadaja KerdoivSor formájában egy adott skálázós Kérdésre egy adott Felhasználó által válaszolt Válaszok listáját
     * @return
     */
    public static List<KerdoivSor> getSkalaSorok(){
        List<KerdoivSor> result = new ArrayList<>();
        /**
         * Negyedik feladat: Implementáljuk ezt a metódust úgy, hogy kigyüjtse a skálázós kérdéseket
         * és a hozzá tartozó válaszokat rendezze felhasználó szerint
         *
         * Kívánt eredmény:
         *
         *
         * Mennyire vagyunk gazdagok?
         * =========================
         * Dzsoki: **
         * Szamanta: **
         * Bobi: *****
         * Elli: ****
         *
         * Mennyire alkoholista Szamanta?
         * =========================
         * Dzsoki: *
         * Szamanta: *****
         * Bobi: **
         * Elli: *
         *
         * Mennyire jó a rancs?
         * =========================
         * Dzsoki: **
         * Szamanta: **
         * Bobi: ***
         * Elli: *
         *
         */
        return result;
    }
}
