Insert Into restaurant (id,name,city) values(1,'Sushi Sho','Stockholm');
Insert Into restaurant (id,name,city) values(2,'Jinx Food Truck','Göteborg');
Insert Into restaurant (id,name,city) values(3,'Pasha Grill','Göteborg');
Insert Into restaurant (id,name,city) values(4,'Bullen','Malmö');
Insert Into restaurant (id,name,city) values(5,'Lilla Ego','Stockholm');
Insert Into restaurant (id,name,city) values(6,'Arstiderna','Malmö');


Insert into menu (id,name,type,price,restaurant_id) values(1,'Sushi Yakiniku','MAIN COURSE',99.90,1);
Insert into menu (id,name,type,price,restaurant_id) values(2,'Dumplings Kyckling','MAIN COURSE',89.90,1);
Insert into menu (id,name,type,price,restaurant_id) values(3,'Apple pie','DESSERT',35.90,1);
Insert into menu (id,name,type,price,restaurant_id) values(4,'Wine','DRINK',70.90,1);
Insert into menu (id,name,type,price,restaurant_id) values(5,'Grilled Chicken','MAIN COURSE',79.90,2);
Insert into menu (id,name,type,price,restaurant_id) values(6,'Mashed Potatoes','MAIN COURSE','99.90',2);
Insert into menu (id,name,type,price,restaurant_id) values(7,'Diamond Burger','MAIN COURSE',100.00,3);
Insert into menu (id,name,type,price,restaurant_id) values(8,'Chicken Wings','MAIN COURSE',69.90,5);
Insert into menu (id,name,type,price,restaurant_id) values(9,'Cherry pie','DESSERT',49.90,5);
Insert into menu (id,name,type,price,restaurant_id) values(10,'Shawarma','MAIN COURSE',69.90,3);


Insert into rating(id,email,rating_star,restaurant_id) values(1,'abc@gmail.com',3.5,1);
Insert into rating(id,email,rating_star,restaurant_id) values(2,'def@gmail.com',2.5,3);
Insert into rating(id,email,rating_star,restaurant_id) values(3,'ghi@gmail.com',4.5,3);
Insert into rating(id,email,rating_star,restaurant_id) values(4,'jkl@gmail.com',3.0,1);
Insert into rating(id,email,rating_star,restaurant_id) values(5,'mno@gmail.com',3.0,5);
Insert into rating(id,email,rating_star,restaurant_id) values(6,'pqr@gmail.com',4.0,2);
Insert into rating(id,email,rating_star,restaurant_id) values(7,'stu@gmail.com',2.5,5);
Insert into rating(id,email,rating_star,restaurant_id) values(8,'vwx@gmail.com',3.5,2);


