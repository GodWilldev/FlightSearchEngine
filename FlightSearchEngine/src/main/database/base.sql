CREATE DATABASE FLIGHTS;

CREATE TABLE SOME_FLIGHTS(
    id_flight   VARCHAR(20),
    villeDep    VARCHAR(20),
    villeArr    VARCHAR(20),
    dateDep     DATETIME,
    dateArr     DATETIME,
    company     VARCHAR(20),
    type        VARCHAR(20),
    price       DECIMAL(10,2),
    stopover    INTEGER
);

ALTER TABLE SOME_FLIGHTS
   ADD CONSTRAINT id_pk
   PRIMARY KEY (id_flight);

INSERT INTO SOME_FLIGHTS VALUES 
    (1, 'Casablanca',   'Paris', '2022-05-01 05:45', '2022-05-01 11:10', 'TUI fly', 'Aller simple', 509, 0),
    (2, 'Casablanca',   'Paris', '2022-05-01 16:40', '2022-05-01 21:40', 'Transavia', 'Aller simple', 1169, 0),
    (3, 'Casablanca',   'Paris', '2022-05-01 14:35', '2022-05-01 19:35', 'Air France', 'Aller simple', 1257, 0),
    (4, 'Casablanca',   'Paris', '2022-05-01 09:05', '2022-05-01 21:55', 'Royal Air Maroc', 'Aller simple', 5772, 1),

    (5, 'Casablanca',   'Londres', '2022-05-01 20:20', '2022-05-01 23:40', 'Wizz Air', 'Aller simple', 160, 0),
    (6, 'Casablanca',   'Londres', '2022-05-01 16:55', '2022-05-01 22:05', 'Tap Air Portugal', 'Aller simple', 1263, 1),
    (7, 'Casablanca',   'Londres', '2022-05-01 11:35', '2022-05-01 22:05', 'Tap Air Portugal', 'Aller simple', 1393, 1),
    (8, 'Casablanca',   'Londres', '2022-05-01 13:30', '2022-05-01 16:50', 'Royal Air Maroc', 'Aller simple', 1587, 0),

    (9, 'Rabat',   'Los Angeles', '2022-05-01 15:45', '2022-05-01 18:10', 'Iberia', 'Aller simple', 6761, 2),
    (10, 'Rabat',   'Los Angeles', '2022-05-01 15:30', '2022-05-01 21:40', 'Qatar Airways', 'Aller simple', 8122, 1),
    (11, 'Rabat',   'Los Angeles', '2022-05-01 09:05', '2022-05-01 21:06', 'Air Canada', 'Aller simple', 8633, 1),
    (12, 'Rabat',   'Los Angeles', '2022-05-01 09:05', '2022-05-01 16:45', 'Turkish Airlines', 'Aller simple', 8827, 1),

    (13, 'Rabat',   'Nice', '2022-05-01 17:00', '2022-05-01 23:45', 'Iberia', 'Aller simple', 1072, 1),
    (14, 'Rabat',   'Nice', '2022-05-01 16:55', '2022-05-01 23:55', 'Tap Air Portugal', 'Aller simple', 1124, 1),
    (15, 'Rabat',   'Nice', '2022-05-01 07:30', '2022-05-01 13:50', 'Air France', 'Aller simple', 4961, 1),
    (16, 'Rabat',   'Nice', '2022-05-01 09:05', '2022-05-01 16:45', 'Lufthansa', 'Aller simple', 2044, 1),

    (13, 'Rabat',   'Nice', '2022-06-01 17:00', '2022-05-01 23:45', 'Iberia', 'Aller simple', 1072, 1),
    (14, 'Rabat',   'Nice', '2022-06-01 16:55', '2022-05-01 23:55', 'Tap Air Portugal', 'Aller simple', 1124, 1),
    (15, 'Rabat',   'Nice', '2022-06-01 07:30', '2022-05-01 13:50', 'Air France', 'Aller simple', 4961, 1),
    (16, 'Rabat',   'Nice', '2022-06-01 09:05', '2022-05-01 16:45', 'Lufthansa', 'Aller simple', 2044, 1),

    (1, 'Casablanca',   'Paris', '2022-05-08 05:45', '2022-05-01 11:10', 'TUI fly', 'Aller simple', 509, 0),
    (2, 'Casablanca',   'Paris', '2022-05-08 16:40', '2022-05-01 21:40', 'Transavia', 'Air France', 1169, 0),
    (3, 'Casablanca',   'Paris', '2022-05-08 14:35', '2022-05-01 19:35', 'Air France', 'Aller simple', 1257, 0),
    (4, 'Casablanca',   'Paris', '2022-05-08 09:05', '2022-05-01 21:55', 'Royal Air Maroc', 'Aller simple', 5772, 1),

    (1, 'Casablanca',   'Paris', '2022-06-01 05:45', '2022-05-01 11:10', 'TUI fly', 'Aller simple', 509, 0),
    (2, 'Casablanca',   'Paris', '2022-06-01 16:40', '2022-05-01 21:40', 'Transavia', 'Air France', 1169, 0),
    (3, 'Casablanca',   'Paris', '2022-06-01 14:35', '2022-05-01 19:35', 'Air France', 'Aller simple', 1257, 0),
    (4, 'Casablanca',   'Paris', '2022-06-01 09:05', '2022-05-01 21:55', 'Royal Air Maroc', 'Aller simple', 5772, 1),

    (1, 'Casablanca',   'Paris', '2022-06-01 05:45', '2022-05-01 11:10', 'TUI fly', 'Aller simple', 509, 0),
    (2, 'Casablanca',   'Paris', '2022-06-01 16:40', '2022-05-01 21:40', 'Transavia', 'Air France', 1169, 0),
    (3, 'Casablanca',   'Paris', '2022-06-01 14:35', '2022-05-01 19:35', 'Air France', 'Aller simple', 1257, 0),
    (4, 'Casablanca',   'Paris', '2022-06-01 09:05', '2022-05-01 21:55', 'Royal Air Maroc', 'Aller simple', 5772, 1),

    (1, 'Casablanca',   'Paris', '2022-05-01 05:45', '2022-05-01 11:10', 'TUI fly', 'Aller simple', 509, 0),
    (2, 'Casablanca',   'Paris', '2022-05-01 16:40', '2022-05-01 21:40', 'Transavia', 'Air France', 1169, 0),
    (3, 'Casablanca',   'Paris', '2022-05-01 14:35', '2022-05-01 19:35', 'Air France', 'Aller simple', 1257, 0),
    (4, 'Casablanca',   'Paris', '2022-05-01 09:05', '2022-05-01 21:55', 'Royal Air Maroc', 'Aller simple', 5772, 1),

    (1, 'Casablanca',   'Paris', '2022-05-01 05:45', '2022-05-01 11:10', 'TUI fly', 'Aller simple', 509, 0),
    (2, 'Casablanca',   'Paris', '2022-05-01 16:40', '2022-05-01 21:40', 'Transavia', 'Air France', 1169, 0),
    (3, 'Casablanca',   'Paris', '2022-05-01 14:35', '2022-05-01 19:35', 'Air France', 'Aller simple', 1257, 0),
    (4, 'Casablanca',   'Paris', '2022-05-01 09:05', '2022-05-01 21:55', 'Royal Air Maroc', 'Aller simple', 5772, 1),

    (1, 'Casablanca',   'Paris', '2022-05-11 05:45', '2022-05-01 11:10', 'TUI fly', 'Aller simple', 509, 0),
    (2, 'Casablanca',   'Paris', '2022-05-11 16:40', '2022-05-01 21:40', 'Transavia', 'Air France', 1169, 0),
    (3, 'Casablanca',   'Paris', '2022-05-11 14:35', '2022-05-01 19:35', 'Air France', 'Aller simple', 1257, 0),
    (4, 'Casablanca',   'Paris', '2022-05-11 09:05', '2022-05-01 21:55', 'Royal Air Maroc', 'Aller simple', 5772, 1),
    ;