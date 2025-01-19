USE [master]
GO

/****** Object:  Database [CourseManagement]    Script Date: 01/13/2025 04:45:35 ******/
CREATE DATABASE CourseManagement
GO

USE CourseManagement
GO

CREATE TABLE Users (

    userID varchar(50) NOT NULL,
    fullName nvarchar(500) NOT NULL,
    password varchar(50) NOT NULL,
    CONSTRAINT PK_tblUsers PRIMARY KEY CLUSTERED 
    (userID ASC)
    
)
GO

CREATE TABLE Courses (

    id char(5) NOT NULL,
    name nvarchar(50) NOT NULL,
    description nvarchar(500) NOT NULL,
    duration int NOT NULL,
    fee float NOT NULL,
    CONSTRAINT PK_tblCourses PRIMARY KEY CLUSTERED 
    (id ASC)
    
)
GO	

INSERT Users (userID, fullName, password) VALUES (N'U001', N'Alice Doe', N'password123');
INSERT Users (userID, fullName, password) VALUES (N'U002', N'Bob Smith', N'password456');
INSERT Courses (id, name, description, duration, fee) VALUES (N'C001', N'Intro to Python', N'Learn Python basics', 6, 300.00);
INSERT Courses (id, name, description, duration, fee) VALUES (N'C002', N'Data Science', N'Learn data science fundamentals', 8, 500.00);