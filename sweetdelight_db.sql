CREATE DATABASE sweet_delight_db

USE sweet_delight_db

----------------------------------------- Tables -------------------------------------------------

CREATE TABLE Accounts(
	id varchar(355) primary key,
	username varchar(100) unique not null,
	email varchar(150) unique not null,
	password varchar(150) not null,
	firstname nvarchar(200),
	lastname nvarchar(200),
)

----------------------------------------

CREATE TABLE Categories(
	id int primary key,
	name nvarchar(200)
)

----------------------------------------

CREATE TABLE Stores(
	id int primary key,
	name nvarchar(200),
	address nvarchar(200),
	phone varchar(15)
)

----------------------------------------

CREATE TABLE Products(
	id bigint identity(1000,1) primary key,
	name nvarchar(255),
	price decimal(10,1),
	description text,
	created_at date,
	sales_count bigint,
	rate decimal(3,1),
	status varchar(150),
	image_url varchar(255),
	category_id int,
	store_id int,
	constraint FK_Product_Categories FOREIGN KEY(category_id) references Categories(id),
	constraint FK_Product_Stores FOREIGN KEY(store_id) references Stores(id)
)

----------------------------------------

CREATE TABLE Orders(
	tracking_number bigint identity(10000,1) primary key,
	created_at date,
	address nvarchar(255),
	total decimal(10,1),
	status varchar(150),
	account_id varchar(355) not null,
	constraint FK_Orders_Accounts FOREIGN KEY(account_id) references Accounts(id)
)

----------------------------------------

CREATE TABLE LineItems(
	product_id bigint not null,
	order_id bigint not null,
	quantity int default 1,
	constraint PK_LineItems PRIMARY KEY(product_id, order_id),
	constraint FK_LI_Products FOREIGN KEY(product_id) references Products(id),
	constraint FK_LI_Orders FOREIGN KEY(order_id) references Orders(tracking_number)
)

----------------------------------------















