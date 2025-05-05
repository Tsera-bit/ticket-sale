-- Создание таблицы пользователей
CREATE TABLE users (
                       id BIGSERIAL PRIMARY KEY,
                       username VARCHAR(255) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       role VARCHAR(50) NOT NULL
);

-- Создание таблицы событий
CREATE TABLE events (
                        id BIGSERIAL PRIMARY KEY,
                        title VARCHAR(255) NOT NULL,
                        description TEXT,
                        date TIMESTAMP NOT NULL,
                        location VARCHAR(255) NOT NULL,
                        seller_id BIGINT NOT NULL,
                        CONSTRAINT fk_event_seller FOREIGN KEY (seller_id) REFERENCES users(id) ON DELETE CASCADE
);

-- Создание таблицы билетов
CREATE TABLE tickets (
                         id BIGSERIAL PRIMARY KEY,
                         event_id BIGINT NOT NULL,
                         buyer_id BIGINT,
                         price INTEGER NOT NULL,
                         quantity INTEGER NOT NULL,
                         CONSTRAINT fk_ticket_event FOREIGN KEY (event_id) REFERENCES events(id) ON DELETE CASCADE,
                         CONSTRAINT fk_ticket_buyer FOREIGN KEY (buyer_id) REFERENCES users(id) ON DELETE SET NULL
);
