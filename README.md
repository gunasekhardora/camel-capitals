# camel-capitals
Capital city search with Apache Camel

## To build locally
- mvn clean package

## To run locally
- mvn spring-boot:run

## To test with a container
- docker pull kgsdora/capitals:latest
- docker run -d -p 1212:8080 kgsdora/capitals:latest

- `curl localhost:1212/api/monitor`

```
"I'm up!"
```

- `curl localhost:1212/api/capital/del`

```
[ {
  "name" : "India",
  "topLevelDomain" : [ ".in" ],
  "alpha2Code" : "IN",
  "alpha3Code" : "IND",
  "callingCodes" : [ "91" ],
  "capital" : "New Delhi",
  "altSpellings" : [ "IN", "Bhārat", "Republic of India", "Bharat Ganrajya" ],
  "region" : "Asia",
  "subregion" : "Southern Asia",
  "population" : 1295210000,
  "latlng" : [ "20.0", "77.0" ],
  "demonym" : "Indian",
  "area" : 3287590,
  "gini" : 33.4,
  "timezones" : [ "UTC+05:30" ],
  "borders" : [ "AFG", "BGD", "BTN", "MMR", "CHN", "NPL", "PAK", "LKA" ],
  "nativeName" : "भारत",
  "numericCode" : "356",
  "currencies" : [ {
    "code" : "INR",
    "name" : "Indian rupee",
    "symbol" : "₹"
  } ],
  "languages" : [ {
    "iso639_1" : "hi",
    "iso639_2" : "hin",
    "name" : "Hindi",
    "nativeName" : "हिन्दी"
  }, {
    "iso639_1" : "en",
    "iso639_2" : "eng",
    "name" : "English",
    "nativeName" : "English"
  } ],
  "translations" : {
    "de" : "Indien",
    "es" : "India",
    "fr" : "Inde",
    "ja" : "インド",
    "it" : "India",
    "br" : "Índia",
    "pt" : "Índia",
    "nl" : "India",
    "hr" : "Indija",
    "fa" : "هند"
  },
  "flag" : "https://restcountries.eu/data/ind.svg",
  "regionalBlocs" : [ {
    "acronym" : "SAARC",
    "name" : "South Asian Association for Regional Cooperation",
    "otherAcronyms" : [ ],
    "otherNames" : [ ]
  } ],
  "cioc" : "IND"
} ]
```

Courtesy: https://restcountries.eu/
