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

import hu.sonrisa.dojo.kerdoiv.model.Valasz;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Válaszok adatbázisa DO NOT MODIFY
 * @author denyiel
 */
public class ValaszService {


    private static List<Valasz> db = new ArrayList<>();
    private static long counter = 0l;

    static{
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(0l).felhasznaloId(2l).valaszSzoveg("Innák inkább").build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(0l).felhasznaloId(1l).valaszSzoveg("23131").build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(0l).felhasznaloId(4l).valaszSzoveg("Mit főzzek Dzsok?").build());

        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(1l).felhasznaloId(1l).valaszSzoveg("Megy?").build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(1l).felhasznaloId(2l).valaszSzoveg("Mit főzzek Dzsok?").build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(1l).felhasznaloId(3l).valaszSzoveg("Menne?").build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(1l).felhasznaloId(4l).valaszSzoveg("Nem értek hozzá?").build());

        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(2l).felhasznaloId(1l).valaszSzoveg("Fúj ez tea., Egyébként van").build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(2l).felhasznaloId(2l).valaszSzoveg("Whiskey").build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(2l).felhasznaloId(3l).valaszSzoveg("Akad").build());

        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(3l).felhasznaloId(1l).valaszErtek(1).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(3l).felhasznaloId(2l).valaszErtek(2).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(3l).felhasznaloId(2l).valaszErtek(3).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(3l).felhasznaloId(3l).valaszErtek(3).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(3l).felhasznaloId(4l).valaszErtek(4).build());

        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(4l).felhasznaloId(1l).valaszErtek(1).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(4l).felhasznaloId(2l).valaszErtek(2).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(4l).felhasznaloId(2l).valaszErtek(3).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(4l).felhasznaloId(3l).valaszErtek(3).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(4l).felhasznaloId(4l).valaszErtek(4).build());

        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(5l).felhasznaloId(1l).valaszErtek(1).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(5l).felhasznaloId(2l).valaszErtek(2).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(5l).felhasznaloId(2l).valaszErtek(3).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(5l).felhasznaloId(3l).valaszErtek(3).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(5l).felhasznaloId(4l).valaszErtek(4).build());

        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(6l).felhasznaloId(1l).valaszErtek(2).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(6l).felhasznaloId(2l).valaszErtek(2).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(6l).felhasznaloId(3l).valaszErtek(5).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(6l).felhasznaloId(4l).valaszErtek(4).build());

        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(7l).felhasznaloId(1l).valaszErtek(1).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(7l).felhasznaloId(2l).valaszErtek(5).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(7l).felhasznaloId(3l).valaszErtek(2).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(7l).felhasznaloId(4l).valaszErtek(1).build());

        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(8l).felhasznaloId(1l).valaszErtek(2).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(8l).felhasznaloId(2l).valaszErtek(2).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(8l).felhasznaloId(3l).valaszErtek(3).build());
        db.add(Valasz.builder().felhasznaloId(counter++).kerdesId(8l).felhasznaloId(4l).valaszErtek(1).build());


    }

    /**
     * Visszaad kerdeselet amiknek megegyezik a kerdes azonosítója a kapott azonosítóval
     * @param id
     * @return
     */
    public static List<Valasz> findByKerdesId(long id) {
        return db.stream().filter(valasz -> Objects.equals(id, valasz.getKerdesId())).collect(Collectors.toList());
    }
}
