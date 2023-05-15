# Bokhandel

Bokhandelapplikasjon bygget med Spring.

## Forutsetninger

- Java Development Kit (JDK) installert
- Apache Maven installert

## Start

1. Klon repositoriet:

   - git clone https://github.com/JanWilliamHaug/bokhandel.git

2. Bygg applikasjonen:

 - cd bokhandel <br> 
 - mvn clean install

3. Kjør applikasjonen:

 - mvn spring-boot:run


4. Åpne applikasjonen:

- Åpne nettleseren og gå til http://localhost:8080.

## API-endepunkter
- Hent alle bøker: GET /api/books <br> 
- Hent en bok etter ID: GET /api/books/{id} <br> 
- Legg til en ny bok: POST /api/books <br> 


## Eksempel på forespørselskropp: <br> 
{<br> 
  "id": 1, <br> 
  "title": "Boktittel", <br> 
  "author": "Bokforfatter" <br> 
}

## Legge til bøker fra Book.json eksempel:
$books = Get-Content -Raw -Path "C:\Users\Willi\Desktop\bokhandel\bokhandel\book.json" | ConvertFrom-Json

$books | ForEach-Object {
    $jsonData = $_ | ConvertTo-Json
    Invoke-RestMethod -Uri "http://localhost:8080/api/books" -Method POST -ContentType "application/json" -Body $jsonData
}

## Hent alle bøker: `GET /api/books` eksempel:

   Bruk `curl`-kommandoen eller et lignende verktøy for å sende en GET-forespørsel og hente alle bøkene fra API-et.

   Med `curl`:

   curl http://localhost:8080/api/books

## Hent en bok etter ID: `GET /api/books/{id}` eksempel:

   Bruk `curl`-kommandoen eller et lignende verktøy for å sende en GET-forespørsel og hente en spesifikk bok basert på dens ID fra API-et.

   Med `curl`:

    curl http://localhost:8080/api/books/2 

<br> 
Denne applikasjonen er bygget ved å følge MVC (Model-View-Controller) arkitekturmønsteret.

