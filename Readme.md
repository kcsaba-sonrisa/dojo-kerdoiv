# Java stream
Demo solution can be found on the “demo_solution” branch.

### Source: there is no external source

### Technology
- Java 8

## Introduction
```
Adot egy kérdőív alkalmazást alapja, melyben vannak Kérdések. Ezekhez a kérdésekhez vannak válaszok melyeket felhasználók generálnak.
Jelenlegi probléma az, hogy ezek mind egy adatbázis bizonyos tábláiban szerepelnek. 
A feladunk, hogy ezeket a kérdéseket és válaszokat egy előre megadott struktúrában tudjuk kinyomtatni. A dojo összesen 4 alfeladatra van bontva.

A 4 megoldandó feladat leírását a KerdoivApp és a ValaszPrintService osztályok egyes függvényei tartalmazzák. 
A feladatmegoldások során csak a KerdoivApp illetve a ValaszPrintService osztályokat módosíthatjuk!
```
```
OBJEKTUMOK:

- KÉRDÉS: tartalmazza magáz a kérdést és hogy hogy milyen típusú
- KÉRDES_TIPUS: 
    - szabadszavas: A válasz egy String. Egy kérdéshez egy felhasználó többet is megadhatott
    - feleletvalasztó: Kérdésben egy integer értékkel lehet megjelöltni a valaszlehetőségek közül, hogy melyik választ válaszotta a felhasznaló (csak egyet többet is választhat)
    - skála: Kérdésben egy integer értékkel lehet megjelölni a megválaszolt skála értékét
- VÁLASZ: leírja hogy az adott kérdésre mely felhasználó mit válaszolt
- KerdoivSor: Ilyen formában kell kigyüjteni az eredményeket felhasznaló és kérdés szerint

TÁBLÁK:
- Kérdés
- Felhasznaló
- Válasz

Ezekből a táblákból a FelhasznaloService, KerdesService és a ValaszService segítségével lehet adatokat lekérdezni. A lekérdezések előre meg vannak írva, azokon már nem kell módosítani és újakat sem kell írni.
```
## Stories 

#### 1. feladat

```
Implementáljuk a printSorok() metódust úgy, hogy az inputként megkapott kérdőív sorokat 
a lenti példában megadott formában írassuk ki a konzolra.
```

#### 2. feladat
```
Implementáljuk a getSzabadszavasSorok() metódust úgy, hogy logolja ki a konzolra az adatbázisban található
szabadszavas kérdéseket a hozzá tartozó válaszokkal úgy, hogy a válaszokat felhasználó szerint rendezi.
```

#### 3. feladat
```
Implementáljuk a getFeleletvalasztoSorok() metódust úgy, hogy logolja ki a konzolra az adatbázisban található
feleletválasztós kérdéseket és a hozzá tartozó válaszokat úgy, hogy a válaszokat felhasználó szerint rendezi.
```

#### 4. feladat
```
Implementáljuk a getSkalaSorok() metódust úgy, hogy logolja ki a konzolra az adatbázisban található
skálázós kérdéseket és a hozzá tartozó válaszokat úgy, hogy a válaszokat felhasználó szerint rendezi.
```

## Example

#### 1. feladat
```
A kapott eredmény az alábbi kell legyen:

        Kerdes1
                =========================
        Andi: A1, A2, A3
        Béla: B1, B2, B3
        Cecil: C1, C2, C3

        Kérdés3
                =========================
        Cecil: F1, F2, F3

        Kérdés2
                =========================
        Béla: D1, D2, D3
        Andi: E1, E2, E3
```

#### 2. feladat
```
A kapott eredmény az alábbi kell legyen:
         
         Megy a biznic?
         =========================
         Dzsoki: Megy?
         Szamanta: Mit főzzek Dzsok?
         Bobi: Menne?
         Elli: Nem értek hozzá?
         
         Hány részes a Dallas?
         =========================
         Dzsoki: 23131
         Szamanta: Innák inkább
         Elli: Mit főzzek Dzsok?
         
         Van elég olaj?
         =========================
         Dzsoki: Fúj ez tea., Egyébként van
         Szamanta: Whiskey
         Bobi: Akad

```

#### 3. feladat
```
A kapott eredmény az alábbi kell legyen:
        
         Hol veszünk idén olajmezőket?
         =========================
         Dzsoki: Arkansas
         Szamanta: Dallas, Alaszka
         Bobi: Alaszka
         Elli: Somogy megye
        
         Dzsok milyen söröket szeret?
         =========================
         Dzsoki: Duff
         Szamanta: Ászok, Pilsner
         Bobi: Pilsner
         Elli: Swvinjan
        
         Lucy-nek milyen színű táskái vannak?
         =========================
         Dzsoki: Kék
         Szamanta: Zöld, Sárga
         Bobi: Sárga
         Elli: Piros
```
         
#### 4. feladat
```
A kapott eredmény az alábbi kell legyen:
           
            Mennyire vagyunk gazdagok?
            =========================
            Dzsoki: **
            Szamanta: **
            Bobi: *****
            Elli: ****
           
            Mennyire alkoholista Szamanta?
            =========================
            Dzsoki: *
            Szamanta: *****
            Bobi: **
            Elli: *
           
            Mennyire jó a rancs?
            =========================
            Dzsoki: **
            Szamanta: **
            Bobi: ***
            Elli: *
```
