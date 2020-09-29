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

import hu.sonrisa.dojo.kerdoiv.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

/**
 * @author denyiel
 */
public class ValaszPrintService {

    public static List<KerdoivSor> getKerdoIvSorokByKerdesTipus(final KerdesTipus kerdesTipus) {
        return KerdesService.findAll().stream()
                .filter(kerdes -> kerdes.getTipus() == kerdesTipus)
                .flatMap(kerdes -> { 
                    final List<Valasz> valaszok = ValaszService.findByKerdesId(kerdes.getId());

                    return valaszok.stream()
                        .collect(Collectors.groupingBy(Valasz::getFelhasznaloId))
                        .entrySet()
                        .stream()
                        .map(valasz -> {
                            final String valaszStr = valasz.getValaszSzoveg() != null
                                ? valasz.getValaszSzoveg()
                                : kerdes.getValaszlehetosegek().get(valasz.getValaszErtek()).getValasz();
                            
                            return KerdoivSor.builder()
                                .kerdes(kerdes.getKerdes())
                                .felhasznaloNev(FelhasznaloService.getFelhasznaloById(valasz.getFelhasznaloId()).getNev())
                                .valaszadoValasz(Collections.singletonList(valaszStr))
                                .build();
                        });
                })
                .collect(Collectors.toList());
    }

    /**
     * Visszadaja KerdoivSor formájában egy adott Szabadszavas Kérdésre egy adott Felhasználó által válaszolt Válaszok listáját
     * @return
     */
    public static List<KerdoivSor> getSzabadszavasSorok(){
        return getKerdoIvSorokByKerdesTipus(KerdesTipus.SZABAD_SZOVEGES);
        /**
         * Második feladat: Implementáljuk ezt a metódust úgy, hogy logolja ki a konzolra az adatbázisban található
         * szabadszavas kérdéseket a hozzá tartozó válaszokkal úgy, hogy a válaszokat felhasználó szerint rendezi.
         * A kapott eredmény az alábbi kell legyen:
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
    }

    /**
     * Visszadaja KerdoivSor formájában egy adott Feleletválasztós Kérdésre egy adott Felhasználó által válaszolt Válaszok listáját
     * @return
     */
    public static List<KerdoivSor> getFeleletvalasztoSorok() {
       return getKerdoIvSorokByKerdesTipus(KerdesTipus.FELELET_VALASZTO);
        /**
         * Harmadik feladat: Implementáljuk ezt a metódust úgy, hogy logolja ki a konzolra az adatbázisban található
         * feleletválasztós kérdéseket és a hozzá tartozó válaszokat úgy, hogy a válaszokat felhasználó szerint rendezi.
         * A kapott eredmény az alábbi kell legyen:
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
    }

    /**
     * Visszadaja KerdoivSor formájában egy adott skálázós Kérdésre egy adott Felhasználó által válaszolt Válaszok listáját
     * @return
     */
    public static List<KerdoivSor> getSkalaSorok(){
        List<KerdoivSor> result = new ArrayList<>();
        /**
         * Negyedik feladat: Implementáljuk ezt a metódust úgy, hogy logolja ki a konzolra az adatbázisban található
         * skálázós kérdéseket és a hozzá tartozó válaszokat úgy, hogy a válaszokat felhasználó szerint rendezi.
         * A kapott eredmény az alábbi kell legyen:
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
