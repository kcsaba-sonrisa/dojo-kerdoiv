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
package hu.sonrisa.dojo.kerdoiv;

import hu.sonrisa.dojo.kerdoiv.model.KerdoivSor;
import hu.sonrisa.dojo.kerdoiv.service.ValaszPrintService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author denyiel
 */
public class KerdoivApp {

    /**
     * Main: Do not modify this method
     * @param args
     */
    public static void main(String[] args) {

        List<KerdoivSor> sorok = Arrays.asList(
                KerdoivSor.builder().kerdes("Kerdes1").felhasznaloNev("Andi").valaszadoValasz(Arrays.asList("A1", "A2", "A3")).build(),
                KerdoivSor.builder().kerdes("Kerdes1").felhasznaloNev("Béla").valaszadoValasz(Arrays.asList("B1", "B2", "B3")).build(),
                KerdoivSor.builder().kerdes("Kerdes1").felhasznaloNev("Cecil").valaszadoValasz(Arrays.asList("C1", "C2", "C3")).build(),
                KerdoivSor.builder().kerdes("Kérdés3").felhasznaloNev("Cecil").valaszadoValasz(Arrays.asList("F1", "F2", "F3")).build(),
                KerdoivSor.builder().kerdes("Kérdés2").felhasznaloNev("Béla").valaszadoValasz(Arrays.asList("D1", "D2", "D3")).build(),
                KerdoivSor.builder().kerdes("Kérdés2").felhasznaloNev("Andi").valaszadoValasz(Arrays.asList("E1", "E2", "E3")).build()
        );

        printSorok(sorok);
        printSorok(ValaszPrintService.getSzabadszavasSorok());
        printSorok(ValaszPrintService.getFeleletvalasztoSorok());
        printSorok(ValaszPrintService.getSkalaSorok());

    }

    /**
     * Kinyomtat egy adag sort amit a {@link KerdoivSor}-ban írtunk le
     * @param sorok
     */
    private static void printSorok(List<KerdoivSor> sorok) {
        sorok.stream().collect(Collectors.groupingBy(KerdoivSor::getKerdes)).entrySet().forEach(kerdesSorEntry -> {
            System.out.println(kerdesSorEntry.getKey());
            System.out.println("=========================");

            kerdesSorEntry.getValue().forEach(kerdoivSor -> {
                System.out.print(kerdoivSor.getFelhasznaloNev() + ": ");
                System.out.println(kerdoivSor.getValaszadoValasz().stream().collect(Collectors.joining(", ")));
            });
            System.out.println();
        });    
         
        /**
         * ELSŐ FELADAT: Implementáljuk ezt a metódust úgy, hogy az inputként megkapott kérdőív sorokat
         * a lenti példában megadott formában írassuk ki a konzolra:
         *
         * Kerdes1
         * =========================
         * Andi: A1, A2, A3
         * Béla: B1, B2, B3
         * Cecil: C1, C2, C3
         *
         * Kérdés3
         * =========================
         * Cecil: F1, F2, F3
         *
         * Kérdés2
         * =========================
         * Béla: D1, D2, D3
         * Andi: E1, E2, E3
         *
         */
    }
}
