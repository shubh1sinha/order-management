Create Table orders(

    orderid int NOT NULL,

    customername varchar(20) Default NULL,

    Primary Key(orderid)

);



Create Table address(

    addressid int NOT NULL,

    houseno varchar(20) Default NULL,

    city varchar(20) Default NULL,

    pincode double Default NULL,

    Primary Key(addressid)

);



Create Table item(

    itemid int NOT NULL,

    itemname varchar(20) Default NULL,

    itemprice double Default NULL,

    Primary Key(itemid)

);