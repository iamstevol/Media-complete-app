package com.iamstevol.media.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "song")
//@NamedNativeQuery(name = "songsByPlaylistId", query = "select id, name, playlistId, coverUrl, createdOn from song s where s.playlistId = ?", resultClass = Song.class)
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    @Column(name = "playlistId")
    @JsonProperty("playlist_id")
    private BigInteger playlistId;

    private String name;

    @Column(name = "coverUrl")
    @JsonProperty("cover_url")
    private String coverUrl;

    @Column(name = "createdOn")
    @JsonProperty("created_on")
    private Date createdOn;
}

