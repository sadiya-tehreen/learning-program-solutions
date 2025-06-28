DECLARE
    v_age NUMBER;
BEGIN
    FOR loan_rec IN (SELECT LoanID, CustomerID, InterestRate, DOB FROM Loans JOIN Customers USING(CustomerID)) LOOP
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, loan_rec.DOB) / 12);
        
        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = loan_rec.LoanID;
        END IF;
    END LOOP;

    COMMIT;
END;
/
