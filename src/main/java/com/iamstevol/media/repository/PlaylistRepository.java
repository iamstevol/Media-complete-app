package com.iamstevol.media.repository;

import com.iamstevol.media.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface PlaylistRepository extends JpaRepository<Playlist, BigInteger> {

    Optional<Playlist> findByName(String name);
}
