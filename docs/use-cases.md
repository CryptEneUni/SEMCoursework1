# SET08103 - Use Case Documentation

## 1. Introduction

This document explains the main things a user can do with the population information system. The system allows users to look up information about countries, cities, populations, capital cities and languages.

I have grouped the 32 GitHub issues into 9 use cases because some of the issues are about the same feature but look at different geographical areas. For example, population information can be viewed for a city, country, continent or the whole world.

Each use case explains what the user wants to do, the steps they follow and what happens if something goes wrong.

## UC-01: View Population Information

**Related issues:** #60, #61, #62, #63, #64, #65

**Goal:** Allow the user to look up population information for different geographical areas.

**Actor:** User

**Preconditions:**
- The system is running.
- The population data is available.

**Main steps:**
1. The user chooses the population option.
2. The user selects an area, such as a city, district, region, country, continent or the whole world.
3. The system looks up the relevant information.
4. The system displays the population results.

**Alternative steps:**
- If no matching information is found, the system tells the user.
- If the data cannot be loaded, the system displays an error message.

**Postcondition:** The user can view the population information for the selected area if data is available.

---

## UC-02: View Urban and Non-Urban Population

**Related issues:** #57, #58, #59

**Goal:** Allow the user to compare urban and non-urban populations.

**Actor:** User

**Preconditions:**
- The system is running.
- The required population data is available.

**Main steps:**
1. The user chooses the urban and non-urban population option.
2. The user selects a country, region or continent.
3. The system retrieves the relevant population figures.
4. The system displays the results so the user can compare them.

**Alternative steps:**
- If the required data is missing, the system displays a message.
- If there are no results for the selected area, the system informs the user.

**Postcondition:** The user can see the urban and non-urban population figures for the selected area.

---

## UC-03: View Worldwide Language Statistics

**Related issue:** #66

**Goal:** Allow the user to see how many people speak different languages around the world.

**Actor:** User

**Preconditions:**
- The system is running.
- The language data is available.

**Main steps:**
1. The user selects the worldwide language statistics option.
2. The system retrieves information about Chinese, English, Hindi, Spanish and Arabic.
3. The system gets the number of speakers and their percentages.
4. The system displays the results.

**Alternative steps:**
- If the language data is missing, the system tells the user that the information is unavailable.
- If the data is incomplete, the system should avoid showing incorrect results.

**Postcondition:** The user can view the available statistics for the five languages.

---

## UC-04: View All Capital Cities

**Related issues:** #51, #52, #53

**Goal:** Allow the user to view capital cities and their population information.

**Actor:** User

**Preconditions:**
- Capital city and population data is available.

**Main steps:**
1. The user selects the option to view capital cities.
2. The user chooses whether to see results worldwide, by continent or by region.
3. The system finds the matching capital cities.
4. The system displays the results.

**Alternative steps:**
- If no matching capital cities are found, the system displays a message.
- If the data cannot be loaded, the system shows an error.

**Postcondition:** The user can view the capital cities matching their selection.

---

## UC-05: View a Limited List of Capital Cities

**Related issues:** #54, #55, #56

**Goal:** Allow the user to view a smaller list of capital cities for a selected area.

**Actor:** User

**Preconditions:**
- Capital city and population data is available.

**Main steps:**
1. The user selects the limited capital cities option.
2. The user chooses worldwide, continent or region.
3. The system retrieves the matching capital cities.
4. The system orders the results according to the required population ranking.
5. The system displays the limited list.

**Alternative steps:**
- If there are fewer results than expected, the system displays the available cities.
- If no matching cities are found, the system displays a message.

**Postcondition:** The user can view a limited list of capital cities.

---

## UC-06: View the Most Populous Cities

**Related issues:** #46, #47, #48, #49, #50

**Goal:** Allow the user to find the cities with the largest populations in a selected area.

**Actor:** User

**Preconditions:**
- City population data is available.

**Main steps:**
1. The user selects the most populous cities option.
2. The user chooses a district, region, country, continent or the whole world.
3. The system retrieves the matching cities.
4. The system sorts the cities by population, from largest to smallest.
5. The system displays a limited list of results.

**Alternative steps:**
- If no matching cities are found, the system displays a message.
- If fewer cities are available than the requested limit, the system displays the ones it has.

**Postcondition:** The user can see the most populous cities for the selected area.

---

## UC-07: View All Cities

**Related issues:** #41, #42, #43, #44, #45

**Goal:** Allow the user to view all cities for a selected geographical area.

**Actor:** User

**Preconditions:**
- City data is available in the database.

**Main steps:**
1. The user selects the option to view all cities.
2. The user chooses a district, country, region, continent or the whole world.
3. The system retrieves the matching cities.
4. The system arranges the results by population if required.
5. The system displays the cities and their population information.

**Alternative steps:**
- If no cities are found, the system tells the user.
- If the data cannot be loaded, the system displays an error message.

**Postcondition:** The user can view the cities matching their selection.

---

## UC-08: View the Most Populous Countries

**Related issues:** #38, #39, #40

**Goal:** Allow the user to find the countries with the largest populations.

**Actor:** User

**Preconditions:**
- Country population data is available.

**Main steps:**
1. The user selects the most populous countries option.
2. The user chooses a region, continent or the whole world.
3. The system retrieves the matching countries.
4. The system sorts them by population, from largest to smallest.
5. The system displays a limited list of countries.

**Alternative steps:**
- If no matching countries are found, the system displays a message.
- If fewer countries are available than the requested limit, the system displays the available results.

**Postcondition:** The user can view the most populous countries for the selected area.

---

## UC-09: View All Countries

**Related issues:** #35, #36, #37

**Goal:** Allow the user to view countries and their population information.

**Actor:** User

**Preconditions:**
- Country data is available in the database.

**Main steps:**
1. The user selects the option to view countries.
2. The user chooses a region, continent or the whole world.
3. The system retrieves the matching countries.
4. The system displays the countries and their population information.

**Alternative steps:**
- If no countries are found, the system displays a message.
- If the data cannot be loaded, the system shows an error.

**Postcondition:** The user can view the countries matching their selection.

---
