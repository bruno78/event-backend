create table EVENTS (
    id SERIAL,
    event_description VARCHAR(250) NOT NULL,
    start_time VARCHAR(100) NOT NULL,
    end_time VARCHAR(100) NOT NULL,
    user_id INT NOT NULL
);