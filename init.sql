-- In this file, we will add additional indexes and segmented tables to the database
-- And we will also add the materialised views to the database

--! Note to self -> No need to index the primary key as it is already indexed by default

--* Add indexes to the tables

-- Add indexes to the User table

CREATE INDEX IF NOT EXISTS idx_user_username ON user (username);
CREATE INDEX IF NOT EXISTS idx_user_email ON user (email);
CREATE INDEX IF NOT EXISTS idx_user_password ON user (password);
CREATE INDEX IF NOT EXISTS idx_user_email_password ON user (email, password);
CREATE INDEX IF NOT EXISTS idx_user_username_password ON user (username, password);

-- Add indexes to the Event table

CREATE INDEX IF NOT EXISTS idx_event_name ON event (name);
CREATE INDEX IF NOT EXISTS idx_event_date ON event (date);
CREATE INDEX IF NOT EXISTS idx_event_time ON event (time);
CREATE INDEX IF NOT EXISTS idx_event_name_date ON event (name, date);
CREATE INDEX IF NOT EXISTS idx_event_name_time ON event (name, time);
CREATE INDEX IF NOT EXISTS idx_event_date_time ON event (date, time);
CREATE INDEX IF NOT EXISTS idx_event_name_date_time ON event (name, date, time);

-- Insert the Themes into the database

INSERT INTO theme (type, label) VALUES ('tabletop', 'Tabletop');
INSERT INTO theme (type, label) VALUES ('gaming', 'Gaming');
INSERT INTO theme (type, label) VALUES ('drinking', 'Drinking');
INSERT INTO theme (type, label) VALUES ('karaoke', 'Karaoke');

-- Insert the interests into the database

INSERT INTO interest (type, label) VALUES ('tabletop', 'Tabletop');
INSERT INTO interest (type, label) VALUES ('drinking', 'Drinking');
INSERT INTO interest (type, label) VALUES ('gaming', 'Gaming');
INSERT INTO interest (type, label) VALUES ('tabletop', 'Tabletop');
INSERT INTO interest (type, label) VALUES ('reading', 'Reading');
INSERT INTO interest (type, label) VALUES ('music', 'Music');
INSERT INTO interest (type, label) VALUES ('dnd', 'D&D');
INSERT INTO interest (type, label) VALUES ('partying', 'Partying');
INSERT INTO interest (type, label) VALUES ('sports', 'Sports');