# Hibernate Annotations

`@Id`  
Marks the field as the **Primary Key** of the entity.

`@GeneratedValue(strategy = GenerationType.IDENTITY)`  
Specifies the strategy used to generate the primary key value. The available strategies are:

- **IDENTITY** — The database auto-generates the ID value (e.g., auto-increment).
- **AUTO** — JPA selects the best generation strategy based on the database dialect.
- **SEQUENCE** — Uses a database sequence object to generate values.
- **TABLE** — Uses a special table to store and generate identifier values.

Note about **SEQUENCE**: If the last issued value was 3, the next will be 4, regardless of the deletion of the record with id = 3.
