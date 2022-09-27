Oftmals ist es sinnvoll, ein Objekt nicht komplett neu aufzubauen, sondern ein bestehendes Objekt zu klonen und an diesem Objekt Änderungen vorzunehmen. 
In dieser Aufgabe wollen wir das am Beispiel der Mitarbeiterverwaltung in einem Krankenhaus umsetzen. 
Stellen Sie sich vor, dass es in unserem System sehr aufwändig ist, einen neuen Mitarbeiter anzulegen, da dafür viele Werte aus verschiedenen Quellen gelesen werden müssen. 
Zudem unterscheiden sich die Werte der einzelnen Mitarbeiter nur punktuell (am Vornamen, am Nachnamen, an der Adresse oder an der Position). 
Es liegt also nahe, einen Prototyp eines Mitarbeiters zu erzeugen und diesen als Vorlage bei der Erzeugung weiterer Mitarbeiter zu nutzen.
Ihre Aufgabe ist es nun, dieses Problem mit dem Prototype-Pattern zu lösen. 
Da in Zukunft potenziell weitere Mitarbeitertypen gebraucht werden, nutzen Sie eine abstrakte Oberklasse Employee. 
Unsere Klasse Krankenhausmitarbeiter (HospitalEmployee) ist eine konkrete Unterklasse von Employee.
Beachten Sie, dass es sich bei dem Attribut address nicht um einen primitiven Datentyp handelt, die Klasse Address also selbst das Cloneable-Interface implementieren muss.