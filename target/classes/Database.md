# Pavle

### **pojdme si vysvetlit jak funguje nase lit databaze**

#### prvne bych zacal tim, ze nefunguje

ted, kdyz v tom mame vsichni jasno, tak muzem pokracovat

mas 2 zakladni tabulky

* User

    uklada uzivatele (jmeno, heslo) s IDeckem ~~(eventulne tam bude i pocet odehranych her a skore)~~ uz tam jsou

* Game

    uklada odkaz na dva uzivetele, odkaz na tabulku tahu a IDecko
    
    * tabulky move obsahuje x/y informaci a IDecko hry ke ktere jsou referencovany
        zaroven tyto tabulky obsahuji vsechny tahy co kdy byli, takze po 100 hrach tam bude cca 7900 zaznamu
        https://chess.stackexchange.com/questions/2506/what-is-the-average-length-of-a-game-of-chess#:~:text=The%20average%20length%20is%2079,due%20to%20people%20resigning%20early.&text=If%20you%20want%20to%20use,approximated%20by%20the%20following%20expression.
        coz uplne nevim jak bude fungovat, protoze podle internetu je max pocet radku 1 * 10^9, coz je ultimatne circa 126 * 10^3 her... a to neni mnoho
       https://stackoverflow.com/questions/2716232/maximum-number-of-records-in-a-mysql-database-table