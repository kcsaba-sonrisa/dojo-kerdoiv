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

import hu.sonrisa.dojo.kerdoiv.model.Felhasznalo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Felhasználói adatbázis. DO NOT MODIFY
 * @author denyiel
 */
public class FelhasznaloService {

    private static List<Felhasznalo> felhasznalok = new ArrayList<>();

    static{
        felhasznalok.add(Felhasznalo.builder().id(1).nev("Dzsoki").build());
        felhasznalok.add(Felhasznalo.builder().id(2).nev("Szamanta").build());
        felhasznalok.add(Felhasznalo.builder().id(3).nev("Bobi").build());
        felhasznalok.add(Felhasznalo.builder().id(4).nev("Elli").build());
    }

    /**
     * Visszaad egy felhasználót akivel egyezik a beadott id
     * @param key
     * @return
     */
    public static Felhasznalo getFelhasznaloById(Long key) {
        return felhasznalok.stream()
                .filter(felhasznalo -> Objects.equals(key.longValue(), felhasznalo.getId()))
                .findFirst()
                .orElse(null);
    }
}
