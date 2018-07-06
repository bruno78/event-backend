create table EVENTS (
    id SERIAL,
    event_description VARCHAR(250) NOT NULL,
    start_time DATE,
    end_time DATE,
    user_id INT,
);