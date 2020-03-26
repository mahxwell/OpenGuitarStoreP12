INSERT INTO image(image_url) VALUES ('imagegibson');
INSERT INTO image(image_url) VALUES ('imagefender');
INSERT INTO image(image_url) VALUES ('imagegretsch');


INSERT INTO manufacturer(manufacturer_name, manufacturer_mail, manufacturer_phone) VALUES ('Gibson', 'gibson@mail', '555');
INSERT INTO manufacturer(manufacturer_name, manufacturer_mail, manufacturer_phone) VALUES ('Fender', 'fender@mail', '666');
INSERT INTO manufacturer(manufacturer_name, manufacturer_mail, manufacturer_phone) VALUES ('Gretsch', 'gretsch@mail', '777');

INSERT INTO guitar (guitar_name, guitar_description, guitar_year, guitar_status, guitar_price, manufacturer_id_manufacturer, image_id_image) VALUES ('Les Paul', 'Cool pour le rock', 2010, true, '2000 euros', 1, 1);
INSERT INTO guitar (guitar_name, guitar_description, guitar_year, guitar_status, guitar_price, manufacturer_id_manufacturer, image_id_image) VALUES ('Stratocaster', 'Cool pour alternative rock', 2015, true, '1200 euros', 2, 2);
INSERT INTO guitar (guitar_name, guitar_description, guitar_year, guitar_status, guitar_price, manufacturer_id_manufacturer, image_id_image) VALUES ('White Penguin', 'La plus belle', 2018, true, '3000 euros', 3, 3);

INSERT INTO guitarmodel (guitar_id_guitar) VALUES (1);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (1);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (1);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (2);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (2);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (2);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (3);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (3);
INSERT INTO guitarmodel (guitar_id_guitar) VALUES (3);

INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName1', 'UserSurname1', 'UserPseudo1', 'Usermail1@test', 'toto', false);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName2', 'UserSurname2', 'UserPseudo2', 'Usermail2@test', 'toto', false);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName3', 'UserSurname3', 'UserPseudo3', 'Usermail3@test', 'toto', false);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName3', 'UserSurname3', 'UserPseudo3', 'Usermail3@test', 'toto', false);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName4', 'UserSurname4', 'UserPseudo4', 'Usermail4@test', 'toto', false);
INSERT INTO costumer (costumer_name, costumer_surname, costumer_pseudo, costumer_mail, costumer_password, costumer_newsletter) VALUES ('UserName5', 'UserSurname5', 'UserPseudo5', 'Usermail5@test', 'toto', false);

INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('03/05/19', 'Super Gratte', 8, 'UserName1', 1, 1);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('04/05/19', 'pas Top', 4, 'UserName2', 2, 2);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('05/05/19', 'Acceptable', 6, 'UserName3', 3, 3);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('06/05/19', ' NUl', 1, 'UserName4', 1, 4);
INSERT INTO review (review_date, review_comment, review_note, review_costumer_name, guitar_id_guitar, costumer_id_costumer) VALUES ('07/05/19', 'Bon', 7, 'UserName5', 2, 5);
