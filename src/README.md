Gruppemedlemmer: Alberte, Mads, Jacob og Thomas.

Vores login system, starter med en menu, hvor man enten kan logge ind med eksisterende brugere eller skab en ny bruger.
Hvis man vælger 1. login, så skal bruger indtaste sit brugernavn, hvis det ikke findes i usernames, må de prøve igen. ellers går det videre til at bruger skal indtaste kodeord.
Bruger har 3 forsøg til at indtaste det rigtige kodeord.

Hvis man vælger 2, kan man tilføje en bruger. hvor vores metode changeArray ændre usernames og passwords til en kopi med en ekstra plads. Herefter tilføjer vores addUser metode brugerens input til en ny bruger.

Vi tilføjede også en 3. afslut, for at stoppe programmet, hvis man ikke vil logge ind.

Fejl:

Test ugyldigt brugernavn: bob forkert, Bob korrekt.
Vi har testet om forsøgene tæller ned, og når alle forsøg er brugt op.
Vi testede at username var forkert første gang, og rigtigt anden gang. Her havde vi et problem med den kendte int til string input glitch, vi løste det med at have en input.NextLine() på linje 21.


Overvejelser:
Hvis 2 usernames/passwords er ens, tager en det første placeringsnummer der matcher i linearSearch, dette gør at den slår fejl, hvis det er 2. bruger der skal bruge den. 
Dette kunne løses ved at stoppe repeats når nye brugere bliver tilføjet.
Om det er en dum ide at den siger når brugernavn er rigtigt. Så man kan se at hvilke brugernavne der er i systemet.
Kunne være smartere hvis man tastede brugernavn og kodeord ind samtidigt, og ikke ved hvilket et der var forkert.