package com.iamstevol.media.service;

import com.iamstevol.media.model.Playlist;
import com.iamstevol.media.model.Song;

import java.math.BigInteger;
import java.util.Optional;

public interface PlaylistService {

    Iterable<Playlist> getAllPlaylists();

//    void getSongs(BigInteger playlistId);
    Playlist getPlaylistById(BigInteger playlistId);
    Optional<Playlist> createPlaylist(String name);
    void deletePlaylist(BigInteger playlistId);
    Iterable<Song> getSongs(BigInteger playlistId);
    void deleteSongs(BigInteger playlistId);
    Song addSong(BigInteger playlistId, Song song);
    boolean moveSong(BigInteger songId, BigInteger toPlaylistId);
    void deleteSong(BigInteger playlistId, BigInteger songId);
    Playlist getPlaylist(final BigInteger playlistId);
    Song getSong(final BigInteger songId);

}
