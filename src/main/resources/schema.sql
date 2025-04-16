-- Create the login table
CREATE TABLE IF NOT EXISTS login (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);

-- Insert test data
INSERT INTO login (username, password) VALUES ('limsa', 'limsa@123');
INSERT INTO login (username, password) VALUES ('root', 'Password@123');
