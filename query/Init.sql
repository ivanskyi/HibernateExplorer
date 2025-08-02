WITH inserted_manufacturers AS (
INSERT
INTO manufacturer (name)
VALUES
    ('Toyota'), ('Ford'), ('BMW'), ('Tesla'), ('Audi')
    RETURNING id, name
    ), inserted_models AS (
INSERT
INTO model (name, description, manufacturer_id)
SELECT
    CASE name
    WHEN 'Toyota' THEN 'Camry'
    WHEN 'Ford' THEN 'Mustang'
    WHEN 'BMW' THEN 'X5'
    WHEN 'Tesla' THEN 'Model S'
    WHEN 'Audi' THEN 'A4'
    END AS model_name, CASE name
    WHEN 'Toyota' THEN 'Mid-size sedan'
    WHEN 'Ford' THEN 'Sports car'
    WHEN 'BMW' THEN 'Luxury SUV'
    WHEN 'Tesla' THEN 'Electric sedan'
    WHEN 'Audi' THEN 'Compact executive car'
    END AS description, id AS manufacturer_id
FROM inserted_manufacturers
    RETURNING id, manufacturer_id
    ), inserted_dealers AS (
INSERT
INTO dealer (name)
SELECT name || ' Dealer'
FROM inserted_manufacturers
    RETURNING id, name
    )
INSERT
INTO dealer_model (dealer_id, model_id)
SELECT d.id, m.id
FROM inserted_dealers d
         JOIN inserted_manufacturers mf ON d.name LIKE mf.name || '%'
         JOIN inserted_models m ON m.manufacturer_id = mf.id;
