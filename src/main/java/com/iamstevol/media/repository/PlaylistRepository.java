package com.iamstevol.media.repository;

import com.iamstevol.media.model.Playlist;
import com.iamstevol.media.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface PlaylistRepository extends JpaRepository<Playlist, BigInteger> {

    Optional<Playlist> findByName(String name);

    @Query(value ="select s from Song s where s.playlistId = ?1")
    Collection<Song> getSong(BigInteger playlistId);

    @Query(value = "select name from Song where playlistId = ?1")
    public List<String> del(BigInteger playlistId);
}
