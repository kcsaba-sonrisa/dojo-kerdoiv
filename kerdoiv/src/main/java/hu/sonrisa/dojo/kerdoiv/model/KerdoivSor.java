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

import java.util.List;

/**
 * Eredmény DTO. Egy adott kérdésre egy adott felhasznalo osszes valaszat tartalmazza
 * @author denyiel
 */
@Data
@Builder
public class KerdoivSor {

    private String kerdes;
    private String felhasznaloNev;
    private List<String> valaszadoValasz;
}
