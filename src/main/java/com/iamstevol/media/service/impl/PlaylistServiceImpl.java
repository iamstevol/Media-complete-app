package com.iamstevol.media.service.impl;

import com.iamstevol.media.exception.PlaylistNotFoundException;
import com.iamstevol.media.model.Playlist;
import com.iamstevol.media.model.Song;
import com.iamstevol.media.repository.PlaylistRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaylistServiceImpl {

    public final PlaylistRepository playlistRepository;

    public final EntityManager entityManager;

    public Iterable<Playlist> getAllPlaylists() {
        return playlistRepository.findAll();
    }

    public void getSongs(BigInteger playlistId) {
        List<Song> resultList = entityManager.createNamedQuery("songsByPlaylistId", Song.class)
                .setParameter(1, playlistId)
                .getResultList();
        System.out.println(resultList);
    }

    public Playlist getPlaylist(BigInteger id) {
        return playlistRepository.findById(id).orElseThrow(() -> new PlaylistNotFoundException(id));
    }
}
