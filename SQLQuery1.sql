Create database Accounts
GO

Use Accounts
GO

Create table Account
(
	Id int primary key identity,
	Password varchar(15) NOT NULL,
	FullName nvarchar(100) NOT NULL,
	Gender bit NOT NULL,
	Birthday date NOT NULL,
	Address nvarchar(225) NOT NULL,
	Email varchar(100) NOT NULL,
	Phone varchar(12) NOT NULL
)
GO

INSERT INTO Account(Password, FullName, Gender,Birthday, Address, Email, Phone) VALUES
('12345', N'Nguyễn Thị Yến', 'true', '2004-01-13', N'Bắc Ninh', 'yen@gmail.com', '0474674646')
GO

Select * from Account
GO

Select * from Account Where Id = 1
GO

Delete from Account Where Id = 7
go

