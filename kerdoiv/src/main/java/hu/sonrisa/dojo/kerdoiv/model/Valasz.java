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
package hu.sonrisa.dojo.kerdoiv.model;

import lombok.Builder;
import lombok.Data;

/**
 * Adott kérdésre adott felhasználó által adott válasz
 * {@link KerdesTipus.SZABAD_SZOVEGES} kérdéstípus esetén válasszöveg van kitöltve
 * {@link KerdesTipus.FELELET_VALASZTO} kérdéstípus esetén valaszertek van kitöltve
 * {@link KerdesTipus.SKALA} kérdéstípus esetén valaszertek van kitöltve
 * @author denyiel
 */
@Data
@Builder
public class Valasz {

    private long kerdesId;
    private long felhasznaloId;
    private String valaszSzoveg;
    private int valaszErtek;

}
