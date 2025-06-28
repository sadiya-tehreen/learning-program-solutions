CREATE OR REPLACE PROCEDURE TransferFunds (
    from_account IN NUMBER,
    to_account IN NUMBER,
    amount IN NUMBER
) AS
    from_balance NUMBER;
    insufficient_funds EXCEPTION;
BEGIN
    -- Get balance
    SELECT Balance INTO from_balance FROM Accounts WHERE AccountID = from_account;

    IF from_balance < amount THEN
        RAISE insufficient_funds;
    END IF;

    -- Deduct
    UPDATE Accounts
    SET Balance = Balance - amount,
        LastModified = SYSDATE
    WHERE AccountID = from_account;

    -- Add
    UPDATE Accounts
    SET Balance = Balance + amount,
        LastModified = SYSDATE
    WHERE AccountID = to_account;

    COMMIT;

EXCEPTION
    WHEN insufficient_funds THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance in source account.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
