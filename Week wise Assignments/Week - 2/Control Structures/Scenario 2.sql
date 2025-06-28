ALTER TABLE Customers ADD IsVIP VARCHAR2(5);


BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/
-- This script adds a new column 'IsVIP' to the Customers table and updates it based on the balance.