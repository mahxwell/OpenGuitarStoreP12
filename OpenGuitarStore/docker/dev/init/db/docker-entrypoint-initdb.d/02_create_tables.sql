
CREATE TABLE public.costumer (
	costumer_id serial NOT NULL,
	costumer_name varchar NOT NULL,
	costumer_surname varchar NOT NULL,
	costumer_pseudo varchar NOT NULL,
	costumer_mail varchar NOT NULL,
	costumer_password varchar NOT NULL,
	CONSTRAINT costumer_pk PRIMARY KEY (costumer_id)

);


CREATE TABLE public.reservation (
	reservation_id serial NOT NULL,
	costumer_id_costumer integer,
	guitar_id_guitar integer,
	CONSTRAINT reservation_pk PRIMARY KEY (reservation_id)

);

CREATE TABLE public.costumerorder (
	costumerorder_id serial NOT NULL,
	costumerorder_date timestamp,
	costumerorder_delivery_date date,
	costumer_id_costumer integer,
	guitarmodel_id_guitarmodel integer,
	CONSTRAINT costumerorder_pk PRIMARY KEY (costumerorder_id)

);


CREATE TABLE public.guitarmodel (
	guitarmodel_id serial NOT NULL,
	guitar_id_guitar integer,
	CONSTRAINT guitarmodel_pk PRIMARY KEY (guitarmodel_id)

);

CREATE TABLE public.guitar (
	guitar_id serial NOT NULL,
	guitar_name varchar,
	guitar_description varchar,
	guitar_year smallint,
	guitar_status boolean,
	guitar_price integer,
	manufacturer_id_manufacturer integer,
	image_id_image integer,
	CONSTRAINT guitar_pk PRIMARY KEY (guitar_id)

);


CREATE TABLE public.manufacturer (
	manufacturer_id serial NOT NULL,
	manufacturer_name varchar NOT NULL,
	manufacturer_mail varchar NOT NULL,
	manufacturer_phone varchar NOT NULL,
	CONSTRAINT manufacturer_pk PRIMARY KEY (manufacturer_id)

);


CREATE TABLE public.guitarestimation (
	guitarestimation_id serial NOT NULL,
	guitarestimation_name varchar NOT NULL,
	guitarestimation_year varchar NOT NULL,
	costumer_id_costumer integer,
	image_id_image integer,
	CONSTRAINT guitarestimation_pk PRIMARY KEY (guitarestimation_id)

);


CREATE TABLE public.image (
	image_id serial NOT NULL,
	image_url varchar,
	CONSTRAINT image_pk PRIMARY KEY (image_id)

);

CREATE TABLE public.review (
	review_id serial NOT NULL,
	review_date date,
	review_comment varchar,
	review_note integer,
	guitar_id_guitar integer,
	costumer_id_costumer integer,
	CONSTRAINT review_pk PRIMARY KEY (review_id)
	
);

CREATE TABLE public.employe (
	employe_id serial NOT NULL,
	employe_name varchar NOT NULL,
	employe_surname varchar NOT NULL,
	employe_pseudo varchar NOT NULL,
	employe_mail varchar NOT NULL,
	employe_password varchar NOT NULL,
	status_id_status integer,
	CONSTRAINT employe_pk PRIMARY KEY (employe_id)

);

CREATE TABLE public.status (
	status_id serial NOT NULL,
	status_name smallint NOT NULL,
	CONSTRAINT status_pk PRIMARY KEY (status_id)

);


ALTER TABLE public.employe ADD CONSTRAINT status_fk FOREIGN KEY (status_id_status)
REFERENCES public.status (status_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE public.reservation ADD CONSTRAINT costumer_fk FOREIGN KEY (costumer_id_costumer)
REFERENCES public.costumer (costumer_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;


ALTER TABLE public.costumerorder ADD CONSTRAINT costumer_fk FOREIGN KEY (costumer_id_costumer)
REFERENCES public.costumer (costumer_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE public.costumerorder ADD CONSTRAINT guitarmodel_fk FOREIGN KEY (guitarmodel_id_guitarmodel)
REFERENCES public.guitarmodel (guitarmodel_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE public.costumerorder ADD CONSTRAINT costumerorder_uq UNIQUE (guitarmodel_id_guitarmodel);

ALTER TABLE public.guitarmodel ADD CONSTRAINT guitar_fk FOREIGN KEY (guitar_id_guitar)
REFERENCES public.guitar (guitar_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE public.guitar ADD CONSTRAINT manufacturer_fk FOREIGN KEY (manufacturer_id_manufacturer)
REFERENCES public.manufacturer (manufacturer_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE public.guitar ADD CONSTRAINT image_fk FOREIGN KEY (image_id_image)
REFERENCES public.image (image_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE public.guitar ADD CONSTRAINT guitar_uq UNIQUE (image_id_image);

ALTER TABLE public.guitarestimation ADD CONSTRAINT costumer_fk FOREIGN KEY (costumer_id_costumer)
REFERENCES public.costumer (costumer_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE public.guitarestimation ADD CONSTRAINT image_fk FOREIGN KEY (image_id_image)
REFERENCES public.image (image_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;


ALTER TABLE public.guitarestimation ADD CONSTRAINT guitarestimation_uq UNIQUE (image_id_image);

ALTER TABLE public.reservation ADD CONSTRAINT guitar_fk FOREIGN KEY (guitar_id_guitar)
REFERENCES public.guitar (guitar_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;


