INSERT INTO manufacturer(manufacturer_name, manufacturer_mail, manufacturer_phone) VALUES ('Gibson', 'gibson@mail', '555');
INSERT INTO manufacturer(manufacturer_name, manufacturer_mail, manufacturer_phone) VALUES ('Fender', 'fender@mail', '666');
INSERT INTO manufacturer(manufacturer_name, manufacturer_mail, manufacturer_phone) VALUES ('Gretsch', 'gretsch@mail', '777');

INSERT INTO guitar (guitar_name,guitar_brand, guitar_description, guitar_year, guitar_status, guitar_price, guitar_image_url, manufacturer_id_manufacturer) VALUES ('Les Paul','Gibson', 'Cool pour le rock', 2010, true, '2000 euros', 'assets/images/lespaul.jpg', 1);
INSERT INTO guitar (guitar_name,guitar_brand, guitar_description, guitar_year, guitar_status, guitar_price, guitar_image_url, manufacturer_id_manufacturer) VALUES ('Stratocaster','Fender', 'Cool pour alternative rock', 2015, true, '1200 euros', 'assets/images/stratocaster.jpg', 2);
INSERT INTO guitar (guitar_name,guitar_brand, guitar_description, guitar_year, guitar_status, guitar_price, guitar_image_url, manufacturer_id_manufacturer) VALUES ('White Penguin','Gretsch', 'La plus belle', 2018, true, '3000 euros', 'assets/images/whitepenguin.jpg', 3);
INSERT INTO guitar (guitar_name,guitar_brand, guitar_description, guitar_year, guitar_status, guitar_price, guitar_image_url, manufacturer_id_manufacturer) VALUES ('SG','Gibson', 'Let There Be Rock !', 2015, true, '1500 euros', 'assets/images/sg.jpg', 1);
INSERT INTO guitar (guitar_name,guitar_brand, guitar_description, guitar_year, guitar_status, guitar_price, guitar_image_url, manufacturer_id_manufacturer) VALUES ('White Falcon','Gretsch', 'Vintage', 1970, true, '7000 euros', 'assets/images/whitefalcon.jpg', 3);

INSERT INTO guitarmodel (guitar_id_guitar) VALUES (1);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (1);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (1);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (2);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (2);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (2);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (3);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (3);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (3);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (4);

INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName1', 'UserSurname1', 'UserPseudo1', 'openlibuser@gmail.com', 'toto', true);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName2', 'UserSurname2', 'UserPseudo2', 'Usermail2@test', 'toto', false);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName3', 'UserSurname3', 'UserPseudo3', 'Usermail3@test', 'toto', false);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName3', 'UserSurname3', 'UserPseudo3', 'Usermail3@test', 'toto', false);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName4', 'UserSurname4', 'UserPseudo4', 'Usermail4@test', 'toto', false);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName5', 'UserSurname5', 'UserPseudo5', 'Usermail5@test', 'toto', false);

INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('le Thu Apr 16 2020', 'Super Gratte', 8, 'UserName1', 1, 1);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('le Thu Apr 16 2020', 'Pas Top', 4, 'UserName2', 2, 2);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('le Thu Apr 16 2020', 'Acceptable', 6, 'UserName3', 3, 3);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('le Thu Apr 16 2020', 'Vraiment Mauvais', 1, 'UserName4', 1, 4);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('le Thu Apr 16 2020', 'Bon', 7, 'UserName5', 2, 5);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('le Thu Apr 16 2020', 'RocknRolllllll !!!!', 9, 'UserName1', 4, 1);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('le Thu Apr 16 2020', 'Excellent', 10, 'UserName5', 5, 2);