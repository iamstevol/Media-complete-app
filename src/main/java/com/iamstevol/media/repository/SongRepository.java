package com.iamstevol.media.repository;

import com.iamstevol.media.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface SongRepository extends JpaRepository<Song, BigInteger> {
}
