# Composite
Ein Dateisystem besteht üblicherweise aus einer Menge von Ordnern (Directory) und einer Menge von Dateien (File), 
wobei ein Ordner weitere Ordner und Dateien enthalten kann.
In dieser Aufgabe wollen wir das Prinzip nutzen, um einen Moodle-Kurs nachzubauen, 
der aus Lerneinheiten besteht, die wiederum weitere Lerneinheiten oder einzelne Dateien enthalten können. 
Außerdem soll eine Möglichkeit existieren, die Namen der Lerneinheiten bzw. Dateien auf der Konsole auszugeben. 
Bei Lerneinheiten soll dabei nicht nur der Name der Lerneinheit, 
sondern auch rekursiv die Namen aller Unterelemente (FileSystemComponent) ausgegeben werden.
Verwenden Sie das Design Pattern Composite, um die beschriebene Aufgabe zu lösen.