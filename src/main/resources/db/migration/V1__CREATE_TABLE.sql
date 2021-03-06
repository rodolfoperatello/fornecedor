CREATE TABLE ADDRESS(
ADDRESS_ID SERIAL PRIMARY KEY,
COUNTRY varchar(20) NOT NULL,
STATE varchar(2) NOT NULL,
CITY varchar(30) NOT NULL,
NEIGHBORHOOD varchar(30) NOT NULL,
STREET varchar(30) NOT NULL,
STREET_NUMBER varchar(7) NOT NULL,
ZIPCODE varchar(12) NOT NULL,
SHIPPING_ID int NOT NULL
);

CREATE TABLE PRODUCT(
PRODUCT_ID SERIAL PRIMARY KEY,
TITLE varchar(30) NOT NULL,
PRICE decimal(6,2) NOT NULL,
QUANTITY int NOT NULL,
SHIPPING_ID int NOT NULL
);

CREATE TABLE SHIPPING(
SHIPPING_ID SERIAL PRIMARY KEY,
NAME varchar(30) NOT NULL,
FEE decimal(6,2) NOT NULL,
DELIVERY_DATE date NOT NULL
);

ALTER TABLE ADDRESS ADD CONSTRAINT FK_ADDRESS_SHIPPING FOREIGN KEY (SHIPPING_ID) REFERENCES SHIPPING(SHIPPING_ID);
ALTER TABLE PRODUCT ADD CONSTRAINT FK_PRODUCT_SHIPPING FOREIGN KEY (SHIPPING_ID) REFERENCES SHIPPING(SHIPPING_ID);
