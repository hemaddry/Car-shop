CREATE TABLE Cars (
    CarID INT PRIMARY KEY,
    Make VARCHAR(50),
    Model VARCHAR(50),
    Year INT,
    Price DECIMAL(10, 2)
);

INSERT INTO Cars (CarID, Make, Model, Year, Price)
VALUES (1, 'Toyota', 'Corolla', 2020, 20000);

INSERT INTO Cars (CarID, Make, Model, Year, Price)
VALUES (2, 'Honda', 'Civic', 2019, 18000);
