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

import hu.sonrisa.dojo.kerdoiv.model.Kerdes;
import hu.sonrisa.dojo.kerdoiv.model.KerdesTipus;
import hu.sonrisa.dojo.kerdoiv.model.Valaszlehetoseg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Kérdés adatbázis DO NOT MODIFY
 * @author denyiel
 */
public class KerdesService {

    private static List<Kerdes> db = new ArrayList<>();
    private static long counter = 0l;

    static{
        List<Valaszlehetoseg> valaszlehetosegek;
        db.add(Kerdes.builder().id(counter++).tipus(KerdesTipus.SZABAD_SZOVEGES).kerdes("Hány részes a Dallas?").build());
        db.add(Kerdes.builder().id(counter++).tipus(KerdesTipus.SZABAD_SZOVEGES).kerdes("Megy a biznic?").build());
        db.add(Kerdes.builder().id(counter++).tipus(KerdesTipus.SZABAD_SZOVEGES).kerdes("Van elég olaj?").build());

        valaszlehetosegek = Arrays.asList(
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Arkansas").sorszam(1).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Dallas").sorszam(2).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Alaszka").sorszam(3).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Somogy megye").sorszam(4).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Irak").sorszam(5).build());
        db.add(Kerdes.builder().id(counter++).tipus(KerdesTipus.FELELET_VALASZTO).kerdes("Hol veszünk idén olajmezőket?")
                .valaszlehetosegek(valaszlehetosegek).build());
        valaszlehetosegek = Arrays.asList(
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Duff").sorszam(1).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Ászok").sorszam(2).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Pilsner").sorszam(3).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Swvinjan").sorszam(4).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Dreher").sorszam(5).build());
        db.add(Kerdes.builder().id(counter++).tipus(KerdesTipus.FELELET_VALASZTO).kerdes("Dzsok milyen söröket szeret?")
                .valaszlehetosegek(valaszlehetosegek).build());
        valaszlehetosegek = Arrays.asList(
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Kék").sorszam(1).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Zöld").sorszam(2).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Sárga").sorszam(3).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Piros").sorszam(4).build(),
                Valaszlehetoseg.builder().kerdesId(counter).valasz("Narancs").sorszam(5).build());
        db.add(Kerdes.builder().id(counter++).tipus(KerdesTipus.FELELET_VALASZTO).kerdes("Lucy-nek milyen színű táskái vannak?")
                .valaszlehetosegek(valaszlehetosegek).build());

        db.add(Kerdes.builder().id(counter++).tipus(KerdesTipus.SKALA).kerdes("Mennyire vagyunk gazdagok?").build());
        db.add(Kerdes.builder().id(counter++).tipus(KerdesTipus.SKALA).kerdes("Mennyire alkoholista Szamanta?").build());
        db.add(Kerdes.builder().id(counter++).tipus(KerdesTipus.SKALA).kerdes("Mennyire jó a rancs?").build());
    }

    /**
     * Visszaadja az összes kérdést
     * @return
     */
    public static List<Kerdes> findAll(){
        return db;
    }

    /**
     * Visszaadja azt a kérdést aminek az id-ja megegyezik a kapott id-val egyébként null-t ad vissza
     * @param id
     * @return
     */
    public static Kerdes findById(long id){
        return db.stream().filter(kerdes -> Objects.equals(id, kerdes.getId())).findFirst().orElse(null);
    }
}
