# Leírás

Kérdőív alkalmazást kell fejleszteni melyben vannak Kérdések. Ezekhez a kérdésekhez vannak válaszok melyeket felhasználók generálnak.
Jelenlegi probléma az, hogy ezek mind egy adatbázis bizonyos tábláiban szerepelnek. A feladat az, hogy ezeket a kérdéseket válaszokat
egy előre megadott struktúrában kell kinyomtatni. A feladat részleteit a KerdoivApp illetve a ValaszPrintService osztályokban lehet megtalálni

## OBJEKTUMOK:

* KÉRDÉS: tartalmazza magáz a kérdést és hogy hogy milyen típusú
* KÉRDES_TIPUS: 
	* szabadszavas: A válasz egy String. Egy kérdéshez egy felhasználó többet is megadhatott
	* feleletvalasztó: Kérdésben egy integer értékkel lehet megjelöltni a valaszlehetőségek közül, hogy melyik választ válaszotta a felhasznaló (csak egyet többet is választhat)
	* skála: Kérdésben egy integer értékkel lehet megjelöltni a megválaszolt skála értékét
* VÁLASZ: leírja hogy az adott kérdésre mely felhasználó mit válaszolt
* KerdoivSor: Ilyen formában kell kigyüjteni az eredményeket felhasznaló és kérdés szerint

## TÁBLÁK:
* Kérdés
* Felhasznaló
* Válasz

Ezekből a FelhasznaloService, KerdesService és a ValaszService segítségével lehet adatokat lekérdezni

## FONTOS
A feladat során csak a KerdoivApp illetve a ValaszPrintService osztályokat módosítsuk!!!