
CREATE TABLE public.costumer (
	costumer_id serial NOT NULL,
	costumer_name varchar NOT NULL,
	costumer_surname varchar NOT NULL,
	costumer_pseudo varchar NOT NULL,
	costumer_mail varchar NOT NULL,
	costumer_password varchar NOT NULL,
	costumer_newsletter boolean,
	CONSTRAINT costumer_pk PRIMARY KEY (costumer_id)

);


CREATE TABLE public.reservation (
	reservation_id serial NOT NULL,
	guitar_brand varchar NOT NULL,
	guitar_name varchar NOT NULL,
	guitar_image_url varchar NOT NULL,
	delivery_date varchar NOT NULL,
	costumer_id_costumer integer,
	guitar_id_guitar integer,
	CONSTRAINT reservation_pk PRIMARY KEY (reservation_id)

);

CREATE TABLE public.costumerorder (
	costumerorder_id serial NOT NULL,
	costumerorder_date varchar NOT NULL,
	costumerorder_delivery_date varchar NOT NULL,
	guitar_name varchar NOT NULL,
	guitar_image_url varchar NOT NULL,
	guitar_id_guitar integer NOT NULL,
	costumer_id_costumer integer NOT NULL,
	guitarmodel_id_guitarmodel integer NOT NULL,
	CONSTRAINT costumerorder_pk PRIMARY KEY (costumerorder_id)

);

CREATE TABLE public.guitarmodel (
	guitarmodel_id serial NOT NULL,
	guitar_id_guitar integer,
	CONSTRAINT guitarmodel_pk PRIMARY KEY (guitarmodel_id)

);

CREATE TABLE public.guitar (
	guitar_id serial NOT NULL,
	guitar_name varchar NOT NULL,
	guitar_brand varchar NOT NULL,
	guitar_description varchar NOT NULL,
	guitar_year smallint NOT NULL,
	guitar_status boolean NOT NULL,
	guitar_price varchar NOT NULL,
	guitar_image_url varchar NOT NULL,
	manufacturer_id_manufacturer integer NOT NULL,
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
	CONSTRAINT guitarestimation_pk PRIMARY KEY (guitarestimation_id)

);


CREATE TABLE public.review (
	review_id serial NOT NULL,
	review_date varchar NOT NULL,
	review_comment varchar  NOT NULL,
	review_note integer  NOT NULL,
	review_costumer_name varchar  NOT NULL,
	guitar_id_guitar integer,
	costumer_id_costumer integer,
	CONSTRAINT review_pk PRIMARY KEY (review_id)
);


ALTER TABLE public.reservation ADD CONSTRAINT costumer_fk FOREIGN KEY (costumer_id_costumer)
REFERENCES public.costumer (costumer_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;


ALTER TABLE public.costumerorder ADD CONSTRAINT costumer_fk FOREIGN KEY (costumer_id_costumer)
REFERENCES public.costumer (costumer_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;


ALTER TABLE public.guitarmodel ADD CONSTRAINT guitar_fk FOREIGN KEY (guitar_id_guitar)
REFERENCES public.guitar (guitar_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE public.guitar ADD CONSTRAINT manufacturer_fk FOREIGN KEY (manufacturer_id_manufacturer)
REFERENCES public.manufacturer (manufacturer_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;



ALTER TABLE public.guitarestimation ADD CONSTRAINT costumer_fk FOREIGN KEY (costumer_id_costumer)
REFERENCES public.costumer (costumer_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;


ALTER TABLE public.reservation ADD CONSTRAINT guitar_fk FOREIGN KEY (guitar_id_guitar)
REFERENCES public.guitar (guitar_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;


