# Bokhandel

Bokhandelapplikasjon bygget med Spring.

## Forutsetninger

- Java Development Kit (JDK) installert
- Apache Maven installert

## Start

1. Klon repositoriet:

   ```bash
   git clone https://github.com/ditt-brukernavn/bokhandel.git

2. Bygg applikasjonen:

cd bokhandel
mvn clean install

3. Kjør applikasjonen:

mvn spring-boot:run


4. Åpne applikasjonen:

Åpne nettleseren og gå til http://localhost:8080.

## API-endepunkter
Hent alle bøker: GET /api/books
Hent en bok etter ID: GET /api/books/{id}
Legg til en ny bok: POST /api/books
Eksempel på forespørselskropp:
{
  "id": 1,
  "title": "Boktittel",
  "author": "Bokforfatter"
}
