package com.iamstevol.media.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@Table(name = "playlist")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    private String name;

    @Column(name="created_on")
    @JsonProperty("created_on")
    private Date createdOn;

//    @ElementCollection(targetClass = java.util.HashSet.class) // specifies a collection of instances of a basic type or embeddable/nested class
    @OneToMany(cascade = CascadeType.ALL) // specifies a many-valued association with one-to-many multiplicity
    @JoinColumn // specifies a column for joining an entity association or element collection
    private Collection<Song> songs;
}
