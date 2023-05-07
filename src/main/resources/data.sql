CREATE TABLE IF NOT EXISTS playlist
(
    id BIGINT auto_increment PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    createdOn DATE DEFAULT sysdate()
);

CREATE TABLE IF NOT EXISTS song
(
    id BIGINT auto_increment PRIMARY KEY,
    playlistId BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    coverUrl VARCHAR(255) NOT NULL,
    createdOn DATE DEFAULT sysdate(),
    FOREIGN KEY(playlistId) REFERENCES playlist(id) ON UPDATE CASCADE
);