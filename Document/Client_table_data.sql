CREATE TABLE Client (
    ClientID int IDENTITY(1,1) PRIMARY KEY,
    LastName varchar(155),
    FirstName varchar(100),
    Phone varchar(10),
    Dob varchar(8),
    Address varchar(255),
    City varchar(255)
);

INSERT INTO Client (FirstName,LastName,Phone,Dob,Address,City)
VALUES ('Phat','Vo','0345678999','20000808','Somewhere, W8','HCMC');
INSERT INTO Client (FirstName,LastName,Phone,Dob,Address,City)
VALUES ('Tien','Vo','0345678901','20000707','Somewhere, W9','HCMC');
INSERT INTO Client (FirstName,LastName,Phone,Dob,Address,City)
VALUES ('Trien','Vo','0345678902','20000606','Somewhere, W10','HCMC');
INSERT INTO Client (FirstName,LastName,Phone,Dob,Address,City)
VALUES ('Ho','Nguyen','0345678903','20000505','Somewhere, W11','HCMC');
INSERT INTO Client (FirstName,LastName,Phone,Dob,Address,City)
VALUES ('Hung','Nguyen','0345678904','20000404','Somewhere, W12','HCMC');