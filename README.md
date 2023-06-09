# inheritance

# 1. Feladat: hasonló osztályok késztése
Készítsünk egy programot, amiben állatokat tartunk nyílván: 
macskákat, kutyákat, teheneket és oroszlánokat!
Ehhez szükségünk lesz létrehozni minden állatfajból egy-egy osztályt:
`Cat`, `Dog`, `Cow`, `Lion`. 

Minden állatnak van neve (`name`) és életkora (`age`), és minden állat
tud köszönni (`sayHello()`) és tudja üdvözölni a felhasználót (`sayHelloTo(userName: String)`).

Gyakorlatilag minden egyes osztályunkban szerepelnie kéne ugyanennek a kódnak:
(A konstruktorokat most direkt figyelmen kívül hagyjuk!)
```
// Fieldek
private String name;
private int age;

// Metódusok
public void sayHello(){
    System.out.println("Hello, my name is " + this.name + "!");
}

public void sayHelloTo(String userName) {
    System.out.println("Hi, " + userName + "! Nice to meet you, I am " + this.name + "!");
}

// Getterek és setterek
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}
```
Tehát ezt a kódrészletet nekem egyesével be kéne másolnom 
a `Cat`, a `Dog`, a `Cow`, és a`Lion` osztályokba...

Eléggé redundánsnak és unalmasnak tűnik, nem? 
Mi van, ha módosítani szerentém a felhasználó üdvözlésének a módját? 
Ilynekor minden egyes osztályban át kéne írnom az ezért felelős kódsort. 
De mi van, ha véletlenül egy osztályban ezt elfelejtem megtenni?

**A meglévő osztályaink UML osztálydiagramja jelenleg így néz ki:**
![Cat Dog Cow Lion](res/Cat%20Dog%20Cow%20Lion.PNG)
_Megjegyzés: a getter és setter metódusokat nem szokás külön megjeleníteni
az osztálydiagramokban._