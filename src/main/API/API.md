# Karl API :

co je to zivot ? Nevis ? Tak ja ti pomuzu... Tvuj cas je, muj mily Karle, vzacnejsi nez ty. Pokud si nekdy budes muset
vybrat mezi sebou a casem, vyber si cas. V kazdem pripade si Karle domu nevod nezne pohlavi, vlastne ani to drsne
pohlavi... Nikdy nevis kdy na tebe spadne ocelova tyc z Trinecke zelezarny, vyrobena pane Jaroslave Netkalym, a usekne
ti pravy zapesti...

S pozdravem a laskou, ten debil co si s tebou vymenil backend...

**_`localhost:8080/Chess/`_**
***

## User

class User {

"name": String value,

"password" : String value

}

**_`user/`_**

* GET `vraci přihlášeného uživatele, null pokud není přihlášený`

* PUT `updatuje heslo uživatele, očekává objekt User, vrací status`

* DELETE `smaže uživatele, očekává objekt User, vrací status`

**_`user/login`_**

* POST `prihlasi uzivatele, vraci status, ocekava objekt User`

**_`user/register`_**

* POST `vytvori noveho uzivatele, ocekava objekt User, vraci status`

****

## Game

**_`matchmake/`_**

* POST `JÁ NEVÍM`

**_`game/`_**

* POST _~~zatim nevim jak, ale tady se budou posilat pohyby~~_
* GET _~~zatim nevim jak, ale tady dostanes informace o hre (jak dlouho trva, kdo v ni hraje...)~~_
* DELETE _~~zatim nevim jak, ale leavnes hru~~_

****

## Leaderboard

* GET `String parametr toho co ocekava`

    "Top" -> 50 hracu s nejvice bodama
    "Runs" -> 50 hracu s nejvice odehranejma hrama
    "TopRuns" -> 50 hracu s nejvice vyhranejma hrama