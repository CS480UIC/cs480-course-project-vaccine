GLOSSARY
----
----
synonyms and description
-----------------------

**Entity name:** vaccine\
**Synonyms:** vaccine_database, warehouse for vaccines\
**Description:** vaccine entity has the type of vaccines available at the warehouse(pharmaceutical company). Their respective availability, number of available vaccines for each type  and the temperature required to store them. It also has the cost of each vaccine set by the pharmacutical company.

**Entity name:** country\
**Synonyms:** nation\
**Description:** country entity has the country ID, name and the percentage of vaccinated population for each type of vaccine. It also has the total population of the country. A country places *order* for it's population and sets the cost according to it's currency and economy. Note: Currencies are normalised to USD.

**Entity name:** state\
**Synonyms:** province\
Description: state entity has Foreign key from country and various attributes like state name, population, vaccination percentage etc. It also has additional attribute for cost for above and below poverty line people as some might not be able to afford costly vaccine.

**Entity name:** zip code\
**Synonyms:** District\
**Description:** zip code entity has foreign key from country and state. It has the data for it's population and the cost along with vaccination percentage.

**Entity name:** person\
**Synonyms:** people, individual\
**Description:** Stores data about each individual, their ID, ID type and their vaccination status. It also has information about poverty and if they require subsidized rates.

**Entity name:** order\
**Synonyms:** order placed\
**Description:** This contains the orders placed by various countries for vaccines. It maintains details about the quantity and what all vaccines are required. Foreign keys are from vaccine.


maxima and minima
---------------------------
<!-- ![alt text](https://github.com/AmritRVardhan/CS480UIC/cs480-course-project-vaccine/blob/[branch]/image.jpg?raw=true) -->
![Alt text](https://github.com/CS480UIC/cs480-course-project-vaccine/blob/main/documentation/vaccine.drawio.png?raw=true "ER Diagram")

dependent entities and dependency relationships
---------------
person, zip_code, state are dependent\
country and vaccine are independent

person depends on zip_code\
zip_code depends on state\
state depends on country\
all_order depends on country\
vaccine and country are independent

cascade and restrict actions for dependency relationships
-----------------------
order_goesTo_vaccine Cascade restrict\
country_places_order Cascade Delete\
state_in_country Cascade Delete\
zipcode_in_state Cascade Delete\
person_in_zipcode Cascade Restrict


cascade and restrict rules on foreign keys that implement dependency relationships
----------------------------


attribute types
-----------------------------

Attribute Types are available in the Conceptual/Logical Design

